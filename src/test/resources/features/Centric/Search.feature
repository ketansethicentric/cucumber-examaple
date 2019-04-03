@regression
Feature: Search

  Scenario: Customer searches for Centric Consulting
    Given user is on Google Page
    When he search for "Centric Consulting US"

  Scenario: Customer searches for Centric Consulting
    Given user is on Google Page
    When he search for "Centric Consulting India"

  Scenario: Customer searches for Centric Consulting
    Given user is on Google Page
    When he search for "US Centric Consulting"

  Scenario: Customer searches for Centric Consulting
    Given user is on Google Page
    When he search for "India Centric Consulting"

  Scenario: Customer searches for Centric Consulting
    Given user is on Google Page
    When he search for "Centric Consulting"
