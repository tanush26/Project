package com.maven.practice.pageobjects;

import com.maven.practice.drivers.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends DriverFactory {
    public static String searchProduct;
    @FindBy(css = "._1Rz0y")
    private WebElement searchBox;

    @FindBy(css = "._1gqeQ")
    private WebElement searchButton;



    public void doSearch(String item){
        searchProduct = item;
        searchBox.sendKeys(item);
        driver.findElement(By.cssSelector("#consent_prompt_submit")).click();
        searchButton.click();
        
    }


    public String getHomePageUrl(){
        return driver.getCurrentUrl();
    }
}


