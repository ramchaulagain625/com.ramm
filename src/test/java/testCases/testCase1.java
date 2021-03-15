package testCases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class testCase1 {

public ExtentHtmlReporter htmlReporter;
public ExtentReports extent;
public ExtentTest test;
	
	@BeforeTest
	public void setReport() {
		
	htmlReporter = new ExtentHtmlReporter("./reports/extent.html");	
		
	htmlReporter.config().setEncoding("utf-8");
	htmlReporter.config().setDocumentTitle("Ram Practice Reports");
	htmlReporter.config().setReportName("Practice Test Results");
	htmlReporter.config().setTheme(Theme.STANDARD);
	
	
	extent = new ExtentReports();
	extent.attachReporter(htmlReporter);
	
	extent.setSystemInfo("PRactice test ","Ram chau");
	extent.setSystemInfo("organization ","postOakPath"); 
	extent.setSystemInfo("BUild No ","Rc-625");
	
	
	
	}
	
	@AfterTest
	public void endReport() {
	extent.flush();	
		
		
	}
	
	
	
	
	
	
	
	
	
}
