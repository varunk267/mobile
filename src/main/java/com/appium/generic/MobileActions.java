package com.appium.generic;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
/**
 * 
 * @author varun
 *
 */
public class MobileActions 
{
	/**
	 * Used to scroll till it matches the attribute name amd value or for particular element
	 * @param driver
	 * @param an
	 * attribute name : it should be given only text
	 * @param av
	 * attribute value
	 */
public void scrolling(AndroidDriver driver,String an,String av)
	{	
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))");
	}
/**
 * used to take screenshot
 * @param driver
 * @param name
 * @throws IOException
 */
public void capture(AndroidDriver driver,String name) throws IOException
{
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=driver.getScreenshotAs(OutputType.FILE);
	File dst=new File(Iconstants.screenshotfile_path+"/"+name+".png");
	FileUtils.copyFile(src, dst);
}
/**
 * used to long press the element 
 * @param driver
 * @param element
 */
public void longpress(AndroidDriver driver,MobileElement element)
{
	TouchAction ta=new TouchAction(driver);
	
	ta.longPress(element).waitAction(Iconstants.longpress_wait).release().perform();
}
/**
 * 
 * @param driver
 * @param drag
 * @param drop
 */
public void draganddrop(AndroidDriver driver,MobileElement drag,MobileElement drop)
{
	TouchAction ta=new TouchAction(driver);
	ta.longPress(drag).waitAction(Iconstants.longpress_wait).moveTo(drop).perform();
}
/**
 * to get toast message
 * @param driver
 * @return
 */
public String toastmessage(AndroidDriver driver)
{
	return driver.findElementByXPath("//android.widget.Toast[1]").getText();
}
/**
 * use to swipe from bottom to top
 * @param driver
 * @param ystart
 * @param yend
 */
public void swipedowntotop(AndroidDriver driver, double ystart,double yend)
{
	 int width = driver.manage().window().getSize().getWidth();
	 int height = driver.manage().window().getSize().getHeight();
	
	int startx=width/2;
	 int starty=(int) (height*ystart);
	int endy=(int) (height*yend);
	driver.swipe(startx, starty, startx, endy, 1000);
}
/**
 * use to switch apps
 * @param driver
 * @param name
 */
public void switchtoapp(AndroidDriver driver,String name)
{
	driver.context(name);
}
public void switchback(AndroidDriver driver)
{
	driver.launchApp();
}
/**
 * 
 * @param driver
 * @param element
 */
public void visibilityofelement(AndroidDriver driver,MobileElement element)
{
	WebDriverWait ww=new WebDriverWait(driver, 10);
	ww.until(ExpectedConditions.visibilityOf(element));
}
/**
 * 
 * @param driver
 * @param element
 */
public void elementtobeclickable(AndroidDriver driver,MobileElement element)
{
	WebDriverWait ww=new WebDriverWait(driver, 10);
	ww.until(ExpectedConditions.elementToBeClickable(element));
}

}
