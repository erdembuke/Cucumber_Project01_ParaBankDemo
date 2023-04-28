Feature: Bill Pay Functionality

  Background:
    Given navigate to ParaBank
    When enter valid username "erdembuke012" and password "erdem1233"

  Scenario Outline: Paying bill successfully
    And user should navigate Bill Pay "<payeeName>" , "<accNo>" , "<amount>" and fill all fields correctly
    Then user should pay successfully
    Examples:
      | payeeName     | accNo | amount |
      | electric bill | 13579 | 85     |
      | water bill    | 13578 | 45     |
      | gas bill      | 13577 | 120    |

