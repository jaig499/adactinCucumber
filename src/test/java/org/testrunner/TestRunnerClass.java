package org.testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepdefenition.ReportGeneration;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\featureFile\\CancellingHotelBooking.feature",
				 monochrome=true,
				 dryRun=false,
				 glue="org.stepdefenition",
				 plugin= {"json:src\\test\\resources\\jsonReport\\adactinjson_two.json",
						  "rerun:src\\test\\resources\\failedTest\\failed.txt"
						 }
				
		
				)
public class TestRunnerClass {
	
	@AfterClass
	public static void report() {
		ReportGeneration.generateRep("C:\\Users\\Jai\\eclipse-workspace\\AdactinCucuWithBSandPOJO\\src\\test\\resources\\jsonReport\\adactinjson.json",
										"C:\\Users\\Jai\\eclipse-workspace\\AdactinCucuWithBSandPOJO\\src\\test\\resources\\jsonReport\\adactinjson_two.json");
	}
}
