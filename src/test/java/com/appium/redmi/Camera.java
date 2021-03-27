package com.appium.redmi;

import java.io.IOException;

import org.testng.annotations.Test;

import com.appium.generic.Tolaunch;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class Camera {
@Test
public void snap() throws IOException
{
	Tolaunch t=new Tolaunch();
	AndroidDriver driver = t.tolaunchmobapp("com.android.camera", ".VideoCamera");
	//it will take a snapshot automatically
	driver.pressKeyCode(AndroidKeyCode.KEYCODE_CAMERA);
	//to increase the volume
//	driver.pressKeyCode(AndroidKeyCode.KEYCODE_VOLUME_UP);
//	//to decrease the volume
//	driver.pressKeyCode(AndroidKeyCode.KEYCODE_VOLUME_DOWN);
//	//to increase brightness
//	driver.pressKeyCode(AndroidKeyCode.KEYCODE_BRIGHTNESS_UP);
//	//to decrease brightness
//	driver.pressKeyCode(AndroidKeyCode.KEYCODE_BRIGHTNESS_DOWN);
	
}
}
