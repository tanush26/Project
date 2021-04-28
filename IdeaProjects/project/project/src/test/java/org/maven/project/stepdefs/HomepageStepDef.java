package org.maven.project.stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.hamcrest.Matchers;
import org.maven.project.pageobjects.Homepage;
import static org.hamcrest.MatcherAssert.assertThat;

public class HomepageStepDef {
    Homepage homepage = new Homepage();

    @Given("^User is on Homepage$")
    public void userIsOnHomepage() {
        String actual = homepage.getHomePageUrl();
        assertThat("verify the homepage url ends with", actual, Matchers.endsWith(homepage.getHomePageUrl()));
    }

    @When("^User selected \"([^\"]*)\"$")
    public void userSelected(String customerSelectedProduct) throws Throwable {
        homepage.chosenProduct(customerSelectedProduct);
    }


}
