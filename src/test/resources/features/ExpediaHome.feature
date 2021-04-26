Feature: Home feature

  @Sanitytest
  Scenario Outline: verify Home user
    Given : Access the Expedia website <javaeight>
    When : Click on the <xyz> button
    Then : verify desired <output>
    Examples:
      |javaeight| xyz | output |
      |"this is string1  " | 10 |   test    |
      |"This is String 2 " | 20  |   test2  |
