Feature: Ews login test and WiFi Configuration

  Background:
    Given Enter the url
    And I has to ask enter click on signin option
    And I has to ask enter the password
    Then Login should be successfull

  Scenario Outline: Created Device User Accounts
    When I select securityTab
    And It has to select Accesscontrol
    And It has to click on New
    And It has to enter the "<DisplayName>"
    And Send to the "<AccessCode>"
    Then It has to click ok button

    Examples:
      | DisplayName | AccessCode |
      | user1       | 1111       |
      | user2       | 2222       |
      | user3       | 3333       |
      | user4       | 4444       |
      | user5       | 5555       |
