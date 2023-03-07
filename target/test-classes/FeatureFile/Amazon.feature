@Feature2
Feature: To Validated the Username and Password for Amazon Login
	
	@Sanity 
  Scenario: To Valid the username and password
    When User to launch the Amazon Application
    And User to Click Signin button
    And To fill the Username in the user field
    And User to Click Continue button
    
