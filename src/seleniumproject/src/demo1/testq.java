
package demo1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

public class testq 
{

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("WebDriver.gecko.driver", "geckodriver.exe");
		
		ProfilesIni profile = new ProfilesIni();
		FirefoxProfile myprofile = profile.getProfile("xyzprofile");
		FirefoxOptions options = new FirefoxOptions();
		options.setProfile(myprofile);
		options.addPreference("dom.webnotifications.enabled", false);
	    //WebDriver driver=new FirefoxDriver(options);
		
		WebDriver driver = new FirefoxDriver(options);
		//JavascriptExecutor js = (JavascriptExecutor) driver;
	 
		// signup to shopclues website.
		/*driver.get("http://www.shopclues.com");
		driver.findElement(By.linkText("Sign In")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='reg_tab']")).click();
		//driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("email")).sendKeys("skomirishetty9@gmail.com");
		driver.findElement(By.name("phone")).sendKeys("9703257484");
		driver.findElement(By.id("register_with_password")).click();
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("password@123");
		driver.findElement(By.name("register")).click();*/
		
		driver.get("http://shopclues.com");
		//driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.xpath("//*[@id='sign-in']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='main_user_login']")).sendKeys("9703257484");
		driver.findElement(By.xpath("//form[@name='loginform']//input[@name='password']")).sendKeys("password@123");
		driver.findElement(By.xpath("//*[@id='login_button']")).click();
		Thread.sleep(10000);
		
	    driver.findElement(By.xpath("//*[@id='autocomplete']")).sendKeys("kettle");
	    driver.findElement(By.xpath("//*[@class='srch_action btn orange']")).click();
	    //driver.findElement(By.xpath("//span[@id='search']")).click();
	    driver.findElement(By.xpath("//*[@id='det_img_150803037']")).click();
	
	   String MainWindow=driver.getWindowHandle();
	    Set<String> s1=driver.getWindowHandles();		
          Iterator<String> i1=s1.iterator();		
        		
        while(i1.hasNext())			
        {		
            String ChildWindow=i1.next();		
            		
            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
            {    		
                 
                    // Switching to Child window
             driver.switchTo().window(ChildWindow);	
             Thread.sleep(10000);
             //driver.findElement(By.xpath(".//a[text()='Ok']")).click();
             driver.findElement(By.xpath("//*[@id='buy']")).click();
             Thread.sleep(10000);
             driver.findElement(By.xpath("//*[@id='proceed_to_payment_button']")).click();
             driver.findElement(By.xpath("//ul/div/div[1]/li[7]/label")).click();
             driver.findElement(By.xpath("//*[@id='placeOrderAmt']")).click();
                             
			// Closing the Child Window.
                     //   driver.close();		
            }
            
        }		
        // Switching to Parent window i.e Main Window.
          //  driver.switchTo().window(MainWindow);	
	    
	 
        }
	}


