package com.maven.arrrgos.utils;

import com.maven.arrrgos.driverfactory.DriverFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks  {
    DriverFactory driverFactory = new DriverFactory();
    @Before
    public void setUp(){
        driverFactory.setDriver("firefox");
        driverFactory.setUrl("https://www.argos.co.uk/");
        driverFactory.maximize();
        driverFactory.timeouts();
    }
    @After
    public void tearDown(){
      // driverFactory.close();
    }
}
