package com.maven.arrrgos;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",dryRun = false,strict = true,tags="@result",
        plugin = {"json:target/cucumber.json","junit:target/cucumber.xml","html:target/cucumber.html"})
public class Runcukes {
}
