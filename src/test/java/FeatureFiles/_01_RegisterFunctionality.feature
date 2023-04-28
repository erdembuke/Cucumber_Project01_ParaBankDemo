Feature: Register Functionality

  Scenario: New Register
    Given navigate to ParaBank
    When register valid username and password
      | firstName        | erdem01      |
      | lastName         | buke01       |
      | address          | beykoz       |
      | city             | istanbul     |
      | state            | ist          |
      | zipCode          | 34800        |
      | phoneNumber      | 5354451987   |
      | ssn              | 5411148792   |
      | registerUsername | erdembuke012 |
      | registerPassword | erdem1233    |
      | confirm          | erdem1233    |

    Then user should register successfully
