package com.qa.pages;

import org.openqa.selenium.support.PageFactory;

import com.qa.pageelements.ILoginPageElements;
import com.qa.selenium.PageBase;

/**
 * Class to represent Login page containing actions and verifications that can
 * be performed on this page
 * 
 * @author Shyam Hushangabadkar
 *
 */
public class LoginPage extends PageBase implements ILoginPageElements {

	public LoginPage() {
		PageFactory.initElements(getDriver(), this);
		waitForPageLoad();
	}

}
