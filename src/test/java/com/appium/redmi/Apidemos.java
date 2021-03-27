package com.appium.redmi;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import javax.swing.Scrollable;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Apidemos {
	AndroidDriver driver;
	@Test
	public void sample() throws Throwable{
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability("deviceName", "Redmi");
		dc.setCapability("automationName", "Appium");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "9.0");
		dc.setCapability("UDID", "0ff8f25c0806");
		dc.setCapability("appPackage", "io.appium.android.apis");
		dc.setCapability("appActivity", ".ApiDemos");
		
		
		URL url=new URL("http://localhost:4723/wd/hub");
	    driver=new AndroidDriver(url, dc);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByAccessibilityId("Views").click();
		scrolling("text","Layouts");
		driver.findElementByAccessibilityId("Layouts").click();
	}
	public void scrolling(String an,String av)
	
	{	
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))");
	}
}
