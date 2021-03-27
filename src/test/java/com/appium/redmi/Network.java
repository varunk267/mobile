package com.appium.redmi;

import java.io.IOException;

import org.openqa.selenium.ScreenOrientation;
import org.testng.annotations.Test;

import com.appium.generic.Tolaunch;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.Connection;

public class Network {
	@Test
	public void network() throws IOException
	{
		Tolaunch t=new Tolaunch();
		AndroidDriver driver = t.tolaunchmobapp("com.bhanu.notificationreminders",".MainDrawerActivity");
		System.out.println(driver.getConnection());
		driver.setConnection(Connection.ALL);
		driver.setConnection(Connection.DATA);
		
	}
}
