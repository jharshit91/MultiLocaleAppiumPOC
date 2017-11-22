package infra;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import logger.Log;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
*
 * 
 * @author jharshit91
 *
 */
public class Init {

	private static ThreadLocal<AppiumDriver<MobileElement>> localDriver = new ThreadLocal<AppiumDriver<MobileElement>>();

	DesiredCapabilities capabilities = new DesiredCapabilities();
	public AppiumDriver<MobileElement> driver = null;

	/**
	 * The function is used to set Capabilities and invoke driver Server.
	 */

	public AppiumDriver<MobileElement> invokeDriver(String deviceName,
			String PlatformVersion, String simulator, String udid, String os,
			String port) throws MalformedURLException {
		try {

			String Url = "http://127.0.0.1:4723//wd/hub";
			Log.INFO(Url);

			if (PlatformVersion.equalsIgnoreCase("android")) {
				System.out.println("Starting driver");
				capabilities.setCapability("platformName", os);
				capabilities.setCapability(MobileCapabilityType.APP,new File("").getAbsolutePath()+File.separator+"app"+File.separator+"test.apk");
				capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiAutomator2");
				capabilities.setCapability("platformVersion", PlatformVersion);
				capabilities.setCapability("udid", udid);
				capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,
						deviceName);
				capabilities.setCapability(
						AndroidMobileCapabilityType.SYSTEM_PORT, port);
				capabilities.setCapability(
						AndroidMobileCapabilityType.APP_PACKAGE,
						"org.wordpress.android");
				capabilities.setCapability(
						AndroidMobileCapabilityType.APP_ACTIVITY,
						"org.wordpress.android.ui.WPLaunchActivity");
				capabilities.setCapability(
						MobileCapabilityType.NEW_COMMAND_TIMEOUT, "72000");
				driver = new AndroidDriver<MobileElement>(new URL(Url),
						capabilities);

				Thread.sleep(6000);
			}

		} catch (Exception ex) {
			Log.INFO(ex.getMessage());
		}

		setDriver(driver);
		Log.INFO("Message" + getDriver().getSessionId());
		return driver;
	}

	/**
	 * To maintain Thread Safety between driver instance getDriver and SetDriver
	 * method are created by using ThreadLocal.
	 */

	public AppiumDriver<MobileElement> getDriver() {

		return localDriver.get();
	}

	/**
	 * To maintain Thread Safety between driver instance getDriver and SetDriver
	 * method are created by using ThreadLocal.
	 */

	public void setDriver(AppiumDriver<MobileElement> driver) {
		localDriver.set(driver);

	}

	/**
	 * Generic method to return the capability/property of driver Instance
	 */
	public String getDeviceProperty(String property) {

		property = getDriver().getCapabilities().getCapability(property)
				.toString();
		return property;
	}

}
