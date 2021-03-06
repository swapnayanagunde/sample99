package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Apputils2
{

	public static WebDriver driver;
	public static String url="http://flipkart.com";
	 
	@BeforeTest
	public static void launchApp()
	  {
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		ProfilesIni profile = new ProfilesIni();
		FirefoxProfile myprofile = profile.getProfile("abc");
		FirefoxOptions options = new FirefoxOptions();
		options.setProfile(myprofile);
		options.addPreference("dom.webnotifications.enabled", false);
	    //WebDriver driver=new FirefoxDriver(options);
		
		 driver = new FirefoxDriver(options);
		//driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		
	 }
	   @AfterTest
	   
		public static  void closeApp()
		{
			driver.close();
		}

}
