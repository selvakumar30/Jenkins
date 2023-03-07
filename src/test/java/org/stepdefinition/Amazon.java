package org.stepdefinition;

import org.base.BaseClass;
import org.pojo.AmazonPojo;

import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Amazon extends BaseClass {
	AmazonPojo a;
	@When("User to launch the Amazon Application")
	public void userToLaunchTheAmazonApplication() {
	    loadUrl("https://www.amazon.in/");
	}

	@When("User to Click Signin button")
	public void userToClickSigninButton() {
	    a=new AmazonPojo();
	    toClick(a.getSigninBtn());
	}

	@When("To fill the Username in the user field")
	public void toFillTheUsernameInTheUserField() {
	    a=new AmazonPojo();
	    toFillTxt(a.getUserTxt(), "968856884");
	    Assert.assertEquals("9688568995", "968856884");
	}

	@When("User to Click Continue button")
	public void userToClickContinueButton() {
	   a=new AmazonPojo();
	   toClick(a.getContinueBtn());
	}

}
