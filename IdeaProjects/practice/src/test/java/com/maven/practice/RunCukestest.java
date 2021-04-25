package com.maven.practice;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/Resources",dryRun = false,strict = true,tags="@bask")
public class RunCukestest {

}
