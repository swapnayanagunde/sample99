
Feature: Admin Login
  I want to use this template to check orangeHRM Admin Login

  @tag1
  Scenario: check Admin Login with valid data
    Given I open Browser with url "http://orangehrm.qedgetech.com"
    Then I should see Login page
    When I Enter Username as "Admin"
    And I Enter Password as "Qedge123!@#"
    And I click Login
    Then I should see Admin Home page
    When I close Browser
