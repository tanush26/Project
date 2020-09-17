package com.maven.arrrgos.stepdefs;

import com.maven.arrrgos.pageobjects.Basket;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class BasketStepDef {
    Basket basket = new Basket();
    @And("^I select randomProduct \"([^\"]*)\"$")
    public void iSelectRandomProduct(String css) throws Throwable {
    basket.products();

    }

    @And("^I select size \"([^\"]*)\"$")
    public void iSelectSize(String css) throws Throwable {
        basket.size(css);

    }

    @Then("^I add refined product to basket$")
    public void iAddRefinedProductToBasket() throws InterruptedException {
        basket.basket();
    }

}
