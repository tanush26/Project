package com.maven.arrrgos.pageobjects;

import com.maven.arrrgos.driverfactory.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Result extends DriverFactory {
    @FindBy(xpath = "//span[@data-el='findability-facet__filter-text']")
    private List<WebElement> categories;
    public void selectedCategory(String customerSelectedCategory){
        for (WebElement category:categories) {
            if(category.getText().equalsIgnoreCase(customerSelectedCategory)){
                category.click();
                break;
            }
        }
    }
    @FindBy(xpath = "//span[@data-el='findability-facet__filter-text']")
    private List<WebElement> categoryFilters;
    public void selectedCategoryFilters(String customerSelectedCategoryFilters) {
        for (WebElement category : categories) {
            if (category.getText().equalsIgnoreCase(customerSelectedCategoryFilters)) {
                category.click();
                break;
            }
        }
    }
    @FindBy(xpath = "//*[contains(@class,'Checkboxstyles__LabelWrapper')]")
    private List<WebElement> priceFilters;
    public void selectedFilter(String customerSelectedCategory) throws InterruptedException {
        for (WebElement priceFilter:priceFilters) {
            if(priceFilter.getText().equalsIgnoreCase(customerSelectedCategory)){
                Thread.sleep(2000);
                priceFilter.click();
                break;
            }
        }
    }
    @FindBy(css = "#fsrFocusFirst")
    private WebElement alert;
    public void setAlert(){
        alert.click();
    }

}
