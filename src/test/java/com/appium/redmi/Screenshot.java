package com.appium.redmi;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.appium.generic.DriverUtility;
import com.appium.generic.Tolaunch;

import io.appium.java_client.android.AndroidDriver;

public class Screenshot {
	DriverUtility dlib=new DriverUtility();
	@Test
	public void spl() throws IOException
	{
		Tolaunch t=new Tolaunch();
		AndroidDriver driver = t.tolaunchmobapp("com.davemorrissey.labs.subscaleview.sample", ".MainActivity");
		driver.findElementById("com.davemorrissey.labs.subscaleview.sample:id/basicFeatures").click();
		WebElement image = driver.findElementById("com.davemorrissey.labs.subscaleview.sample:id/imageView");
		driver.zoom(image);
		dlib.screenshot(driver,"zin");
		driver.pinch(image);
		dlib.screenshot(driver,"zout");
		
		
}
}