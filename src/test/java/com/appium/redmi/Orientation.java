package com.appium.redmi;

import java.io.IOException;

import org.openqa.selenium.ScreenOrientation;
import org.testng.annotations.Test;

import com.appium.generic.Tolaunch;

import io.appium.java_client.android.AndroidDriver;

public class Orientation {
	@Test
	public void notification() throws IOException
	{
		Tolaunch t=new Tolaunch();
		AndroidDriver driver = t.tolaunchmobapp("com.bhanu.notificationreminders",".MainDrawerActivity");
		System.out.println(driver.getOrientation());
		driver.rotate(ScreenOrientation.LANDSCAPE);
		driver.rotate(ScreenOrientation.PORTRAIT);
		
	}
}
