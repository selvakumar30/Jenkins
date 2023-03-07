package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPojo extends BaseClass {

	public AmazonPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[contains(text(),'sign ')]")
	private WebElement signinBtn;
	
	@FindBy(id="ap_email")
	private WebElement userTxt;
	
	@FindBy(id="continue")
	private WebElement continueBtn;

	public WebElement getSigninBtn() {
		return signinBtn;
	}

	public WebElement getUserTxt() {
		return userTxt;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}
}
