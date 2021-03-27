package com.appium.redmi;

import java.io.IOException;

import org.testng.annotations.Test;

import com.appium.generic.Tolaunch;

import io.appium.java_client.android.AndroidDriver;

public class Runappinbgd {
@Test
public void run() throws IOException, InterruptedException
{
	Tolaunch ta=new Tolaunch();
	AndroidDriver driver=ta.tolaunchmobapp("com.miui.calculator",".cal.AllInOneCalculatorActivity");
	//to run app in background
	//driver.runAppInBackground(10);
	//to switch from one app to another
	String apppackage="com.androidsample.generalstore";
	String appactivity=".SplashActivity";
	driver.startActivity(apppackage, appactivity);
	Thread.sleep(3000);
	//to switchback
	driver.launchApp();
	
}
}
