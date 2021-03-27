package com.appium.redmi;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.appium.generic.MobileActions;
import com.appium.generic.Tolaunch;

import io.appium.java_client.android.AndroidDriver;

public class swicthtowebapp {
	MobileActions mlib=new MobileActions();
@Test
public void generalstore() throws IOException, InterruptedException 
{
Tolaunch t=new Tolaunch();
AndroidDriver driver = t.tolaunchmobapp("com.androidsample.generalstore", ".SplashActivity");
driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("varun");
driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
mlib.scrolling(driver, "text", "PG 3");
//driver.findElementByXPath("//android.widget.TextView[@resource-id='com.androidsample.generalstore:id/productAddCart']");
driver.findElementByXPath("//android.widget.TextView[@text='ADD TO CART']").click();
driver.findElementById("com.androidsample.generalstore:id/appbar_btn_cart").click();
Thread.sleep(2000);
driver.findElementById("com.androidsample.generalstore:id/btnProceed").click();
Thread.sleep(2000);
Set<String> apps = driver.getContextHandles();
for (String app : apps) {
	System.out.println(app);
}
driver.context("WEBVIEW_com.androidsample.generalstore");
driver.findElementByXPath("//input[@name='q']").sendKeys("kera");
		
		
}
}
