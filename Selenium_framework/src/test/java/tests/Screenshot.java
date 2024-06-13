package tests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Screenshot {

	@Test
	public static void screenshot() throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rishwank\\Desktop\\Selenium\\Lokavant_Maven\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\Users\\rishwank\\Desktop\\Selenium\\Lokavant_Maven\\src\\main\\resources\\Screenshots\\src.png"));

	
	}
	
	
}
