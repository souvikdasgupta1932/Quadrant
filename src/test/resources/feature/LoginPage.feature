


#Author: Souvik Dasgupta

 @Test
Feature: Verify user is able to login in with correct Username and Password
Scenario: Verify user is able to login in with correct Username and Password
    Given user is on the Login Page
    And the user enters "souvik@reddiffmail.com"
    Then user enters password "Password"
    Then user clicks on im not robot check box
    Then user clicks on "Login" button
    Then user verify error mesage "Email or Password details do not match"