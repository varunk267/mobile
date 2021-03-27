package com.appium.redmi;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.appium.generic.Tolaunch;

import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class multitouch1 {
	@Test
	public void touchscreen() throws IOException
	{
		Tolaunch t=new Tolaunch();
		AndroidDriver driver = t.tolaunchmobapp("com.davemorrissey.labs.subscaleview.sample", ".MainActivity");
		driver.findElementById("com.davemorrissey.labs.subscaleview.sample:id/basicFeatures").click();
		WebElement image = driver.findElementById("com.davemorrissey.labs.subscaleview.sample:id/imageView");
		int x=driver.manage().window().getSize().getWidth()/2;
		int y=driver.manage().window().getSize().getHeight()/2;
		
		TouchAction finger1=new TouchAction(driver);
		finger1.press(x, y-100).moveTo(x, y-800);
		
		TouchAction finger2=new TouchAction(driver);
		finger2.press(x, y+100).moveTo(x, y+800);
		
		MultiTouchAction mt=new MultiTouchAction(driver);
		mt.add(finger1).add(finger2).perform();
		
		
		
	}
}
