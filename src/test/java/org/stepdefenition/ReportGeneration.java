package org.stepdefenition;

import java.util.ArrayList;
import java.util.List;
import java.io.File;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ReportGeneration {
	
	public static void generateRep(String json,String json2) {
		
		File file = new File("C:\\Users\\Jai\\eclipse-workspace\\AdactinCucuWithBSandPOJO\\src\\test\\resources\\jvmReport");
		
		Configuration config = new Configuration(file, "adactinJvmRep");
		config.addClassifications("Operating System", "Windows");
		config.addClassifications("Browser", "Chrome");
		config.addClassifications("Automation Tool", "Selenium:WebDriver");
		config.addClassifications("version", "83.0");
		
		List<String> li=new ArrayList<String>();
		li.add(json);
		li.add(json2);
		
		ReportBuilder rb=new ReportBuilder(li, config);
		rb.generateReports();
		
	}

}
