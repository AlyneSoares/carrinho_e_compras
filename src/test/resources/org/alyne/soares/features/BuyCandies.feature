Feature: Buy Candies

@candies
Scenario: Buy Brigadeiros and Alfajor

Given I navigate to ShopCart-4all
When I add Brigadeiro to my cart
When I add Alfajor to my cart
When I increase the brigadeiro's quantity in 4
Then I purchase the candies
