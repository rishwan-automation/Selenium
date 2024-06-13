package uiFoundation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class UiLibrary extends BrowserInfo{
	
	public static void uiClick(By element) {
		WebElement ele = myDriver().findElement(element);
		boolean boolFlag = UiLibrary.uiIsDisplayed(element);
		if(boolFlag == true) {
			ele.click();
		}else {
			System.out.println("OOPS!! Element not found");
		}
	}
	
	
	public static String uiGetText(By element) {
		String strReturnText = null;
		WebElement ele = myDriver().findElement(element);
		boolean boolFlag = UiLibrary.uiIsDisplayed(element);
		if(boolFlag == true) {
			strReturnText = ele.getText();
		}else {
			System.out.println("OOPS!! Element not found");
		}
		return strReturnText;
	}
	
	public static void uiSetValue(By element,String strText) {
		
//		WebElement ele = myDriver().findElement(element);
		WebElement ele = myDriver().findElement(element);
		boolean boolFlag = UiLibrary.uiIsDisplayed(element);
		if(boolFlag == true) {
			ele.sendKeys(strText);
		}else {
			System.out.println("OOPS!! Element not found");
		}
	}
	
	
	public static boolean uiIsDisplayed (By element) {
		WebElement ele = myDriver().findElement(element);
		if(ele.isDisplayed() == true) {
			return true;
		}else {
			return false;
		}
	}
	
	
	public static boolean uiIsEnabled (By element) {
		WebElement ele = myDriver().findElement(element);
		if(ele.isEnabled() == true) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean uiISelected (By element) {
		WebElement ele = myDriver().findElement(element);
		if(ele.isSelected() == true) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void selectDDValue(By element,String strText) {
		WebElement ele = myDriver().findElement(element);
		Select option = new Select(ele);
		option.selectByVisibleText(strText);
	}

	
	public static void scrollToTheElement(By element) {
		WebElement ele = myDriver().findElement(element);
		JavascriptExecutor js = (JavascriptExecutor) myDriver();
		js.executeScript("arguments[0].scrollIntoView();", ele);
	}
}
