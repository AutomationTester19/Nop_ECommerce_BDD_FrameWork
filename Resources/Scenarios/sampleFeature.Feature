Feature: Verify Data Table Concept Using Test Data

Scenario Outline: Using Data Table Concept

Given Login to NopEcommerce With Valid Login Details
Then Navigate to "<menuNavigation>" from Homepage 
Then Verify Current Title of the Page is "<title>"
And  Enter Values in Product Page
         | $100 Physical Gift Card |
Then Click On "<Button>" Button from the ProductsPage
 And Close Browser       
Examples:

                   | Button |  menuNavigation  |                       title                                      |
                   | Create | Catalog~Products | Products / nopCommerce administration | 
                   
