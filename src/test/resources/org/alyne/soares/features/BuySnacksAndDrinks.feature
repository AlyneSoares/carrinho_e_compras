Feature: Buy Snacks and Drinks

Scenario: Buy Rissoles and Drinks

Given I navigate to ShopCart-4all
When I add drinks to my cart
When I add Rissole to my cart
When I increase the rissole's quantity in 9
When I decrease the rissole's quantity in 5
Then I confirm the total value of my cart