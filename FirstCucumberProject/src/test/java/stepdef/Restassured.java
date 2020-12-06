package stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import org.apache.http.message.BasicHttpEntityEnclosingRequest;
import org.junit.Assert;

import base.BaseClass;

public class Restassured extends BaseClass{
	
		
		Response res;
		@Given("I am in resqres site")
		public void i_am_in_resqres_site() {
		
			RestAssured.baseURI = "https://reqres.in/";
		
		}
		@When("I use OAUth")
		public void i_use_oa_uth() {
			given().auth().oauth2("12345").queryParam("page", "2");
			logger.info("Given step is executed");
		}
		@When("I execute GET method for user listing")
		public void i_execute_get_method_for_user_listing() {
			res = when().get("api/users");
			//System.out.println(res.body().asPrettyString());
			logger.info("Status code is: "+res.statusCode());
			logger.info(res.body().asPrettyString());
		}
		@Then("total should be tweleve")
		public void total_should_be_tweleve() {
			JsonPath jsonPath = res.jsonPath();
			System.out.println(jsonPath.get("total"));
			Assert.assertEquals(12, jsonPath.get("total"));
			try{
				Assert.assertEquals("Michael", jsonPath.get("data[1].first_name"));
				logger.info("Assertion match");
			}
			catch(Exception e){
				logger.error(e);
			}
		}
		@Then("status code should be two hundred")
		public void status_code_should_be_two_hundred() {
			Assert.assertEquals(200, res.statusCode());
		}




}
