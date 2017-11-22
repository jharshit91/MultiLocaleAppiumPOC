package PageObjectBase;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import pageInterface.AppLoginInterface;

/**
*
 * 
 * @author jharshit91
 *
 */

public class LoginPage {
	
AppiumDriver<MobileElement> driver;	
AppLoginInterface page;

public LoginPage(AppiumDriver<MobileElement> driver,AppLoginInterface page)
{
this.driver=driver;	
this.page=page;

PageFactory.initElements(new AppiumFieldDecorator(driver), page);
}	
	

public void performLogin()
{
WebDriverWait wait =new WebDriverWait(driver, 20);	
wait.until(ExpectedConditions.visibilityOf(page.getUserName())).sendKeys("automation591");
//page.getUserName().sendKeys("automation591");
page.getNextButton().click();
page.getpasswordField().sendKeys("automation1900");
page.getLoginButton().click();
try{
wait.until(ExpectedConditions.visibilityOf(page.getTryNewEditorPopupButton())).click();

}
catch(Exception ex){
	System.out.println(driver.getPageSource());
}
}
	


	



}
	