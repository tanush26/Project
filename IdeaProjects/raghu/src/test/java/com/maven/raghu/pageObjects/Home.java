package com.maven.raghu.pageObjects;

import com.maven.raghu.diverfactory.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Home extends DriverFactory {
    @FindBy(css = "#headerSearchInput")
    private WebElement searchBox;
    @FindBy(css = ".button-icon")
    private WebElement magGlass;
    @FindBy(css = ".cookie-notice__agree-button")
    private WebElement alert;
    @FindBy(css = ".newsletter__close")
    private WebElement cross;

   public void setSearchBox(String csf) throws InterruptedException {
       alert.click();
       searchBox.sendKeys(csf);
       magGlass.click();
       Thread.sleep(2000);
       cross.click();
   }
    @FindBy(xpath = "//li[@class='nav__list-item']")
    private List<WebElement> customerSelFilter;

    public void setCustomerSelFilter(String csf) {
        for (WebElement customerSelFilters:customerSelFilter) {
            if(customerSelFilters.getText().equalsIgnoreCase(csf)){
                Actions actions = new Actions(driver);
                actions.moveToElement(customerSelFilters).build().perform();
                break;
            }
        }

    }
    @FindBy(xpath = "//a[@class='nav__list-item__link ']")
    private List<WebElement> customerSubFilter;

    public void setCustomerSubFilter(String csf) {
        for (WebElement customerSubFilters:customerSubFilter) {
            if(customerSubFilters.getText().equalsIgnoreCase(csf)){
                customerSubFilters.click();
                break;
            }
        }

    }
}


