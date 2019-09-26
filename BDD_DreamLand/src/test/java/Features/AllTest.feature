Feature: Automate dreamland project
Description: this testing to check end to end process 
Scenario: Cutomer place an order 

Given  user is on home page
When he search the books
And choose to buy the first item
And moves to checkout from cart
And select payment method 
And place the order 
