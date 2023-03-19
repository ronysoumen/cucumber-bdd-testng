@HRMLogin
Feature: Login to HRM Application
  I want to use this template for HRM Login page

  @LoginValidCredentials
  Scenario:Validate if user is able to login after clicking LoginValidCredentials
    Given User is on login page
    When User enters username as "Admin" and password as "admin123"
    Then User should be able to login successfully
    When User enters username as "Admin" and password as "admin123"