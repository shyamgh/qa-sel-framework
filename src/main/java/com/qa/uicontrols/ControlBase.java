package com.qa.uicontrols;

import org.openqa.selenium.WebElement;

public class ControlBase {

	private WebElement _element;

	public ControlBase(WebElement e) {
		this._element = e;
	}

	public WebElement getElement() {
		return _element;
	}

}
