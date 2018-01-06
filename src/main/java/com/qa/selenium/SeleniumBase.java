package com.qa.selenium;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class SeleniumBase {

	protected static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	private static Properties prop = null;
	public static final String URL = "https://www.hdfcbank.com/";
	public static final int TIMEOUT_MAX = 60;
	public static final int TIMEOUT_MIN = 5;
	public static final int TIMEOUT_NORMAL = 30;

	public WebDriver getDriver() {
		return driver.get();
	}

	public void setDriver(WebDriver d) {
		driver.set(d);
	}

	public void setImplicitWait(int seconds) {
		getDriver().manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
	}

	Properties config() {
		if (prop != null)
			return prop;

		prop = new Properties();

		try {
			prop.load(new FileReader(""));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop;
	}

}
