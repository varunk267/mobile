package com.appium.redmi;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.appium.generic.DriverUtility;
import com.appium.generic.MobileActions;
import com.appium.generic.Tolaunch;

import io.appium.java_client.android.AndroidDriver;

public class Dropdown {
	MobileActions d=new MobileActions();
@Test
public void generalstore() throws IOException, InterruptedException{
	Tolaunch ta=new Tolaunch();
	AndroidDriver driver=ta.tolaunchmobapp("com.androidsample.generalstore", ".SplashActivity");
	driver.findElement(By.xpath("//android.widget.Spinner[@resource-id='com.androidsample.generalstore:id/spinnerCountry']")).click();
	List<WebElement> dele = driver.findElementsByClassName("android.widget.TextView");
	d.scrolling(driver, "text", "India");
	for ( WebElement a : dele) {
		String text = a.getText();
		if(text.equals("India"))
		{
			a.click();
			break;
		}
	}	
}
}
