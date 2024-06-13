package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment7 {
	
	@Test
	public static void assignment6() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rishwank\\Desktop\\Selenium\\Lokavant_Maven\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://qaclickacademy.com/practice.php");
		
		System.out.println(driver.findElements(By.cssSelector(".table-display tr")).size()); 
		System.out.println(driver.findElements(By.cssSelector(".table-display th")).size());
		
		System.out.println(driver.findElement(By.cssSelector(".table-display tbody tr:nth-child(3)")).getText());
		driver.quit();
	}
		
}
