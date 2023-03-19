package com.test.stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.test.common.Base;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class stepdefs extends Base {
	
	@Before
	public static void setupDriver() throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
	 	WebDriver driver = new ChromeDriver(options);
		driver.get("http://www.total-qa.com");
		
		
		
	}

	@After
	public static void quitDriver() throws Exception {
		System.out.println("after");
	}
	
	
	
	 @Given("User is on login page")
	    public void userisonhomepage()
	    {
		 
	    	//hsqe
	    	//driver.get("https://community.jaspersoft.com/blog/integration-cucumber-selenium-and-testng-orange-hrm-login-example-1-feature-file-1-scenario");
	    	System.out.println("login");
	    	
	    	
	    	
	    	
	    }
	    
	    @When ("User enters username as {string} and password as {string}")
	    public void userdetails(String username, String password){
	    	System.out.println(username+password+" username and password");
	    	
	    }
	    
	    @Then ("User should be able to login successfully")
	    public void validatelogin(){
	    	 System.out.println("Validate login");
	    	
	    	
	    }
}
