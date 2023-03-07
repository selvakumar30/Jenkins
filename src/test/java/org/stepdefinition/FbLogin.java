package org.stepdefinition;

import java.io.IOException;

import org.base.BaseClass;
import org.pojo.LoginPojo;

import io.cucumber.java.en.When;

public class FbLogin extends BaseClass{

	LoginPojo l;
	@When("User to launch the Url")
	public void userToLaunchTheUrl() {
	    loadUrl("https://www.facebook.com/");
	}

	@When("To fill the email in the email field")
	public void toFillTheEmailInTheEmailField() throws IOException {
	   l=new LoginPojo();
	   String value = readValue("FBExcel", "Details", 0, 1);
	   toFillTxt(l.getEmailTxt(), value);
	}

	@When("To fill the password in the Password field")
	public void toFillThePasswordInThePasswordField() throws IOException {
	    l=new LoginPojo();
	    String value = readValue("FBExcel", "Details", 1, 1);
	    toFillTxt(l.getPassTxt(), value);
	}

	@When("User to Click Login button")
	public void userToClickLoginButton() {
	    l=new LoginPojo();
	    toClick(l.getLoginBtn());
	}

}
