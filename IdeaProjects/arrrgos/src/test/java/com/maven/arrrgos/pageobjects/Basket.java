package com.maven.arrrgos.pageobjects;

import com.maven.arrrgos.utils.Helpers;
import com.maven.arrrgos.driverfactory.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Basket extends DriverFactory {
    Helpers helpers = new Helpers();
@FindBy(xpath = "//div[@data-test='component-product-card']")
    private List<WebElement> productsList;
public String products() throws InterruptedException {
    int product = productsList.size();
    System.out.println(product);
    int randomList = helpers.random(product);
    String productsInString = productsList.get(randomList).getText();
    System.out.println(productsInString);
    Thread.sleep(2000);
    productsList.get(randomList).click();
    return productsInString;
}
@FindBy(xpath = "//button[@data-template='TuClothing']")
    private List<WebElement> sizes;
    public void size(String css) {
        for (WebElement size : sizes) {
            if (size.getText().equalsIgnoreCase(css)) {
                size.click();
                break;
            }
        }
    }
    @FindBy(xpath = "//button[@data-test='add-to-trolley-button-button']")
            private WebElement add;
public void basket() throws InterruptedException {
    Thread.sleep(2000);
    add.click();
}

}


