Feature: Kurtosys Application

  Scenario: Kurtosys 
    Given launch url
    And click white papers
    When verify title reads
    And click white paper title
    And fill details
    Then click send copy
    And verify copy send