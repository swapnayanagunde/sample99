package ecommerce.library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.Apputils2;

public class homepage extends Apputils2
{
public boolean logoutmodule() throws InterruptedException
{
	  // if(driver.findElement(By.xpath(".//div[@class='exehdJ'][contains(text(),'Swapna')]")).isDisplayed());
	   
	     Actions builder= new Actions(driver);
		 WebElement we = driver.findElement(By.xpath(".//div[@class='exehdJ'][contains(text(),'Swapna')]/../.."));
		 builder.moveToElement(we).build().perform();
		// Thread.sleep(10000);
		 driver.findElement(By.xpath("//div[text()='Logout']")).click();
		
    if(driver.findElement(By.xpath("//a[text()='Login']")).isDisplayed())
   {
	return true;
   }else
   {
	return false;
   }
	    }
  }
  
