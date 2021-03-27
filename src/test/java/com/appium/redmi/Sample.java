package com.appium.redmi;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.appium.generic.Tolaunch;

import io.appium.java_client.android.AndroidDriver;

public class Sample {
@Test
public void spl() throws IOException
{
	Tolaunch t=new Tolaunch();
	AndroidDriver driver = t.tolaunchmobapp("com.davemorrissey.labs.subscaleview.sample", ".MainActivity");
	driver.findElementById("com.davemorrissey.labs.subscaleview.sample:id/basicFeatures").click();
	WebElement image = driver.findElementById("com.davemorrissey.labs.subscaleview.sample:id/imageView");
	//to zoom in
	driver.zoom(image);
	//to zoom out	
	driver.pinch(image);
	
}
}
