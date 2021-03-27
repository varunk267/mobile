package com.appium.redmi;

import java.io.IOException;

import org.testng.annotations.Test;

import com.appium.generic.Tolaunch;

import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class multitouch {
@Test
public void touchscreen() throws IOException
{
	Tolaunch t=new Tolaunch();
	AndroidDriver driver = t.tolaunchmobapp("jp.rallwell.siriuth.touchscreentest",".TouchScreenTestActivity");
	int x=driver.manage().window().getSize().getWidth()/2;
	int y=driver.manage().window().getSize().getHeight()/2;
	
	TouchAction finger1=new TouchAction(driver);
	finger1.press(x, y-100).moveTo(x, y-600);
	
	TouchAction finger2=new TouchAction(driver);
	finger2.press(x, y+100).moveTo(x, y+600);
	
	MultiTouchAction mt=new MultiTouchAction(driver);
	mt.add(finger1).add(finger2).perform();
	
	
	
}
}
