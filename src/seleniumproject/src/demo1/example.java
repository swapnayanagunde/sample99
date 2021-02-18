package demo1;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class example
{
		public static void main(String[] args) throws NoSuchElementException, InterruptedException
		{
  
			
			
			System.setProperty("WebDriver.gecko.driver", "geckodriver.exe");
			
			ProfilesIni profile = new ProfilesIni();
			FirefoxProfile myprofile = profile.getProfile("abc");
			FirefoxOptions options = new FirefoxOptions();
			options.setProfile(myprofile);
			options.addPreference("dom.webnotifications.enabled", false);
		    //WebDriver driver=new FirefoxDriver(options);
			
			WebDriver driver = new FirefoxDriver(options);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			driver.get("http://flipkart.com");
			
			
			driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("9550154060");
			//_2hriZF _2rbIyg"
			driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("flipkart@2626");
			driver.findElement(By.xpath("//*[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
	     	Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@name='q']")).sendKeys("t-shirt");
			driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
			//Thread.sleep(2000);
			driver.findElement(By.xpath("//a[text()='Striped Men Round Neck Blue, Yellow T-Shirt']")).click();
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
		           
		     Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@type='button']")).click();
			driver.findElement(By.cssSelector("li#swatch-4-size>a")).click();
            Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@type='button']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='CONTINUE']")).click();
			Thread.sleep(2000);
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			driver.findElement(By.xpath("//input[@id='COD']/following-sibling::div[1]")).click();
			WebDriverWait wait = new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='button']")));
			
		    Thread.sleep(2000);
			
			System.out.println(driver.getTitle());
			Thread.sleep(2000);
			System.out.println(driver.findElement(By.xpath(".//div[@class='exehdJ'][contains(text(),'Swapna')]")).isDisplayed());
		   Actions builder= new Actions(driver);
			WebElement we = driver.findElement(By.xpath(".//div[@class='exehdJ'][contains(text(),'Swapna')]/../.."));
			builder.moveToElement(we).build().perform();
			 driver.findElement(By.xpath("//div[text()='Logout']")).click();
			


			//driver.findElement(By.linkText("Logout")).click();
			
			
			// click on the compose button as soon as the "compose" button is visible
			//driver.findElement(By.xpath("//button[@type='button']")).click();
			//driver.findElement(By.xpath(".//div[contains(text(),'Swapna')]")).click();
			//driver.findElement(By.xpath("//div[@data-tryxpath-element='0'][contains(text(),'Swapna')]")).click();
			/*JavascriptExecutor js1=(JavascriptExecutor)driver;
			 * 
			WebElement Element= driver.findElement(By.linkText("Logout"));
			js1.executeScript("arguments[0].scrollIntoView();", Element);
			Thread.sleep(1000);
			Element.click();*/
			
		/*	if(driver.findElement(By.xpath("(//div[text()='₹489'])[1]")).isDisplayed())
			{
				return true;
			}else
			{
				return false; q
			}*/
		//	(".//div[contains(text(),'Swapna')]")
		//x(".//div[@data-tryxpath-element='0'][contains(text(),'Swapna')]")
			    }
		        }
		}
}
