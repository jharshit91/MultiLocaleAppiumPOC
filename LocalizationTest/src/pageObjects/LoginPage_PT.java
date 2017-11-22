package pageObjects;

import pageInterface.AppLoginInterface;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;


public class LoginPage_PT implements AppLoginInterface {

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"E-mail ou nome de usuário\")")
	MobileElement username;

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Próximo\")")
	MobileElement nextButton;

	@AndroidFindBy(id = "org.wordpress.android:id/nux_password")
	MobileElement passwordField;

	
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Fazer login\")")
	MobileElement loginButton;
	
	@AndroidFindBy(id = "org.wordpress.android:id/promo_dialog_button_negative")
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
