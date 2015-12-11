package common;

//Imports
import org.openqa.selenium.*;

public abstract class Data
	{

		protected WebDriver driver;
		protected String elementName = null;
		protected String baseUrl = "http://10.0.12.124/";
		protected String browser = null;
		protected boolean acceptNextAlert = true;
		protected boolean sat = false;
		protected StringBuffer verificationErrors = new StringBuffer();
		protected String[] browserDrivers = {"FIREFOX", "SAFARI"};
		protected static String SELENIUM_VIDEOS_PATH = "E:/My Documents/Study and Research/Selenium/Video/ProjectWin/";	
		protected String username = "rai";
		protected String password = "Login@123";
		
		
	}