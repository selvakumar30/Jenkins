package org.stepdefinition;

import org.base.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends BaseClass {
	
	@Before(order=5)
	public void browserLaunch() {
		launchBrowser();

	}
	
	@Before(order=8)
	public void tomaxim() {
		
		toMaximize();
	}
	
	@After(order=3)
	public void closeBrowser() {
		toQuitBrowser();

	}
	
	@After(order=6)
	public void takeScreenshot(Scenario s) {
		if (s.isFailed()) {
			TakesScreenshot ts=(TakesScreenshot)driver;
			byte[] ss = ts.getScreenshotAs(OutputType.BYTES);
			s.embed(ss, "image/png");
			System.out.println("Failed Scenario Name : " + s.getName());
		}

	}
}
