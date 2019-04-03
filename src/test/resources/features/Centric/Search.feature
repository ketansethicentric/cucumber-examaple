@regression
Feature: Search

  @us
  Scenario: Customer place an order by purchasing an item from shop by category
    Given user is on Google Page
    When he search for "Centric Consulting US"

  @india
  Scenario: Customer place an order by purchasing an item from shop by category
    Given user is on Google Page
    When he search for "Centric Consulting India"

  @uscentric
  Scenario: Customer place an order by purchasing an item from shop by category
    Given user is on Google Page
    When he search for "US Centric Consulting"

  @indiacentric
  Scenario: Customer place an order by purchasing an item from shop by category
    Given user is on Google Page
    When he search for "India Centric Consulting"

  @centricconsulting
  Scenario: Customer place an order by purchasing an item from shop by category
    Given user is on Google Page
    When he search for "Centric Consulting"
