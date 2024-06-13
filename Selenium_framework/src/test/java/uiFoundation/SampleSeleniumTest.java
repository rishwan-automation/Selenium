package uiFoundation;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Envirnment.ReadTestData;
import uiFoundation.BrowserInfo;
import uiFoundation.UiLibrary;
import utilities.Waits;
import pages.*;


public class SampleSeleniumTest extends BrowserInfo{
	WebDriver chDriver;
	WebElement userName;
	boolean result;
	String StrResult;

	@Test
	public void sampleTest() throws InterruptedException {
//		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\rishwank\\Desktop\\Selenium\\Lokavant_Maven\\src\\test\\resources\\chromedriver.exe");
//		chDriver = BrowserInfo.webDriver("Chrome");
//		chDriver.get("https://entity.nousinfo.com/Commonlogin/Login.aspx");
//		BrowserInfo.launchURL("Chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		BrowserInfo.launchURL("Chrome", ReadTestData.url);
		
//		Assignment 1
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rishwank\\Desktop\\Selenium\\Lokavant_Maven\\src\\test\\resources\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id=\"checkBoxOption1\"]")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//input[@id=\"checkBoxOption1\"]")).isSelected());
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id=\"checkBoxOption1\"]")).click();
		Assert.assertFalse(driver.findElement(By.xpath("//input[@id=\"checkBoxOption1\"]")).isSelected());
		driver.close();
		
		
//		Assignment 2
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//		System.out.println(driver.findElements(By.xpath("//div[@id=\"checkbox-example\"] //label")).size()); 

//		Thread.sleep(2000);
//		LoginPage.login("Admin","admin123");
////		utilities.Waits.wait(1000);
//		Waits.waitTillElementVisble(LoginPage.lnkAdminTab);
//		UiLibrary.uiClick(LoginPage.lnkAdminTab);
//		Waits.waitTillElementVisble(LoginPage.adminpg);
//		System.out.println("StrResult==>"+result);
//		chDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		BrowserInfo.closeBrowser();
//		chDriver = BrowserInfo.webDriver("Chrome");
//		userName = chDriver.findElement(By.xpath("//input[@id='imgLogin']"));
//		result = Waits.waitElementInvisibilityOf(userName);
//		result = userName.isDisplayed();
//		result = chDriver.findElement(By.cssSelector(".space-x-2")).isDisplayed();
//		result = UiLibrary.uiIsDisplayed(userName);
//		System.out.println("result==> "+result);
//		BrowserInfo.closeBrowser();
//		chDriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		chDriver.quit();
	}

}
