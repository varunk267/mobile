package com.appium.redmi;

import java.io.IOException;

import org.testng.annotations.Test;

import com.appium.generic.Tolaunch;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class vol_bright {
@Test
public void generalstore() throws IOException, InterruptedException{
Tolaunch ta=new Tolaunch();
AndroidDriver driver=ta.tolaunchmobapp("com.miui.calculator",".cal.AllInOneCalculatorActivity");
	driver.pressKeyCode(AndroidKeyCode.KEYCODE_VOLUME_UP);
	Thread.sleep(2000);
	driver.pressKeyCode(AndroidKeyCode.KEYCODE_VOLUME_DOWN);
	
	driver.pressKeyCode(AndroidKeyCode.KEYCODE_VOLUME_DOWN);
	
	driver.pressKeyCode(AndroidKeyCode.KEYCODE_VOLUME_MUTE);
	Thread.sleep(2000);
	driver.pressKeyCode(AndroidKeyCode.KEYCODE_BRIGHTNESS_UP);
	Thread.sleep(2000);
	driver.pressKeyCode(AndroidKeyCode.KEYCODE_BRIGHTNESS_DOWN);
	
	
	
		
	}
}
