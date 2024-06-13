package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment8 {

	@Test
	public static void assignment8() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rishwank\\Desktop\\Selenium\\Lokavant_Maven\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://qaclickacademy.com/practice.php");
		
		driver.findElement(By.id("autocomplete")).sendKeys("Unit");
		Thread.sleep(2000);
		for(int i = 0;i<=2;i++) {
			driver.findElement(By.id("autocomplete")).sendKeys(Keys.ARROW_DOWN);
		}
		String strDDName = driver.findElement(By.id("autocomplete")).getAttribute("value");
		System.out.println("strDDName==>"+ strDDName);
		driver.quit();
	}
}
