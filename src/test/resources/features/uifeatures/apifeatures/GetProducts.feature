Feature: Get all products from the API
  @APITestcases
  Scenario: Verify the Get API for the products
    Given I hit the URL of GET products API endpoint
    When I pass the URL of product in the request
    Then I receive the response code as 200

  @APITestcases
  Scenario Outline: : Verify the Get API for the first product
    Given I hit the URL of GET products API endpoint
    When I pass the URL of product in the request
    Then verify the rate of first product is <FirstProductRate>
    Examples:
      | FirstProductRate |
      | 3.9              |
