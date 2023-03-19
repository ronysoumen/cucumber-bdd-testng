package com.test.runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.TestNGCucumberRunner;
//import cucumber.api.testng.CucumberFeatureWrapper;

/*@CucumberOptions(features = "src/test/resources/features/login/login_logout.feature", glue = { "com/cucumberFramework/stepdefinitions" }, plugin = { "pretty", "html:target/cucumber-reports/cucumber-pretty",
		"json:target/cucumber-reports/CucumberTestReport.json", "rerun:target/cucumber-reports/rerun.txt" },
		monochrome = true, dryRun = false)*/
@CucumberOptions(
	      features = {"src/main/java/com/test/features/TestCucumber.feature"},
	      glue = {"com.test.stepdef"}/*plugin = { "pretty", "html:target/cucumber-reports/cucumber-pretty",
	    			"json:target/cucumber-reports/CucumberTestReport.json","rerun:target/cucumber-reports/rerun.txt" },
			monochrome = true, dryRun = false
	      monochrome = true,
	      dryRun = false*/
	      /*plugin = {
	            "json:build/cucumber-reports/cucumber.json",
	            "rerun:build/cucumber-reports/rerun.txt"
	      }*/)



public class CucumberRunner  {
	private TestNGCucumberRunner testNGCucumberRunner;
	   
	@BeforeClass(alwaysRun = true)
	public void setUpClass() {
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	}


	@AfterClass(alwaysRun = true)
	public void testDownClass() {
		testNGCucumberRunner.finish();
	}
	@Test(groups = "cucumber", description = "Runs Cucumber Scenarios", dataProvider = "scenarios")
	public void runScenario(PickleWrapper pickleWrapper, FeatureWrapper featureWrapper) {
	   testNGCucumberRunner.runScenario(pickleWrapper.getPickle());
	}

	@DataProvider
	public Object[][] scenarios() {
	   return testNGCucumberRunner.provideScenarios();
	}
	

}
