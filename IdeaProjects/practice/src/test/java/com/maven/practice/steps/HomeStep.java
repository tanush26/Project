package com.maven.practice.steps;

import com.maven.practice.pageobjects.Home;
import com.maven.practice.pageobjects.Results;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.Matchers;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringWhiteSpace;
import static org.hamcrest.Matchers.is;

public class HomeStep {
     Home homePage = new Home();
    Results resultsPage = new Results();

    @Given("^I am on Homepage$")
    public void iAmOnHomepage() {
        String actual =  homePage.getHomePageUrl();
        assertThat("the homepage url ends with ",actual, Matchers.endsWith(homePage.getHomePageUrl()));
    }
    @When("^I search  for a product \"([^\"]*)\"$")
    public void iSearchForAProduct(String item) throws Throwable {
        homePage.doSearch(item);
    }


    @Then("^I select the filtered product$")
    public void iSelectThefilteredProduct() {

    }
}
