Feature: Validate Products Page Validations

Scenario Outline: To Verify Whether Products Page is Displayed And Validate All the Buttons are Displayed.

Given Login to NopEcommerce With Valid Login Details
Then Navigate to "<menuNavigation>" from Homepage 
Then Verify Current Title of the Page is "<title>"
And  Search Value With And Verify Whether it is Displayed in the Grid Or Not
         |$100 Physical Gift Card|
##Then Click On "<Button>" Button from the ProductsPage



Then Close Browser
Examples:

                   | Button |  menuNavigation  |                       title                                          |  
                   | Create | Catalog~Products | Products / nopCommerce administration |
                   
                   