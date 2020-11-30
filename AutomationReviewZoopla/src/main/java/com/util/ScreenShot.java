package com.util;

import java.io.File;
import java.nio.file.Files;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {
	public  void getScreenShot(WebDriver driver, String pictureName) {

		TakesScreenshot ts = (TakesScreenshot)driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
		Files.copy(file, new File("./target/" + pictureName + ".png"));
	}

}
