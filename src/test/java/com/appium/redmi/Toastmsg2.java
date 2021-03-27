package com.appium.redmi;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.appium.generic.Tolaunch;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class Toastmsg2 {
	@Test
	public void generalstore() throws IOException, InterruptedException 
	{
		AppiumDriverLocalService server=AppiumDriverLocalService.buildDefaultService();
		server.start();
		
		
		
	Tolaunch t=new Tolaunch();
	AndroidDriver driver = t.tolaunchmobapp("com.androidsample.generalstore", ".SplashActivity");
	driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("varun");
	driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
	WebElement cart = driver.findElementById("com.androidsample.generalstore:id/appbar_btn_cart");
	System.out.println(cart.getCssValue("color"));
	cart.click();
	Thread.sleep(2000);
	WebElement toastmessage = driver.findElementByXPath("//android.widget.Toast[1]");
	System.out.println(toastmessage.getText());
	driver.pressKeyCode(AndroidKeyCode.KEYCODE_BACK);
	Thread.sleep(2000);
	driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).clear();
	driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
	Thread.sleep(2000);
	System.out.println(driver.findElementByXPath("//android.widget.Toast[1]").getText());
	driver.pressKeyCode(AndroidKeyCode.KEYCODE_BACK);
	System.out.println(driver.findElementByXPath("//android.widget.Toast[1]").getText());
	
	server.stop();
	}
}
