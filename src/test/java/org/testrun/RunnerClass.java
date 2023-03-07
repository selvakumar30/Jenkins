package org.testrun;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\FeatureFile", 
glue="org.stepdefinition",monochrome=true, dryRun=false, 
strict=false, snippets=SnippetType.CAMELCASE, tags= {"@Sanity, @Regression"},
plugin= {"html:target","junit:Report\\junitrepo.xml","json:Report\\jsonrepo.json",
		"rerun:Report\\rerun.txt"})

public class RunnerClass {

	@AfterClass
	public static void generateJvmReport() {
		
		JvmReport.report("D:\\java\\Reworks\\Maven\\CucumberProject\\Report\\jsonrepo.json");

	}
}
