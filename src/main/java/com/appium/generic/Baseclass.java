package com.appium.generic;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public abstract class Baseclass {
	DesiredCapabilities dc=new DesiredCapabilities();
	FileUtility flib=new FileUtility();
	AppiumDriverLocalService server=AppiumDriverLocalService.buildDefaultService();
	public AndroidDriver driver;
	@BeforeSuite
	public void startserver()
	{
		server.start();
	}
	@BeforeMethod
	public void launch() throws MalformedURLException, IOException
	{

		dc.setCapability("deviceName", flib.getpropdata("devicename"));
		dc.setCapability("automationName", flib.getpropdata("automationname"));
		dc.setCapability("platformName", flib.getpropdata("platformname"));
		dc.setCapability("platformVersion", flib.getpropdata("platformversion"));
		dc.setCapability("UDID", flib.getpropdata("udid"));
		dc.setCapability("appPackage", flib.getpropdata("apppackage"));
		dc.setCapability("appActivity", flib.getpropdata("appactivity"));
		dc.setCapability("noReset", true);

		URL url=new URL(flib.getpropdata("url"));
		driver = new AndroidDriver(url, dc);
		driver.manage().timeouts().implicitlyWait(Iconstants.implicitlywait_time, TimeUnit.SECONDS);
	}
	@AfterMethod
	public void closeapp()
	{
		driver.closeApp();
	}
	@AfterSuite
	public void stopserver()
	{
		server.stop();
	}
}

