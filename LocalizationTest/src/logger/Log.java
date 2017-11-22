package logger;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
/**
 * 
 * A static logger function is used to display logs on console and append them in a log file.	
 * @author jharshit91
 *
 */
public class Log {

	static Logger Log=Logger.getLogger(Log.class.getName());
	/** 
	 * Info Message
	 * @param Message  Ex: "Clicked on Login Button"
	 */
	public static void INFO(String Message){
	DOMConfigurator.configure("log4j.xml");	
	
	Log.info(Message);	
	}
	/** 
	 * Error Message
	 * @param Message  Ex: "element is not visible"
	 */
	public static void ERROR(String Message){
	DOMConfigurator.configure("log4j.xml");		
	Log.error(Message);	
	}	

}
