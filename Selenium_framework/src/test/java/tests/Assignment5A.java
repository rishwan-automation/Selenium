package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment5A {

	
	@Test
	public static void iframes () {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rishwank\\Desktop\\Selenium\\Lokavant_Maven\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		
		
		driver.findElement(By.xpath("//a[.='Nested Frames']")).click();
		driver.switchTo().frame(0);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='/frame_middle']")));
		System.out.println(driver.findElement(By.id("content")).getText()); 
		driver.quit();
		
	}
}
