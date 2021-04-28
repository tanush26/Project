package org.maven.project.utils;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.maven.project.driverfactory.DriverFactory;

public class Hooks {
    DriverFactory driverFactory = new DriverFactory();

    @Before
    public void setUp() {
        driverFactory.openBrowser("firefox");
        driverFactory.getUrl("https://www.argos.co.uk/");
        driverFactory.maximize();
        driverFactory.timeOut();
    }

    @After
    public void tearDown() {
        //    driver.close();
    }
}
