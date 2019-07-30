Feature: Login to the website

  Scenario: Going to the login page

  Given I go to www.amazon.com
  When I hover to the sign in button
  And I wait till th dropdwon is visible
  And I click on sign in button
  Then I should be transferred to login page