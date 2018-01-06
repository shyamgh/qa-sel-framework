package com.qa.selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase extends SeleniumBase {

	@BeforeClass
	public void beforeClassInSuper() {
		System.setProperty("webdriver.chrome.driver", "C:\\Development\\Selenium\\Drivers\\chromedriver.exe");
		driver.set(new ChromeDriver());
		setImplicitWait(TIMEOUT_NORMAL);
		getDriver().get(URL);
		System.out.println("driver initialized...");
	}

	@AfterClass
	public void afterClassInSuper() {
		try {
			if (getDriver() != null) {
				getDriver().quit();
			}
		} catch (Exception e) {
			System.out.println("driver closed...");
		}
	}

}
