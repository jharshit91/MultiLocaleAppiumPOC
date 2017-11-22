package test;

import java.io.IOException;
import java.net.MalformedURLException;
import logger.Log;
import infra.DriverClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import ScreenHandler.AllPageHandler;

public class LocalizationTestSuite {


	/**
	*
	 * 
	 * @author jharshit91
	 *
	 */
	
	
	public AppiumDriver<MobileElement> driver = null;
	public AllPageHandler page;

	@Parameters({ "deviceName", "platform", "simulator", "udid", "os",
			"locale", "port" })
	@BeforeTest
	public void Configuration(String deviceName, String platform,
			String simulator, String udid, String os, String locale, String port)
			throws MalformedURLException {
		Log.INFO("In COnfig");
		DriverClass in = new DriverClass();
		try {
			driver = in.driver(deviceName, platform, simulator, udid, os, port);
			page = new AllPageHandler(driver);
			page.initScreens(locale);

		} catch (IOException | InterruptedException e) {
			Log.INFO(e.getMessage());
		}
	}

	@Test(priority = 1)
	public void elementPresent() throws InterruptedException {
		page.getLoginPage().performLogin();

	}

	@Test(priority = 2)
	public void navigateToSettingScreen() throws InterruptedException {
		page.getAppSettingPage().tapOnSetting();
		page.getAppSettingPage().tapActions();
	}

	@AfterSuite
	public void teardown() {
		driver.quit();
	}

}
