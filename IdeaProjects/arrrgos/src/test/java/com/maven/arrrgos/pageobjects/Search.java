package com.maven.arrrgos.pageobjects;

import com.maven.arrrgos.driverfactory.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Search extends DriverFactory {
@FindBy(css = "#searchTerm")
    private WebElement searchBox;
    @FindBy(css = "._2mKaC")
    private WebElement magnifierGlass;

    public void chosenProduct(String customerSelectedProduct){
        searchBox.sendKeys(customerSelectedProduct);
        magnifierGlass.click();
    }

}
