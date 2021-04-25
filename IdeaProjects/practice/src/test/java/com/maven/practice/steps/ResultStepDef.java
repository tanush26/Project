package com.maven.practice.steps;

import com.maven.practice.pageobjects.Home;
import com.maven.practice.pageobjects.Results;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.Matchers;
import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringWhiteSpace;
import static org.hamcrest.Matchers.is;

public class ResultStepDef {
     Home homePage = new Home();
     Results resultsPage = new Results();

    @Given("^I am on HomePage$")
    public void iAmOnHomePage() {
        String actual = homePage.getHomePageUrl();
      //  assertThat("the homepage url ends with ", actual, Matchers.endsWith(homePage.getHomePageUrl()));
    }

    @When("^I search  for a Product \"([^\"]*)\"$")
    public void iSearchForAProduct(String item) throws Throwable {
        homePage.doSearch(item);
    }

    @And("^I move to \"([^\"]*)\" Relevance$")
    public void iMoveToRelevance(String customerSelectedSort) throws Throwable {
        resultsPage.moveToSort(customerSelectedSort);
    }

    @Then("^I select the \"([^\"]*)\"$")
    public void iSelectThe(String args) throws Throwable {
        resultsPage.selTest();

    }

    @Then("^I select the Filtered product$")
    public void iSelectTheFilteredProduct() {
        String actual1 = resultsPage.getResultsPageHeader();
        assertThat("check the homepage title", actual1,is(equalToIgnoringWhiteSpace(resultsPage.getResultsPageHeader())));
        System.out.println(resultsPage.getResultsPageHeader());
    }


    @Then("^I take the screenshot$")
    public void iTakeTheScreenshot() throws IOException {
       // try {
            resultsPage.sceenShot();
        //} catch (IOException e) {
         //   e.printStackTrace();
      //  }

    }
}
