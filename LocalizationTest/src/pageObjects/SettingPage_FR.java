package pageObjects;

import pageInterface.AppSettingInterface;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SettingPage_FR  implements AppSettingInterface{
	
	@AndroidFindBy(uiAutomator = "new UiSelector().description(\"Moi. Affichez votre profil et faites des modifications.\")")
	MobileElement settingButton;

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Mon profil\")")
	MobileElement myProfile;

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Paramètres du compte\")")
	MobileElement accountSetting;
	
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Réglages de l’app\")")
	MobileElement appSettings;
	
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Se déconnecter de WordPress.com\")")
	MobileElement logOutButton;
	
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Se déconnecter\")")
	MobileElement confirm;
	
	@Override
	public MobileElement getSettingButton() {
		return settingButton;
	}
	
	
	@Override
	public MobileElement getMyProfile() {
		return myProfile;
	}
	
	@Override
	public MobileElement getAccountSetting(){
		return accountSetting;
	}
	
	@Override
	public MobileElement getAppSetting() {
		return appSettings;
	}
	
	@Override
	public MobileElement getLogOutButton(){
		return logOutButton;
	}
	
	@Override
	public MobileElement getLogOutConfirm(){
		return confirm;
	}
	
}
