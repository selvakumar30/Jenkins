package org.testrun;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {

	public static void report(String jsonReportFilePath) {
		
		File f=new File("D:\\java\\Reworks\\Maven\\CucumberProject\\src\\test\\resources");
		
		Configuration c=new Configuration(f, "Facebook & Amazon");
		c.addClassifications("Platform Name", "Windows");
		c.addClassifications("Platform Version", "11");
		c.addClassifications("Browser Name", "Google Chrome");
		c.addClassifications("Browser Version", "102");
		c.addClassifications("Sprint No", "3");
		
		List<String> l=new ArrayList<String>();
		l.add(jsonReportFilePath);
		
		ReportBuilder r=new ReportBuilder(l, c);
		
		r.generateReports();

	}
}
