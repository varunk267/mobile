package com.abc.generalstore;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.abc.generalstore.objectrepository.Login;
import com.appium.generic.Baseclass;

public class TC_01 extends Baseclass{
@Test
public void tc_01() throws IOException, InterruptedException
{
	Login signin=new Login(driver);
	signin.logintoapp();
}
}
