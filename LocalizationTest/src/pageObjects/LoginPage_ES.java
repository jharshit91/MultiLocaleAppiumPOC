package pageObjects;

import pageInterface.AppLoginInterface;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;


public class LoginPage_ES implements AppLoginInterface {

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Correo electrónico o nombre de usuario\")")
	MobileElement username;

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Siguiente\")")
	MobileElement nextButton;

	@AndroidFindBy(id = "org.wordpress.android:id/nux_password")
	MobileElement passwordField;

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Acceder\")")
	MobileElement loginButton;
	
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"AHORA NO\")")
	MobileElement tryNewEditorPopup;

	@Override
	public MobileElement getUserName() {
		return username;
	}

	@Override
	public MobileElement getNextButton() {
		return nextButton;
	}

	@Override
	public MobileElement getpasswordField() {
		return passwordField;
	}

	@Override
	public MobileElement getLoginButton() {
		return loginButton;
	}

	@Override
	public MobileElement getTryNewEditorPopupButton() {
		return tryNewEditorPopup;
	}
	
}
