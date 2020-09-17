package com.maven.arrrgos.stepdefs;

import com.maven.arrrgos.pageobjects.Search;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class SearchStepDef {
    Search search = new Search();

    @Given("^I am on Homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I select \"([^\"]*)\"$")
    public void iSelect(String csp) throws Throwable {
       search.chosenProduct(csp);
    }

}
