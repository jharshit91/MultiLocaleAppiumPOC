package ScreenHandler;

import PageObjectBase.AppSettingPage;
import PageObjectBase.LoginPage;
import pageObjects.LoginPage_ES;
import pageObjects.LoginPage_Eng;
import pageObjects.LoginPage_FR;
import pageObjects.LoginPage_PT;
import pageObjects.SettingPage_ES;
import pageObjects.SettingPage_Eng;
import pageObjects.SettingPage_FR;
import pageObjects.SettingPage_PT;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

/**
*
 * 
 * @author jharshit91
 *
 */


public class AllPageHandler {
	private AppiumDriver<MobileElement> driver;

	public AllPageHandler(AppiumDriver<MobileElement> driver) 
	{
		this.driver = driver;

	}

	private LoginPage loginPage;
	private AppSettingPage appSetting;

	public LoginPage getLoginPage() {
		return loginPage;
	}

	public AppSettingPage getAppSettingPage() {
		return appSetting;
	}

	
	
	public void initScreens(String languageFlag) {

		switch (languageFlag) {

		case "en-US":
			initEnglishPages();
			break;

		case "fr-FR":
			initFrenchPages();
			break;

		case "es-ES":
			initSpanishPages();
			break;

		case "pt-PT":
			initportugalPages();
			break;

		default:
			initEnglishPages();	
		}

	}

	public void initEnglishPages() {

		loginPage = new LoginPage(driver, new LoginPage_Eng());
		appSetting = new AppSettingPage(driver, new SettingPage_Eng());

	}

	public void initFrenchPages() {
		loginPage = new LoginPage(driver, new LoginPage_FR());
		appSetting = new AppSettingPage(driver, new SettingPage_FR());
	}

	public void initSpanishPages() {
		loginPage = new LoginPage(driver, new LoginPage_ES());
		appSetting = new AppSettingPage(driver, new SettingPage_ES());
	}

	public void initportugalPages() {

		loginPage = new LoginPage(driver, new LoginPage_PT());
		appSetting = new AppSettingPage(driver, new SettingPage_PT());

	}
}
