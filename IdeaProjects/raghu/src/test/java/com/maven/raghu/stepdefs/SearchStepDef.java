package com.maven.raghu.stepdefs;

import com.maven.raghu.pageObjects.Home;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchStepDef {
   Home home = new Home();

    @Given("^User is on Homepage$")
    public void userIsOnHomepage() {
    }

    @When("^User select \"([^\"]*)\"$")
    public void userSelect(String csf) throws Throwable {
      home.setSearchBox(csf);
    }

    @Then("^User must able to see filtered product$")
    public void userMustAbleToSeeFilteredProduct() {
    }
    @When("^User hover selected product \"([^\"]*)\"$")
    public void userHoverSelectedProduct(String csf) throws Throwable {
        home.setCustomerSelFilter(csf);
    }

    @And("^User  able to click \"([^\"]*)\"$")
    public void userAbleToClick(String csf)  {
        home.setCustomerSubFilter(csf);
    }
}
