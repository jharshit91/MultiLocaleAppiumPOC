package pageObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import pageInterface.AppLoginInterface;

/**
*
 * 
 * @author jharshit91
 *
 */

public class LoginPage_Eng implements AppLoginInterface {

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Email or username\")")
	MobileElement username;

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Next\")")
	MobileElement nextButton;

	@AndroidFindBy(id = "org.wordpress.android:id/nux_password")
	MobileElement passwordField;

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Log in\")")
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
