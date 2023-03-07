package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.base.BaseClass;
import org.pojo.LoginPojo;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass{

	LoginPojo l;

	@When("user have launch the URl")
	public void userHaveLaunchTheURl() {
	   loadUrl("https://www.facebook.com/");
	}

	@When("To fill the email in the User Field")
	public void toFillTheEmailInTheUserField(DataTable d) {
	   l=new LoginPojo();
	   Map<String, String> m = d.asMap(String.class, String.class);
	   toFillTxt(l.getEmailTxt(), m.get("email2"));
		
	}

	@When("To fill the password in the password Field")
	public void toFillThePasswordInThePasswordField(DataTable d) {
	    l=new LoginPojo();
	    List<Map<String, String>> m = d.asMaps();
	    toFillTxt(l.getPassTxt(), m.get(1).get("pass2"));
	}

	@When("user have to click login button")
	public void userHaveToClickLoginButton() {
	   toClick(l.getLoginBtn());
	}

	
}
