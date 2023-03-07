Feature: To Validate Login Functionality of Facebook

	@Sanity @Smoke
  Scenario: to check the login invalid Email and valid Password
   
   When User to launch the Url
    #One-D Map
    And To fill the email in the User Field
      | email1 | selvaskkr@gmail.com |
      | email2 | selvas@gmail.com    |
      | email3 | java123@gmail.com   |
      | email4 | maven34@gmail.com   |
    #Two-D Map
    And To fill the password in the password Field
      | pass1       | pass2     | pass3   |
      | selvas3096  | selva9630 | java123 |
      |    54789895 | maven7836 | sql234  |
      | selenium123 | 879432125 | asfjwe  |
    And user have to click login button
    
    
    @Smoke @Regression
    Scenario: To check the valid Email and invalid Password
    When User to launch the Url
    And To fill the email in the email field
    And To fill the password in the Password field
    And User to Click Login button
    
