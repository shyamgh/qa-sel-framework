package com.qa.tests;

import org.testng.annotations.Test;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.selenium.TestBase;

public class LoginTest1 extends TestBase {

	@Test
	public void loginTest1() {
		HomePage hp = new HomePage();
		hp.loginBtn().getElement().click();
		LoginPage lp = new LoginPage();
	}

	@Test
	public void loginTest2() {
		HomePage hp = new HomePage();
		hp.loginBtn().getElement().click();
		LoginPage lp = new LoginPage();
	}

	@Test
	public void loginTest3() {
		HomePage hp = new HomePage();
		hp.loginBtn().getElement().click();
		LoginPage lp = new LoginPage();
	}
}
