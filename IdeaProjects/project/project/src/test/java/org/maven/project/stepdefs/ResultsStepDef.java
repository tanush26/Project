package org.maven.project.stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.maven.project.pageobjects.ResultsPage;
import org.hamcrest.Matchers;
import static org.hamcrest.MatcherAssert.assertThat;

public class ResultsStepDef {
    ResultsPage resultsPage = new ResultsPage();

    @And("^User selected \"([^\"]*)\" in category$")
    public void userSelectedInCategory(String customerSelectedCategory) throws Throwable {
        resultsPage.category(customerSelectedCategory);
    }

    @And("^User selected \"([^\"]*)\" in price$")
    public void userSelectedInPrice(String customerSelectedPriceAndBrand) throws Throwable {
        resultsPage.priceAndBrandFilter(customerSelectedPriceAndBrand);
    }

    @And("^User selected \"([^\"]*)\" in brands$")
    public void userSelectedInBrands(String customerSelectedPriceAndBrand) throws Throwable {
        resultsPage.priceAndBrandFilter(customerSelectedPriceAndBrand);
    }

    @And("^Add filtered Product to basket$")
    public void addFilteredProductToBasket() throws InterruptedException {
        resultsPage.products();
        resultsPage.basket();
        resultsPage.goToTrolley();
        //fsrFocusFirst
    }

    @Then("^Verify the product in trolley$")
    public void verifyTheProductInTrolley() {
        String actual = resultsPage.verify();
        assertThat("verifying filtered product is in trolley", actual, Matchers.anything(resultsPage.verify()));
    }
}



