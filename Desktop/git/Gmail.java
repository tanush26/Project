package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Fpc%3Dtopnav-about-n-en&flowName=GlifWebSignIn&flowEntry=SignUp");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector(".Xb9hP #firstName")).sendKeys("Chitti");
         driver.findElement(By.cssSelector("[name=lastName]")).sendKeys("robo");
          driver.findElement(By.cssSelector("#username")).sendKeys("chittiboostrobo");
          driver.findElement(By.cssSelector("[type=password]")).sendKeys("abcdef34");
          driver.findElement(By.cssSelector("[name=ConfirmPasswd]")).sendKeys("abcdef34");
          driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
driver.close();
    }
}