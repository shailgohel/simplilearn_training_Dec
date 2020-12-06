Feature: I want to test rest assured with cucumber-bdd

Scenario: Check reqres.in API 
 Given I am in resqres site
	When I use OAUth
    When I execute GET method for user listing
    Then total should be tweleve
    And status code should be two hundred

