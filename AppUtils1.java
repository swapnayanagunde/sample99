
package Utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class AppUtils1 
{
    public static WebDriver driver;
    public static String url="http://facebook.com";
    @BeforeTest
	public void launchApp() 
	{
	System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get(url);

	}
    @AfterTest
    public void closeApp()
    {
    	driver.close();
    }
}
