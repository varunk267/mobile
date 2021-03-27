package com.appium.redmi;

import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class General_store {
	AndroidDriver driver;
	@Test
	public void sample() throws Throwable{
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability("deviceName", "Redmi");
		dc.setCapability("automationName", "Appium");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "9.0");
		dc.setCapability("UDID", "0ff8f25c0806");
		dc.setCapability("appPackage", "com.androidsample.generalstore");
		dc.setCapability("appActivity", ".SplashActivity");
		
		
		URL url=new URL("http://localhost:4723/wd/hub");
	    driver=new AndroidDriver(url, dc);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.findElementByAccessibilityId("Views").click();
//		scrolling("text","Layouts");
//		driver.findElementByAccessibilityId("Layouts").click();
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("varun");
		driver.hideKeyboard();
		MobileElement shop=(MobileElement) driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop"));
		driver.tap(1, shop, 500);
		scrolling("text", "PG 3");
driver.findElementByXPath("//android.widget.TextView[@resource-id='com.androidsample.generalstore:id/productAddCart']").click();
		driver.findElementById("com.androidsample.generalstore:id/appbar_btn_cart").click();
		driver.findElementById("com.androidsample.generalstore:id/btnProceed").click();
		
		Set<String> apps = driver.getContextHandles();
		for (String app : apps) {
			System.out.println(app);
		}
		
	}
	public void scrolling(String an,String av)
	
	{	
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))");
	}
}

