package com.qa.uicontrols;

import org.openqa.selenium.WebElement;

/**
 * Class which is parent of all UI controls on AUT. It contains methods common
 * for all UI controls. It also handles UI controls synchronization.
 * 
 * @author Shyam Hushangabadkar
 *
 */

public class ControlBase {

	private WebElement _element;

	public ControlBase(WebElement e) {
		this._element = e;
	}

	public WebElement getElement() {
		return _element;
	}

}
