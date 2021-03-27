package com.appium.redmi;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.appium.generic.Tolaunch;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class LongPress {
	@Test
	public void longprss() throws IOException
	{
	Tolaunch lnh=new Tolaunch();
	AndroidDriver driver = lnh.tolaunchmobapp("com.miui.calculator", ".cal.AllInOneCalculatorActivity");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	TouchAction ta=new TouchAction(driver);
	MobileElement five = (MobileElement) driver.findElement(By.id("com.miui.calculator:id/btn_5_s"));
	ta.longPress(five).waitAction(200).release().perform();
}
}
