Feature: ChildModule2

  Scenario: Execute ChildModule2
    Given ChildModule1 is compiled
    And built
    And tested
    When control falls into ChildModule2
    Then run class files
    And generate report
