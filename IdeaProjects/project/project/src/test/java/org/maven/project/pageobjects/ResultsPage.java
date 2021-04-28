package org.maven.project.pageobjects;

import org.maven.project.driverfactory.DriverFactory;
import org.maven.project.utils.Helper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ResultsPage extends DriverFactory {
    Helper helper = new Helper();

//User selected category

    @FindBy(css = ".Accordionstyles__Title-sc-1pskwpu-1")
    private List<WebElement> categories;

    public void category(String customerSelectedCategory) {
        for (WebElement category : categories) {
            if (category.getText().equalsIgnoreCase(customerSelectedCategory)) {
                category.click();
                break;
            }
        }
    }

    //User selected price and brands filters

    @FindBy(css = ".Checkboxstyles__LabelValue-b61uwr-6")
    private List<WebElement> priceAndBrands;

    public void priceAndBrandFilter(String customerSelectedPriceAndBrand) {
        for (WebElement priceAndBrand : priceAndBrands) {
            if (priceAndBrand.getText().equalsIgnoreCase(customerSelectedPriceAndBrand)) {
                priceAndBrand.click();
                break;
            }
        }
    }

//user selected filtered product randomly

    @FindBy(xpath = "//div[@data-test='component-product-card']")
    private List<WebElement> productsList;

    public String products() throws InterruptedException {
        int product = productsList.size();
        System.out.println(product);
        int randomList = helper.random(product);
        String productsInString = productsList.get(randomList).getText();
        System.out.println(productsInString);
        Thread.sleep(2000);
        productsList.get(randomList).click();
        return productsInString;
    }

    //adding product to trolley

    @FindBy(xpath = "//button[@data-test='add-to-trolley-button-button']")
    private WebElement add;

    public void basket() throws InterruptedException {
        Thread.sleep(2000);
        add.click();
    }

    //verifying products in trolley

    @FindBy(css = ".Drawerstyles__CloseButton-sc-7kh0ae-3")
    private WebElement cross;
    @FindBy(css = ".LQbCV")
    private WebElement trolley;

    public void goToTrolley() throws InterruptedException {
        cross.click();
        Thread.sleep(2000);
        trolley.click();
    }

    //Verifying added product is in trolley or not

    @FindBy(css = ".Titlestyles__Heading-wfdfx2-1")
    private WebElement getTrolley;

    public String verify() {
        return getTrolley.getText();
    }
}


