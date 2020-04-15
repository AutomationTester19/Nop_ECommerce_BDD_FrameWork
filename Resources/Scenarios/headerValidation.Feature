Feature: Validate Page Header is Displayed Or Not

Scenario Outline: Enter Valid login Details & Validate Catlog & Products Page Header is Displayed or Not

Given Login to NopEcommerce With Valid Login Details
Then Verify Header "<header>" is Displayed Or Not
Then Navigate to "<menuNavigation>" from Homepage 
Then Verify Header "<treeCategory>" is Displayed Or Not
Then Close Browser


Examples: 
                     | header |            menuNavigation   | treeCategory |
                     | Dashboard |    Catalog~Products  |  Products |
                    











