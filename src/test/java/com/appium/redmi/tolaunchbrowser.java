package com.appium.redmi;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class tolaunchbrowser {
	AndroidDriver driver;
@Test
public void chrome() throws MalformedURLException
{
	DesiredCapabilities dc= new DesiredCapabilities();
	dc.setCapability("deviceName", "Redmi");
	dc.setCapability("automationName", "Appium");
	dc.setCapability("platformName", "Android");
	dc.setCapability("platformVersion", "9.0");
	dc.setCapability("UDID", "0ff8f25c0806");
//	dc.setCapability("browserName","Chrome");
	dc.setCapability(CapabilityType.BROWSER_NAME,"Chrome");
   // dc.setBrowserName("Chrome");
//	dc.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
	
	
	URL url=new URL("http://localhost:4723/wd/hub");
    driver=new AndroidDriver(url, dc);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
}
