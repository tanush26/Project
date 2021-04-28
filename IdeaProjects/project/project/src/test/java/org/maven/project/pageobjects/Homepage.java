package org.maven.project.pageobjects;

import org.maven.project.driverfactory.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends DriverFactory {
    @FindBy(css = "#searchTerm")
    private WebElement searchBox;
    @FindBy(css = "._2mKaC")
    private WebElement magnifierGlass;
    @FindBy(css = "#consent_prompt_submit")
    private WebElement accept;

    //User must be able to enter "women" in search box

    public void chosenProduct(String customerSelectedProduct) {
        searchBox.sendKeys(customerSelectedProduct);
        accept.click();
        magnifierGlass.click();
    }
    //verify homepageUrl

    public String getHomePageUrl() {
        return driver.getCurrentUrl();
    }
}
