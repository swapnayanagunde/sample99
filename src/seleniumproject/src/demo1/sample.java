package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;

public class sample 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("WebDriver.gecko.driver", "geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
		FirefoxOptions options = new FirefoxOptions();
		options.addPreference("dom.webnotifications.enabled", false);
	    WebDriver driver=new FirefoxDriver(options);
		driver.get("http://moglix.com");
		driver.findElement(By.xpath("//span[text()='Sign In']")).click();
		driver.findElement(By.xpath("//input[@formcontrolname='email']")).sendKeys("9550154060");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("moglix@2626");
		driver.findElement(By.xpath("//button[contains(text(),'CONTINUE')]")).click();
		Thread.sleep(10000);
		Actions builder=new Actions(driver);
		WebElement we=driver.findElement(By.xpath("//ul//li//span[text()='swapna']"));
		builder.moveToElement(we).perform();
		driver.findElement(By.linkText("Logout")).click();
		
	/*	WebElement we = driver.findElement(By.xpath(".//div[@class='exehdJ'][contains(text(),'Swapna')]/../.."));
		builder.moveToElement(we).build().perform();
		 driver.findElement(By.xpath("//div[text()='Logout']")).click();*/
		
		
		/*driver.findElement(By.xpath("//input[@id='search-input']")).sendKeys("chairs");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		driver.findElement(By.xpath("//a[text()='Executive Chairs']")).click();*/
		
		

	}

}
