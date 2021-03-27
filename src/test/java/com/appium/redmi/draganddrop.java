package com.appium.redmi;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.appium.generic.Tolaunch;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class draganddrop {
@Test
public void Api_demos() throws IOException
{
	Tolaunch ta=new Tolaunch();
	AndroidDriver driver=ta.tolaunchmobapp("io.appium.android.apis", ".ApiDemos");
	driver.findElementByAccessibilityId("Views").click();
	driver.findElementByAccessibilityId("Drag and Drop").click();
	WebElement dragele = driver.findElementByXPath("//android.view.View[@resource-id='io.appium.android.apis:id/drag_dot_1']");
	WebElement dst = driver.findElementById("io.appium.android.apis:id/drag_dot_2");
	TouchAction t=new TouchAction(driver);
	t.longPress(dragele).waitAction(3000).moveTo(dst).release().perform();
	
}
}
