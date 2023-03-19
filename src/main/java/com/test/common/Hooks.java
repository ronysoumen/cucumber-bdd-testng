package com.test.common;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Hooks extends Base{
	//static Base testBase;
	@Before
	public static void setupDriver() throws InterruptedException {
	
/*
		WebDriverManager.chromedriver().setup();
	 	 driver = new ChromeDriver();
		driver.get("http://www.total-qa.com");
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		System.out.println("before");*/
		
	}

	@After
	public static void quitDriver() throws Exception {
		System.out.println("after");
	}


}
