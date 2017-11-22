package pageObjects;

import pageInterface.AppSettingInterface;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SettingPage_PT implements AppSettingInterface{
	@AndroidFindBy(uiAutomator = "new UiSelector().description(\"Eu. Veja e altere seu perfil.\")")
	MobileElement settingButton;

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Meu perfil\")")
	MobileElement myProfile;

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Configurações da conta\")")
	MobileElement accountSetting;
	
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Configurações do aplicativo\")")
	MobileElement appSettings;
	
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Fazer logout do WordPress.com\")")
	MobileElement logOutButton;

	
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Fazer logout\")")
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