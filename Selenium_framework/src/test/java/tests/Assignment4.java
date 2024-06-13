package tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Assignment4 {

	@Test
	public void assignment() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rishwank\\Desktop\\Selenium\\Lokavant_Maven\\src\\test\\resources\\chromedriver.exe");

		String userName = "rahulshettyacademy";
		String passWord = "learning";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("[id=\"username\"]")).sendKeys(userName);
		driver.findElement(By.id("password")).sendKeys(passWord);
		driver.findElement(By.xpath("(//label[@class=\"customradio\"]/span[@class=\"checkmark\"])[2]")).click();
		driver.findElement(By.cssSelector("[id=\"okayBtn\"]")).click();
		Select option = new Select(driver.findElement(By.xpath("//select[@class=\"form-control\"]")));
		option.selectByIndex(2);
		driver.findElement(By.cssSelector("[id=\"terms\"]")).click();
		driver.findElement(By.cssSelector("[id=\"signInBtn\"]")).click();

		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class=\"nav-link btn btn-primary\"]")));
		List<WebElement> addButton = driver.findElements(By.xpath("//button[@class=\"btn btn-info\"]"));
		for (int i = 0; i < addButton.size(); i++) {
			addButton.get(i).click();
		}
		driver.findElement(By.xpath("//a[@class=\"nav-link btn btn-primary\"]")).click();
		driver.quit();

	}
}
