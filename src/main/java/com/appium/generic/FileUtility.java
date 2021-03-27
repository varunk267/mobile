package com.appium.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	public String getpropdata(String key) throws IOException
	{
		FileInputStream fin=new FileInputStream(Iconstants.propfile_path);
		Properties p=new Properties();
		p.load(fin);
	return	p.getProperty(key);	
}
}
