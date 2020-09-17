$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("result.feature");
formatter.feature({
  "line": 3,
  "name": "",
  "description": "As a customer\nI want to select a product\nSo that i can view filtered product",
  "id": "",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@result"
    }
  ]
});
formatter.before({
  "duration": 9263084216,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "",
  "description": "",
  "id": ";",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "I am on Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I select \"women\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I select \"Clothing\" category",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I select \"Shirts and Tops\" categoryFilters",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I select filters \"Tu\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I select filters \"£5 - £10\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I select randomProduct \" \"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I select size \"8\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I add refined product to basket",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchStepDef.iAmOnHomepage()"
});
formatter.result({
  "duration": 143948932,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "women",
      "offset": 10
    }
  ],
  "location": "SearchStepDef.iSelect(String)"
});
formatter.result({
  "duration": 245963474,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Clothing",
      "offset": 10
    }
  ],
  "location": "ResultStepDef.iSelectCategory(String)"
});
formatter.result({
  "duration": 5385128398,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Shirts and Tops",
      "offset": 10
    }
  ],
  "location": "ResultStepDef.iSelectCategoryFilters(String)"
});
formatter.result({
  "duration": 2514402533,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Tu",
      "offset": 18
    }
  ],
  "location": "ResultStepDef.iSelectFilters(String)"
});
formatter.result({
  "duration": 5075995877,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "£5 - £10",
      "offset": 18
    }
  ],
  "location": "ResultStepDef.iSelectFilters(String)"
});
formatter.result({
  "duration": 4783965520,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": " ",
      "offset": 24
    }
  ],
  "location": "BasketStepDef.iSelectRandomProduct(String)"
});
formatter.result({
  "duration": 8323937855,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "8",
      "offset": 15
    }
  ],
  "location": "BasketStepDef.iSelectSize(String)"
});
formatter.result({
  "duration": 397808844,
  "status": "passed"
});
formatter.match({
  "location": "BasketStepDef.iAddRefinedProductToBasket()"
});
formatter.result({
  "duration": 2256681701,
  "status": "passed"
});
formatter.after({
  "duration": 34215,
  "status": "passed"
});
});