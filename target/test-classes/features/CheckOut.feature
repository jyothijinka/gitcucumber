Feature: place the order for products
@PlaceOrder
Scenario Outline: Search experience for product search in both home and offer page


Given User is on GreenKart Landing page
When User Searched with short Name <Name> and extracted actual name of product
And Added "3" items of selected product to cart
Then User proceeds to check out and validate the <Name> items in checkout page
And verify user has ability to enter promo code and place the order
Examples:

|Name|
|Tom|
|beet|
|car|
|bea|




