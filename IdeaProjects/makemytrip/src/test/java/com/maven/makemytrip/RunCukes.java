package com.maven.makemytrip;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",dryRun = false,strict = true,tags = "@booking",
        plugin = {"json:target/cucumber.json","html:target/cucumber-html-report",
                "junit:target/cucumber-report.xml","usage:target/cucumber-usage.json","pretty:target/cucumber-pretty.txt"})

public class RunCukes {

}
