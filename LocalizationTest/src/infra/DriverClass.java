package infra;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import java.io.IOException;

import logger.Log;

/**
*
 * 
 * @author jharshit91
 *
 */

public class DriverClass extends Init{
	public    AppiumDriver<MobileElement> driver;
	
/**
 * Call this method to start a new session if driver is null.
 * 
 */
public  AppiumDriver<MobileElement>  driver(String deviceName,String  PlatformVersion,String simulator,String udid,String os,String port) throws IOException, InterruptedException{
	Log.INFO("Inside Driver Class");
	if(getDriver()==null){
	Log.INFO("driver is null");	
	Init in =new Init();
	driver=in.invokeDriver(deviceName, PlatformVersion, simulator,udid,os,port) ;
	
	}
	Log.INFO("Session Returned by Driver"+ getDriver().getSessionId().toString());
return getDriver();

}





}