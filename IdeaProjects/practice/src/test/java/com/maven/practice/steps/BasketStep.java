package com.maven.practice.steps;


import com.maven.practice.pageobjects.Basket;
import com.maven.practice.pageobjects.Home;
import com.maven.practice.pageobjects.Results;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.Matchers;

import static org.hamcrest.MatcherAssert.assertThat;

public class BasketStep {
     Home home = new Home();
     Results resultsPage = new Results();
     Basket basketPage = new Basket();

    @Given("^I am on home page$")
    public void iAmOnHomePage() {
        String actual =  home.getHomePageUrl();
        assertThat("the homepage url ends with ",actual, Matchers.endsWith(home.getHomePageUrl()));
    }

    @When("^I search  for  product \"([^\"]*)\"$")
    public void iSearchForProduct(String item) throws Throwable {
     home.doSearch(item);
    }

    @And("^I select the filtered item$")
    public void iSelectTheFilteredItem() {

        resultsPage.selTest();
    }

    @And("^I add product to basket$")
    public void iAddProductToBasket() {
      //  basketPage.selectionTest();

    }

    @Then("^I can see the product in trolley$")
    public void iCanSeeTheProductInTrolley() {
    }
}
