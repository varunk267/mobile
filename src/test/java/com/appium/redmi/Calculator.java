package com.appium.redmi;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.appium.generic.FileUtility;
import com.appium.generic.Tolaunch;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Calculator {
	
	DesiredCapabilities dc= new DesiredCapabilities();
	FileUtility file = new FileUtility();
@Test
public void sample() throws Throwable{
	//launching app in mobile
	
/*	dc.setCapability("deviceName", file.getpropdata("deviceName"));
	dc.setCapability("automationName", file.getpropdata("automationname"));
	dc.setCapability("platformName", file.getpropdata("platformname"));
	dc.setCapability("platformVersion", file.getpropdata("platformversion"));
	dc.setCapability("UDID", file.getpropdata("udid"));
	dc.setCapability("appPackage", "com.miui.calculator");
	dc.setCapability("appActivity", ".cal.AllInOneCalculatorActivity");
	URL url=new URL("http://localhost:4723/wd/hub");
	driver=new AndroidDriver(url, dc);*/
	Tolaunch lnh=new Tolaunch();
	AndroidDriver driver = lnh.tolaunchmobapp("com.miui.calculator", ".cal.AllInOneCalculatorActivity");
	System.out.println(driver);
	TouchAction ta=new TouchAction(driver);
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//performing actions in mobile app
	driver.findElement(By.id("android:id/button1")).click();//click on the element using click() 
	MobileElement five = (MobileElement) driver.findElement(By.id("com.miui.calculator:id/btn_5_s"));
	ta.longPress(five).waitAction(200).release().perform();
	driver.tap(1, five, 500);//click on the element using tap()
	driver.findElementByAccessibilityId("plus").click();
	driver.findElement(By.id("com.miui.calculator:id/btn_3_s")).click();
	driver.tap(1, 636, 1419, 500);
	
	
	
	
}

}
