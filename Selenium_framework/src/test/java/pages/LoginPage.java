package pages;

import org.openqa.selenium.By;
import uiFoundation.UiLibrary.*;
import utilities.Waits;

public class LoginPage {
	public static By inpUserName = By.xpath("//input[@name='username']");
	public static By inpPassWord = By.xpath("//input[@name='password']");
	public static By btnLogin = By.xpath("//button[text()=' Login ']");
	public static By txtDashboard = By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']");
	public static By lnkAdminTab = By.xpath("//a[.='Admin']");
	public static By adminpg = By.xpath("//h5[@class='oxd-text oxd-text--h5 oxd-table-filter-title']");
	
	
	
	
	public static void login(String strUserName, String strPassWord) {
		Waits.waitTillElementVisble(LoginPage.inpUserName);
		uiFoundation.UiLibrary.uiSetValue(LoginPage.inpUserName, strUserName);
		uiFoundation.UiLibrary.uiSetValue(LoginPage.inpPassWord, strPassWord);
		uiFoundation.UiLibrary.uiClick(btnLogin);
	}
	
}
