package com.qa.pages;

import org.openqa.selenium.support.PageFactory;

import com.qa.pageelements.ILoginPageElements;
import com.qa.selenium.PageBase;

public class LoginPage extends PageBase implements ILoginPageElements {

	public LoginPage() {
		PageFactory.initElements(getDriver(), this);
		waitForPageLoad();
	}

}
