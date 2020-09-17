package com.maven.arrrgos.driverfactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class DriverFactory {
    public static WebDriver driver;
    public DriverFactory(){
        PageFactory.initElements(driver,this);
    }
    public void setDriver(String browser){
        switch (browser){
            case "firefox": WebDriverManager.firefoxdriver().setup();
                            driver = new FirefoxDriver();
                            break;
            case "chrome": WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            default:
                driver = new SafariDriver();
                break;
        }
    }
    public void setUrl(String url){
        driver.get(url);
    }
    public void maximize(){
        driver.manage().window().maximize();
    }
    public void timeouts(){
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
    }
    public void close(){
        driver.close();
    }

}
