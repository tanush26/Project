package com.maven.raghu.utils;

import com.maven.raghu.diverfactory.DriverFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends DriverFactory {
    DriverFactory driverFactory = new DriverFactory();
    @Before
    public void setUp(){
        driverFactory.openBrowser("firefox");
        driverFactory.getUrl("https://uk.tommy.com/");
        driverFactory.maximize();
        driverFactory.timeOut();
    }
    @After
    public void  tearDown(){
    //    driver.close();
    }
}
