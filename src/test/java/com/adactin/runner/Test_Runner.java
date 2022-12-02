package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;
@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\HP\\eclipse-workspace\\Adactin_Cucumber\\src\\test\\java\\com\\adactin\\feature\\Feature",glue = "com.adactin.stepdefinition")
public class Test_Runner {
	public static WebDriver driver;
	@BeforeClass
	public static void setUp() {
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}
	@AfterClass
	public static void tearDown() {
		driver.close();
	}
	

}
