package com.stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.page.object.mode.MasterPageFactoryLoginPage;
import com.util.BaseConfig;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ZooplaLoginStepDefAutomationCode {
	
	
	WebDriver driver;
	MasterPageFactoryLoginPage pf;
	@Given("Open the browser")
	public void open_the_browser() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  
	    
	}

	@When("Send URL")
	public void send_URL() throws Throwable {
	driver.get(BaseConfig.getConfigValue("url"));     
	    
	}

	@When("Accept cookies")
	public void accept_cookies() {
		
		pf = new MasterPageFactoryLoginPage(driver);
		pf.getAcceptCookies().click();
	
	    
	}

	@When("Click Sign in btn")
	public void click_Sign_in_btn() {
		pf.getLogin().click();   
	    
	}

	@When("Send valid email")
	public void send_valid_email() throws Throwable {
		pf.getEmail().sendKeys(BaseConfig.getConfigValue("email"));    
	    
	}

	@When("Send valid password")
	public void send_valid_password() throws Throwable {
		pf.getPass().sendKeys(BaseConfig.getConfigValue("password"));    
	    
	}

	@When("Click submit btn")
	public void click_submit_btn() {
		pf.getSubmit().click();    
	    
	}

	@Then("Validate login success or fail")
	public void validate_login_success_or_fail() {
	    
	    
	}

	@When("close the browser")
	public void close_the_browser() {
	    
	    
	}
}
