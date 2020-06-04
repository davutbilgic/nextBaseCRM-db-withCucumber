#User Story01
Feature: Users should be able to login

#  Scenario: Login as helpdesk
#    Given the user is on the login page
#    When the user enter "helpdesk" information
#    Then the user should be able to login
#
#  Scenario: Login as hr
#    Given the user is on the login page
#    When the user enter "hr" information
#    Then the user should be able to login
#
#  Scenario: Login as marketing
#    Given the user is on the login page
#    When the user enter "marketing" information
#    Then the user should be able to login

  Scenario: login as a driver user
    Given the user is on the login page
    When the user logs in using "helpdesk1@cybertekschool.com" and "UserUser"
    Then the user should be able to login
    And the title contains "(1) Portal"

#comment
