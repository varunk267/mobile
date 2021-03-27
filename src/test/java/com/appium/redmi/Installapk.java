package com.appium.redmi;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Installapk {
	@Test
	public void sample() throws Throwable{
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability("deviceName", "Redmi");
		dc.setCapability("automationName", "Appium");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "9.0");
		dc.setCapability("UDID", "0ff8f25c0806");
		dc.setCapability("app", "D:\\testyantra\\APK\\ApiDemos-debug.apk");
		
		
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url, dc);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
}
