package com.maven.practice.pageobjects;
import com.maven.practice.drivers.DriverFactory;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static com.maven.practice.drivers.DriverFactory.driver;

public class Results extends DriverFactory {
    @FindBy(css = ".sort-select")
    private WebElement SortBy;

    public void sortBy(String customerSelectedPrice) {
        Select select=new Select(SortBy);
        select.selectByVisibleText(customerSelectedPrice);
    }
    public void moveToSort(String customerSelectedSort) {
        Actions action = new Actions(driver);
        action.moveToElement(SortBy).build().perform();
    }


    @FindBy(css = ".ac-product-price__amount")
    private List<WebElement> selectedPrices;

    public List<Double> selectedPriceRange(String price) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<Double> customerSelectedRange = new ArrayList<>();
        for (WebElement selectedPrice : selectedPrices) {
            String priceInString = selectedPrice.getText().replace("£", "");
            double priceInDouble = Double.parseDouble(priceInString);
            customerSelectedRange.add(priceInDouble);
            if(selectedPrice.getText().equalsIgnoreCase(price)){
                selectedPrice.click();
                break;
            }

        }

        return customerSelectedRange;
    }

    @FindBy(css = ".search-title__term")
    private WebElement pageHeader;

    public String getResultsPageHeader() {
        return pageHeader.getText();
    }
    public void sceenShot()
            throws IOException
    {
        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("/Users/srilathadarsanam/IdeaProjects/practice/src/test/argos.png"));


    }
    public void selTest(){
        sortBy("Price: High - Low");
        moveToSort("Price: High - Low");
selectedPriceRange("179.99");
    }
}


