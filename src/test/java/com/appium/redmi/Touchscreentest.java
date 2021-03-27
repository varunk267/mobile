package com.appium.redmi;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Touchscreentest {
	@Test
	public void sample() throws Throwable{
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability("deviceName", "Redmi");
		dc.setCapability("automationName", "Appium");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "9.0");
		dc.setCapability("UDID", "0ff8f25c0806");
		dc.setCapability("appPackage", "jp.rallwell.siriuth.touchscreentest");
		dc.setCapability("appActivity", ".TouchScreenTestActivity");
		
		
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url, dc);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
//		driver.swipe(100, 808, 690, 808, 1000);
//		driver.swipe(300, 250, 300, 1300, 2000);
//		driver.swipe(100, 250, 100, 800, 1000);
//		driver.swipe(100, 800, 500, 800, 3000);
		Dimension d = driver.manage().window().getSize();
		int ht = d.getHeight();
		System.out.println(ht);
		int wd = d.getWidth();
		System.out.println(wd);
		
		int startx=(int) (wd*.20);
		int starty=(int) (ht*.50);
		int endx=(int) (wd*.70);
		int endy=(int) (ht*.50);
		driver.swipe(startx, starty, endx, endy, 2000);
		
	}
}
