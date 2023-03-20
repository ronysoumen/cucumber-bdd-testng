package com.test.runner;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
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
	      glue = {"com.test.stepdef"},
	    /*		 plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})*/
	    	  
	      plugin = { "pretty", 
	    		  "json:target/cucumber-reports/cucumber.json",
	    		  "html:target/cucumber-reports/cucumberreport.html",
	    		  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
	      )
	      /*plugin = {
	            "json:build/cucumber-reports/cucumber.json",
	            "rerun:build/cucumber-reports/rerun.txt"
	      }*/



public class CucumberRunner  extends AbstractTestNGCucumberTests{


}
