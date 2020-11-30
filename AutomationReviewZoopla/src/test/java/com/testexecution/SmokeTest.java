package com.testexecution;

import org.openqa.selenium.WebDriver;

import com.generic.code.BaseLogin;
import com.util.Highlighter;

public class SmokeTest {

	static WebDriver driver;

	public static void main(String[] args) throws Throwable {
		
		
		
		
		driver = BaseLogin.getDriverManager();
		driver = BaseLogin.getLogin(driver);
		Thread.sleep(5000);
		driver.quit();

	}

}
