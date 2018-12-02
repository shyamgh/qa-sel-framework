package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.pageelements.IHomePage;
import com.qa.selenium.PageBase;
import com.qa.uicontrols.ControlBase;

/**
 * Class to represent home page containing actions and verifications that can be
 * performed on this page
 * 
 * @author Shyam Hushangabadkar
 *
 */
public class HomePage extends PageBase implements IHomePage {

	@FindBy(css = "a[id='loginsubmit']")
	WebElement _login_btn;

	public HomePage() {

		WebDriverWait wait = new WebDriverWait(getDriver(), TIMEOUT_NORMAL);
		wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//div[@class='sectionnav']//a[text()='Personal']")));

		PageFactory.initElements(getDriver(), this);
		waitForPageLoad();
	}

	public ControlBase loginBtn() {
		return new ControlBase(_login_btn);
	}

}
