Feature: Logout from Application
  I want to use this template for Logout from application


  @Logout
  Scenario Outline: Positive Test of Logout from Application
  
    Given I landed on Ecommerce Page
    When Logged in with username <name> and password <password>
    And "Swag Labs" Header Label message is displayed on Homepage
    Then Logged out from Application
    And Close the Browser

    Examples: 
      | name  				|  password		    |
      | standard_user |  secret_sauce   | 

