package org.maven.project;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", dryRun = false, strict = true, tags = "@result",
        plugin = {"json:target/cucumber-report.json", "html:target/cucumber-report.html", "junit:target/cucumber-report.xml"})

public class Runner {
}


