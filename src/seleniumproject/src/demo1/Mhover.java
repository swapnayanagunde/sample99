package demo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mhover 
	{
	    public static void main(String[] args)
	    {
	       WebDriver driver = new FirefoxDriver();
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       driver.get("http://www.google.com");
	       WebElement ele = driver.findElement(By.id("gbqfba"));
	       Actions action = new Actions(driver);
	       action.moveToElement(ele).build().perform();
	    }
	}


