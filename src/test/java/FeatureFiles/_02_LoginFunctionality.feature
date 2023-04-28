Feature: Login Functionality

  Background:
    Given navigate to ParaBank

  Scenario Outline: Login with valid informations
    When enter valid username "<username>" and password "<password>"
    And  user should login successfully
    Then user should be logout
    Examples:
      | username     | password  |
      | erdembuke012 | erdem1233 |


  Scenario Outline: Login with invalid informations
    When enter invalid username "<username>" and password "<password>"
    Then  error message should be displayed
    Examples:
      | username     | password |
      | acdb1234     | axpwoa23 |
      | erdembuke012 | asadasxq |

