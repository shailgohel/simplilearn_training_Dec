package stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstFeatureFile {

	@Given("I want to write a step with precondition")
	public void some_other_precondition1() {
		System.out.println("some precondition");

	}

	@Given("some other precondition")
	public void some_other_precondition() {
	}

	@When("I complete action")
	public void i_complete_action() {
	}

	@When("some other action")
	public void some_other_action() {
	}

	@When("yet another action")
	public void yet_another_action() {
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
	}

	@Then("check more outcomes")
	public void check_more_outcomes() {
	}

}
