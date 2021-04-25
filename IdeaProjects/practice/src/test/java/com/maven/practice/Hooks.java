package com.maven.practice;
import com.maven.practice.drivers.DriverFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
    private DriverFactory driverFactory = new DriverFactory();
    @Before
    public  void setUp(){
        driverFactory.setDriver("firefox");
        driverFactory.setUrl("https://www.argos.co.uk/");
        driverFactory.maximise();
        driverFactory.implicitWait();
        driverFactory.delAllCookies();
    }
    @After
    public  void tearDown(){
      //  driverFactory.closeBrowser();
    }
}
