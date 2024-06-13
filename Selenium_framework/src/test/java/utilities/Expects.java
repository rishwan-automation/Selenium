package utilities;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import uiFoundation.BrowserInfo;

public class Expects extends BrowserInfo{

	public static WebElement srtUiElement;
	public static ExpectedCondition<WebElement> strFlag;

	
	public static boolean elementIsPresent(By element) {
		srtUiElement = myDriver().findElement(element);
		try {
			strFlag = ExpectedConditions.visibilityOf(srtUiElement);
			return true;
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			return false;
		}
	}
	
	public static boolean elementIsClickable(By element) {
		srtUiElement = myDriver().findElement(element);
		try {
			strFlag = ExpectedConditions.elementToBeClickable(srtUiElement);
			return true;
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			return false;
		}
	}
	
	public static void waitTillAlert() {
		ExpectedConditions.alertIsPresent();
	}
	
	public static boolean ElementInvisibilityOf(By element) {
		srtUiElement = myDriver().findElement(element);
		ExpectedCondition<Boolean> result = null;
		try {
			result = ExpectedConditions.invisibilityOf(srtUiElement);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(result == srtUiElement) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean ElementIsPresent(By element) {
		try {
			strFlag = ExpectedConditions.presenceOfElementLocated(element);
			return true;
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			return false;
		}
		
	}
	
}
