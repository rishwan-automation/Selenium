package uiFoundation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserInfo {
	public static WebDriver driver;
	public WebDriver myDriver;
	
	private static void driverLocation() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rishwank\\Desktop\\Selenium\\Lokavant_Maven\\src\\test\\resources\\chromedriver.exe");
	}
//	
	
//	Initializing the Webdriver
	public void webDriver (String browserName) {
		if(browserName == "Chrome") {
			BrowserInfo.driverLocation();
			driver = new ChromeDriver();
		}else {
			System.out.println("OOPs!!! I Cound not find the driver");
		}
	}
	
	
	public static WebDriver myDriver () {
		return driver;
	}
	
	
//	Launch URL
	public static void launchURL (String browserName,String url) throws InterruptedException {
		BrowserInfo browserInfo = new BrowserInfo();
		browserInfo.webDriver(browserName);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get(url);
		
//		myDriver = BrowserInfo.webDriver(browserName);
//		myDriver.manage().window().maximize();
//		Thread.sleep(2000);
//		driver.get(url);
	}
	
	
	
//	Close the Browser
	public static void closeBrowser() {
		driver.quit();
	}

}
