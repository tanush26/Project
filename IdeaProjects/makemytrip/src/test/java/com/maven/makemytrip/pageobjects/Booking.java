package com.maven.makemytrip.pageobjects;

import com.maven.makemytrip.driver.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class Booking extends DriverFactory {
    @FindBy(linkText = "Flights")
    private WebElement flight;
    @FindBy(xpath="//li[contains(text(),'Round Trip')]")
    private WebElement trip;
    public void selFlightAndRoundTrip(){
       // flight.click();
        trip.click();
    }
    @FindBy(xpath = "//span[contains(text(),'From')]")
    private WebElement from;
    @FindBy(xpath = "//li[@id='react-autowhatever-1-section-0-item-5']")
    private WebElement hyd;
    public void from(){
        from.click();
        hyd.click();
    }

    @FindBy(xpath = "//span[contains(text(),'To')]")
    private WebElement to;
    @FindBy(xpath = "//*[@id='react-autowhatever-1-section-0-item-0']/div/div[1]/p[1]")
    private WebElement mumbai;
    public void To() {
        to.click();
        mumbai.click();
    }
    @FindBy(xpath = "//span[contains(text(),'DEPARTURE')]")
    private WebElement departure;
    @FindBy(xpath = "(//div[@class='dateInnerCell'])[33]")
    private WebElement departureDate;
    public void setDepartureDate() throws InterruptedException {
        Thread.sleep(3000);
        departure.click();
        departureDate.click();
    }
    @FindBy(xpath = "//span[contains(text(),'RETURN')]")
    private WebElement ret;
    @FindBy(xpath = "(//div[@class='dateInnerCell'])[46]")
    private WebElement retDate;
    @FindBy(css=".primaryBtn")
    private WebElement search;
    public void setReturnDate(){
        ret.click();
        retDate.click();
         search.click();
    }
    @FindBy(css = ".paddLR15")
    private WebElement total;
    public void printTotal(){
        total.getSize();
        System.out.println("total no of departures and return flights are : " + total.getSize());
    }
    @FindBy(xpath = "//*[contains(text(),'Non Stop')]")
    private WebElement nonStop;
    @FindBy(xpath = "//*[contains(text(),'1 Stop')]")
    private WebElement stop;
    public void stop() throws InterruptedException {
        Thread.sleep(3000);
        nonStop.click();
        Thread.sleep(3000);
        stop.click();
    }

    @FindBy(css = ".paddLR15")
    private List<WebElement> tot;
    public void print(){
        /*//tot.get(3);
        WebDriverWait wait =new WebDriverWait(driver,30);
          WebElement b =  wait.until(ExpectedConditions.elementToBeClickable(tot.get(10)));
          b.click();*/
        System.out.println(tot.get(3));
    }
    //for printing departure and return flights
    @FindBy(css = ".fli-list")
    private List<WebElement> names;

    public  List<String> selectedNames(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<String>customerSelectedName =new ArrayList<>();
        for (WebElement name:names) {
         String sri = name.getText();
                customerSelectedName.add(sri);
            System.out.println(names.size());
            System.out.println("flights list :"+  customerSelectedName);

            }
        return customerSelectedName;
        }
    }






