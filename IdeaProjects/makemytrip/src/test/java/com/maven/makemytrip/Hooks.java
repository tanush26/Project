package com.maven.makemytrip;

import com.maven.makemytrip.driver.DriverFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
    DriverFactory driverFactory = new DriverFactory();
    @Before
    public void startUp(){
        driverFactory.setDriver("chrome");
        driverFactory.setUrl("https://www.makemytrip.com/");
        driverFactory.maximise();
        driverFactory.implicitWait();
        driverFactory.delAllCookies();
    }
    @After
    public void tearDown(){

        //driverFactory.closeBrowser();
    }
}
