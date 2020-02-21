Feature: Login User

  Scenario: Login User
    Then Input Login
    Then Input Password
    Then Click Checkbox
    Then Click "Войти" button
    Then Content with "Илья" visible
