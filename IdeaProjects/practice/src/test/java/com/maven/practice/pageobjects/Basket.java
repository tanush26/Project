package com.maven.practice.pageobjects;

import com.maven.practice.drivers.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Basket extends DriverFactory {
    @FindBy (css=".ac-product-card")
    private List<WebElement> productValue;

    @FindBy (css="[data-product-id='8654393']")
    private WebElement productV;



  public void listOfProducts(String customerSelectedProduct){

      try {
          Thread.sleep(3000);
      } catch (InterruptedException e) {
          e.printStackTrace();
      }
      for (WebElement productValues: productValue) {
          if(productValues.getText().equalsIgnoreCase(customerSelectedProduct)){
              productValues.click();
              break;
          }
      }
  }
  public void selectionTest(){
     // listOfProducts("Add to Trolley");
      productV.click();
  }

}
