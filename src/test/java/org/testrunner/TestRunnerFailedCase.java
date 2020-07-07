package org.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\featureFile\\failed.txt",glue="org.stepdefenition")
public class TestRunnerFailedCase {

}
