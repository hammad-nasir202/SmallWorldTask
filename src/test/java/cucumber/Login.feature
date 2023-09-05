
@tag
Feature: Login to Application
  I want to use this template for login in application


  @Login
  Scenario Outline: Positive Test of Login to Application
  
    Given I landed on Ecommerce Page
    When Logged in with username <name> and password <password>
    Then "Swag Labs" Header Label message is displayed on Homepage
    And Close the Browser
    

    Examples: 
      | name  				|  password		    |
      | standard_user |  secret_sauce   | 

