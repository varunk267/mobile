package com.appium.redmi;

import java.io.IOException;

import org.testng.annotations.Test;

import com.appium.generic.Tolaunch;

import io.appium.java_client.android.AndroidDriver;

public class Switchapp1 {
@Test
public void switchapp() throws IOException
{
	Tolaunch t=new Tolaunch();
	AndroidDriver driver = t.tolaunchmobapp("com.android.camera", ".VideoCamera");
	String apppackage="";
	String appactivity="";
	//switching from one app to another app
	driver.startActivity(apppackage, appactivity);
	//to run the app in background
	driver.runAppInBackground(10);
	//switch back
	driver.launchApp();
}
}
