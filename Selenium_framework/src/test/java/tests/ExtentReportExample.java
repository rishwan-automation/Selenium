package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import com.aventstack.extentreports.
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportExample {
	static ExtentReports ExpObj;
	
	@BeforeTest
	public static void repObj() {
		String Path = System.getProperty("user.dir")+"\\Reports\\index.html";
		ExtentSparkReporter spObj = new ExtentSparkReporter(Path);
		spObj.config().setDocumentTitle("ReportExample");
		spObj.config().setReportName("FirstReport");
		
		ExpObj = new ExtentReports();
		ExpObj.attachReporter(spObj);
		
		
		
	}
	
	@Test
	public static void reportExample() {
		ExpObj.createTest("Demo Test");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rishwank\\Desktop\\Selenium\\Lokavant_Maven\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://qaclickacademy.com/practice.php");
		ExpObj.flush();
		
	}
	

}
