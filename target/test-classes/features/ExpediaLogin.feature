Feature: Login feature

  @RegressionTest
  Scenario Outline: veryfy login user
   Given : Access the Expedia website
    When : Enter the <UserName> and <password>
    Then : verify successfull login
    Examples:
      |UserName   |password |
      |test       |testuser |
