package utilities;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import uiFoundation.*;


public class Waits extends BrowserInfo {

	
	
	public static WebDriverWait uiWait = new WebDriverWait(myDriver(),30);
	
	public static void waitTillElementIsPresent(By element) {
		uiWait.until(ExpectedConditions.presenceOfElementLocated(element));
	} 
	
	public static void waitTillElementVisble(By element) {
		uiWait.until(ExpectedConditions.visibilityOfElementLocated(element));
	} 
	
	public static void waitTillElementInVisble(By element) {
		WebElement ele = myDriver().findElement(element);
		uiWait.until(ExpectedConditions.invisibilityOf(ele));
	} 
	
	public static void waitTillElementInDisplayed(By element) {
		WebElement ele = myDriver().findElement(element);
		uiWait.until(ExpectedConditions.visibilityOf(ele));
	} 
	
	
	public static void waitTilElementToBeClickable(By element) {
		WebElement ele = myDriver().findElement(element);
		uiWait.until(ExpectedConditions.elementToBeClickable(ele));
	} 
	
	public static void waitTilElementToBeSelected(By element) {
		WebElement ele = myDriver().findElement(element);
		uiWait.until(ExpectedConditions.elementToBeSelected(ele));
	} 
	
	
	public static void wait (int seconds) {
		
		myDriver().manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
	}
	
	

}
