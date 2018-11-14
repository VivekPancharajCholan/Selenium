package com.test.demo.MavenTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver d;

	 @Test
		public void go()
		{
		 
			System.setProperty("webdriver.gecko.driver", "D:\\New folder\\Local Disk (F)\\selenium\\geckodriver-v0.20.1-win64(1)\\geckodriver.exe");
		  d = new FirefoxDriver();
		  d.get("http://omayo.blogspot.com/");
			
		}
}
