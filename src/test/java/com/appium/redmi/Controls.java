package com.appium.redmi;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.appium.generic.Tolaunch;

import io.appium.java_client.android.AndroidDriver;

public class Controls {
@Test
public void api_demos() throws IOException
{
	Tolaunch ta=new Tolaunch();
	AndroidDriver driver=ta.tolaunchmobapp("io.appium.android.apis", ".ApiDemos");
	driver.findElementByAccessibilityId("Views").click();
	driver.findElementByAccessibilityId("Controls").click();
	driver.findElementByAccessibilityId("2. Dark Theme").click();
	driver.findElementById("io.appium.android.apis:id/edit").sendKeys("varun");
	driver.findElementByAccessibilityId("Checkbox 1").click();
	driver.findElementByAccessibilityId("RadioButton 1").click();
	driver.hideKeyboard();
	driver.findElementById("android:id/text1").click();
	//to handle dropdown we dont want select class
	 List<WebElement> ddownele = driver.findElementsByClassName("android.widget.CheckedTextView");
	for ( WebElement a : ddownele) {
		String text = a.getText();
		if(text.equals("Earth"))
		{
			a.click();
			break;
		}
	}
}
}
