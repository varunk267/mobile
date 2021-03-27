package com.appium.redmi;

import java.io.IOException;

import org.testng.annotations.Test;

import com.appium.generic.Tolaunch;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.Connection;

public class Connectioncls {
@Test
public void connect() throws IOException, InterruptedException
{
	Tolaunch ta=new Tolaunch();
	AndroidDriver driver=ta.tolaunchmobapp("com.miui.calculator",".cal.AllInOneCalculatorActivity");
	System.out.println(driver.getConnection());
	
	driver.setConnection(Connection.ALL);
//	System.out.println(driver.getConnection());
////	Thread.sleep(2000);
//	driver.setConnection(Connection.ALL);
//	System.out.println(driver.getConnection());
////	Thread.sleep(2000);
//	driver.setConnection(Connection.WIFI);
//	System.out.println(driver.getConnection());
	
	
}
}
