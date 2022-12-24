Feature: Search and place the order for products
@offers
Scenario Outline: Search experience for product search in both home and offer page
Given User is on GreenKart Landing page
When User Searched with short Name <Name> and extracted actual name of product
Then User Searched for <Name> shortName in offers page to check if product exist with same name
And Validate product name in offers page matches with landing page
Examples:
|Name|
|Tom|
|str|
|pot|


