package tests;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Assignment6 {
	
	@Test
	public static void assignment6() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rishwank\\Desktop\\Selenium\\Lokavant_Maven\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://qaclickacademy.com/practice.php");
		String optionValue;
		String alertTxt;
		driver.findElement(By.xpath("//input[@id=\"checkBoxOption3\"]")).click();
		optionValue = driver.findElement(By.xpath("//input[@id=\"checkBoxOption3\"]//parent::label")).getText();
		Select opt = new Select(driver.findElement(By.id("dropdown-class-example")));
		opt.selectByVisibleText(optionValue);
		driver.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys(optionValue);
		driver.findElement(By.cssSelector("#alertbtn")).click();
		alertTxt = driver.switchTo().alert().getText();
		if(alertTxt.contains(optionValue)) {
			System.out.println(optionValue+" Is displayed in alart");
		}else {
			System.out.println(optionValue+" Is not displayed in alart");
		}
		driver.quit();
		
		
		

		
		
		
	
	}

}
