package PageObjectBase;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageInterface.AppSettingInterface;

/**
*
 * 
 * @author jharshit91
 *
 */


public class AppSettingPage {
	AppiumDriver<MobileElement> driver;	
	AppSettingInterface page;

	public AppSettingPage(AppiumDriver<MobileElement> driver,AppSettingInterface page)
	{
	this.driver=driver;	
	this.page=page;

	PageFactory.initElements(new AppiumFieldDecorator(driver), page);
	}	
		
	public void tapOnSetting()
	{
	
		
		page.getSettingButton().click();
	}
	
	public void tapActions()
	{

	   page.getMyProfile().click();
	   driver.navigate().back();
	   page.getAccountSetting().click();
	   driver.navigate().back();
	   page.getAppSetting().click();
	   driver.navigate().back();
	   page.getLogOutButton().click();
	 // page.getLogOutConfirm().click();
	  WebDriverWait wait =new WebDriverWait(driver, 30);	
	wait.until(ExpectedConditions.visibilityOf(page.getLogOutConfirm())).click();
  
	   }
}
