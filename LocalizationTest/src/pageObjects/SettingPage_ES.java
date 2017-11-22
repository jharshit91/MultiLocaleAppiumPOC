package pageObjects;

import pageInterface.AppSettingInterface;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SettingPage_ES implements AppSettingInterface{
	@AndroidFindBy(uiAutomator = "new UiSelector().description(\"Yo. Ve tu perfil y hazle cambios.\")")
	MobileElement settingButton;

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Mi perfil\")")
	MobileElement myProfile;

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Configuración de la cuenta\")")
	MobileElement accountSetting;
	
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Ajustes de la app\")")
	MobileElement appSettings;
	
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Salir de WordPress.com\")")
	MobileElement logOutButton;
	
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"CERRAR SESIÓN\")")
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
