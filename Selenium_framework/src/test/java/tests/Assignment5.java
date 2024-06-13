package tests;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Assignment5 {

	@Test
	public static void assignment() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rishwank\\Desktop\\Selenium\\Lokavant_Maven\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");

		driver.findElement(By.xpath("//a[.='Multiple Windows']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".example a")));
		driver.findElement(By.cssSelector(".example a")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String firstWindow = it.next();
		String secondWindow = it.next();
		driver.switchTo().window(secondWindow);
		System.out.println(driver.findElement(By.cssSelector(".example")).getText());
		driver.switchTo().window(firstWindow);
		System.out.println(driver.findElement(By.cssSelector(".example h3")).getText());
		driver.quit();

	}

}
