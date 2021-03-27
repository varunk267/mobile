package com.appium.redmi;

import java.io.IOException;

import org.testng.annotations.Test;

import com.appium.generic.Tolaunch;

import io.appium.java_client.android.AndroidDriver;

public class Open_notification {
@Test
public void notification() throws IOException
{
	Tolaunch t=new Tolaunch();
	AndroidDriver driver = t.tolaunchmobapp("com.bhanu.notificationreminders",".MainDrawerActivity");
	driver.openNotifications();
	
}
}
