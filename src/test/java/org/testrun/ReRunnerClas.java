package org.testrun;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="@D:\\java\\Reworks\\Maven\\CucumberProject\\Report\\rerun.txt",
glue="org.stepdefinition",
monochrome=true)
public class ReRunnerClas {

}
