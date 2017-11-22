package pageObjects;

import pageInterface.AppSettingInterface;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
*
 * 
 * @author jharshit91
 *
 */

public class SettingPage_Eng implements AppSettingInterface{
	@AndroidFindBy(uiAutomator = "new UiSelector().description(\"Me. View your profile and make changes.\")")
	MobileElement settingButton;

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"My Profile\")")
	MobileElement myProfile;

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Account Settings\")")
	MobileElement accountSetting;
	
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"App Settings\")")
	MobileElement appSettings;
	
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Log out of WordPress.com\")")
	MobileElement logOutButton;
	
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Log out\")")
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
