package orangehrm.library;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import Utils.Apputils;

public class orangehomepage extends Apputils
{
	public boolean logoutmodule() 
	{
		driver.findElement(By.id("welcome")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("javascript:window.scrollBy(250,350)");
	    driver.findElement(By.linkText("Logout")).click();
	    if(driver.findElement(By.id("btnLogin")).isDisplayed())
	    		{
	    	return true;
	    }else
       {
		return false;
		
	   }
	
	
	}

}
