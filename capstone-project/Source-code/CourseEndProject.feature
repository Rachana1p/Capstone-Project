Feature: API Testing for Sporty Shoes Website

  Scenario: Retrieve the list of all products
    Given I have API endpoint to retrieve all products
    When I make a GET request to the product endpoint
    Then I should receive a valid response with status code
    
   Scenario: Retrieve all registered users
    Given I have API endpoint to retrieve all registered users
    When I make a GET request to retrieve all users
    Then I should receive a valid response with status
    
  Scenario: Add a product
    Given I have API endpoint to add a product
    When I make a POST request to add a product
    Then I should receive valid response with status code
    
    Scenario: Update a product
    Given I have API endpoint to update a product
    When I make a PUT request to update a product
    Then I should receive a valid response status code

  Scenario: Delete a product
    Given I have API endpoint to delete a product
    When I make a DELETE request to delete a product
    Then I should receive a response with status code




