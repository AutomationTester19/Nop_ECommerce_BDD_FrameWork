$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/DIGVIJAY/workspace/Nop_ECommerce_Cucumber_FrameWork/Resources/Scenarios/productsPageValidations.Feature");
formatter.feature({
  "line": 1,
  "name": "Validate Products Page Validations",
  "description": "",
  "id": "validate-products-page-validations",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "To Verify Whether Products Page is Displayed And Validate All the Buttons are Displayed.",
  "description": "",
  "id": "validate-products-page-validations;to-verify-whether-products-page-is-displayed-and-validate-all-the-buttons-are-displayed.",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "Login to NopEcommerce With Valid Login Details",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Navigate to \"\u003cmenuNavigation\u003e\" from Homepage",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Verify Current Title of the Page is \"\u003ctitle\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Search Value With And Verify Whether it is Displayed in the Grid Or Not",
  "rows": [
    {
      "cells": [
        "$100 Physical Gift Card"
      ],
      "line": 9
    }
  ],
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 10,
      "value": "##Then Click On \"\u003cButton\u003e\" Button from the ProductsPage"
    }
  ],
  "line": 14,
  "name": "Close Browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "validate-products-page-validations;to-verify-whether-products-page-is-displayed-and-validate-all-the-buttons-are-displayed.;",
  "rows": [
    {
      "cells": [
        "Button",
        "menuNavigation",
        "title"
      ],
      "line": 17,
      "id": "validate-products-page-validations;to-verify-whether-products-page-is-displayed-and-validate-all-the-buttons-are-displayed.;;1"
    },
    {
      "cells": [
        "Create",
        "Catalog~Products",
        "Products / nopCommerce administration"
      ],
      "line": 18,
      "id": "validate-products-page-validations;to-verify-whether-products-page-is-displayed-and-validate-all-the-buttons-are-displayed.;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 18,
  "name": "To Verify Whether Products Page is Displayed And Validate All the Buttons are Displayed.",
  "description": "",
  "id": "validate-products-page-validations;to-verify-whether-products-page-is-displayed-and-validate-all-the-buttons-are-displayed.;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "Login to NopEcommerce With Valid Login Details",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Navigate to \"Catalog~Products\" from Homepage",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Verify Current Title of the Page is \"Products / nopCommerce administration\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Search Value With And Verify Whether it is Displayed in the Grid Or Not",
  "rows": [
    {
      "cells": [
        "$100 Physical Gift Card"
      ],
      "line": 9
    }
  ],
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 10,
      "value": "##Then Click On \"\u003cButton\u003e\" Button from the ProductsPage"
    }
  ],
  "line": 14,
  "name": "Close Browser",
  "keyword": "Then "
});
formatter.match({
  "location": "BasePageStepDefinations.login_to_eCommerce()"
});
formatter.result({
  "duration": 16656707200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Catalog~Products",
      "offset": 13
    }
  ],
  "location": "BasePageStepDefinations.menuNavigation(String)"
});
formatter.result({
  "duration": 2956558000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Products / nopCommerce administration",
      "offset": 37
    }
  ],
  "location": "BasePageStepDefinations.verifyTitleofAnyPage(String)"
});
formatter.result({
  "duration": 17249500,
  "status": "passed"
});
formatter.match({
  "location": "productsStepDefination.searchValue(DataTable)"
});
formatter.result({
  "duration": 210846600,
  "status": "passed"
});
formatter.match({
  "location": "BasePageStepDefinations.tearDown()"
});
formatter.result({
  "duration": 760867100,
  "status": "passed"
});
});