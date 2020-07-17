package runner;

import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@Test
@CucumberOptions(features = "./src/test/java/featureFiles/Loginfeature.feature",glue = {"stepdefinition"},dryRun=false)
public class Runner extends AbstractTestNGCucumberTests {
	
}