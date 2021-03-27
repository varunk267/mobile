package com.abc.generalstore.objectrepository;

import java.io.IOException;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.support.PageFactory;

import com.appium.generic.FileUtility;
import com.appium.generic.Iconstants;
import com.appium.generic.MobileActions;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Login {
	AndroidDriver driver;
	public Login(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	} 
@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='android:id/text1']")
private MobileElement country;
@AndroidFindBy(id="com.androidsample.generalstore:id/nameField")
private MobileElement usernametxtbox;
@AndroidFindBy(id="com.androidsample.generalstore:id/radioMale")
private MobileElement maleradiobtn;
@AndroidFindBy(id="com.androidsample.generalstore:id/radioFemale")
private MobileElement femaleradiobtn;
@AndroidFindBy(id="com.androidsample.generalstore:id/btnLetsShop")
private MobileElement loginbtn;
public MobileElement getCountry() {
	return country;
}
public MobileElement getName() {
	return usernametxtbox;
}
public MobileElement getMaleradiobtn() {
	return maleradiobtn;
}
public MobileElement getFemaleradiobtn() {
	return femaleradiobtn;
}
public MobileElement getLoginbtn() {
	return loginbtn;
}
MobileActions mlib=new MobileActions();
FileUtility flib=new FileUtility();
/**
 * 
 * @param driver
 * @throws IOException
 * @throws InterruptedException 
 */
public void logintoapp() throws IOException, InterruptedException
{
	Thread.sleep(10000);
	mlib.scrolling(driver, "text", flib.getpropdata("countryname"));
	usernametxtbox.sendKeys(flib.getpropdata("username"));
	driver.hideKeyboard();
	maleradiobtn.click();
	loginbtn.click();
}
/**
 * 
 * @param driver
 * @param name
 * @param countryname
 */
public void logintoapp(String name,String countryname)
{
	mlib.scrolling(driver, "text",countryname );
	usernametxtbox.sendKeys(name);
	driver.hideKeyboard();
	maleradiobtn.click();
	loginbtn.click();
}

}
