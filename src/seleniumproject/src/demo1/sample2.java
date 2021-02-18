package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

 public class sample2


 {

	public static void main(String[] args) throws InterruptedException 
	{
	

		System.setProperty("WebDriver.gecko.driver", "geckodriver.exe");
		
		ProfilesIni profile = new ProfilesIni();
		FirefoxProfile myprofile = profile.getProfile("abc");
		FirefoxOptions options = new FirefoxOptions();
		options.setProfile(myprofile);
		options.addPreference("dom.webnotifications.enabled", false);
	    //WebDriver driver=new FirefoxDriver(options);
		
		WebDriver driver = new FirefoxDriver(options);
		driver.get("http://shopclues.com");
		driver.findElement(By.xpath("//*[@id='sign-in']")).click();
		Thread.sleep(10000);
	  driver.findElement(By.xpath("//*[@id='main_user_login']")).sendKeys("9703257484");
      driver.findElement(By.xpath("//form[@name='loginform']//input[@name='password']")).sendKeys("password@123");
      driver.findElement(By.xpath("//*[@id='login_button']")).click();
	  Thread.sleep(10000);
	  driver.findElement(By.xpath("//*[@id='sc_uname']")).click();
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	WebElement Element= driver.findElement(By.xpath("//i[@class='usr_signout']"));
	js.executeScript("arguments[0].scrollIntoView();", Element);
	Thread.sleep(10000);
	Element.click();
	 
    	
	}
}