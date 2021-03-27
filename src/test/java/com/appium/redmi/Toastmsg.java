package com.appium.redmi;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.appium.generic.Tolaunch;

import io.appium.java_client.android.AndroidDriver;

public class Toastmsg {
	@Test
	public void generalstore() throws IOException 
	{
	Tolaunch t=new Tolaunch();
	AndroidDriver driver = t.tolaunchmobapp("com.androidsample.generalstore", ".SplashActivity");
//	driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("varun");
	WebElement login = driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop"));
	login.click();
	System.out.println(login.getCssValue("color"));
	
	System.out.println(driver.findElementByXPath("//android.widget.Toast[1]").getText());
	}
}
