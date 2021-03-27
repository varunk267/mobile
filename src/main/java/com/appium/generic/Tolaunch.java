package com.appium.generic;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Tolaunch {
	AndroidDriver driver;
	
public AndroidDriver tolaunchmobapp(String andapppackage,String andappactivity) throws IOException
{
	DesiredCapabilities dc=new DesiredCapabilities();
	
	FileUtility flib=new FileUtility();
	dc.setCapability("deviceName", flib.getpropdata("devicename"));
	dc.setCapability("automationName", flib.getpropdata("automationname"));
	dc.setCapability("platformName", flib.getpropdata("platformname"));
	dc.setCapability("platformVersion", flib.getpropdata("platformversion"));
	dc.setCapability("UDID", flib.getpropdata("udid"));
	dc.setCapability("appPackage", andapppackage);
	dc.setCapability("appActivity", andappactivity);
	dc.setCapability("noReset", true);
	
	URL url=new URL(flib.getpropdata("url"));
	
	 driver=new AndroidDriver(url, dc);
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 return driver;
}
}
