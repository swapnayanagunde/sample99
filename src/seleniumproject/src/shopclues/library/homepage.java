package shopclues.library;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import utils.Apputils;

public class homepage extends Apputils
{

	public boolean logoutmodule()
	{
		
		driver.findElement(By.xpath("//*[@id='sc_uname']")).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement Element= driver.findElement(By.xpath("//i[@class='usr_signout']"));
		js.executeScript("arguments[0].scrollIntoView();", Element);
		Element.click();
		if(driver.findElement(By.xpath("//*[@id='sign-in']")).isDisplayed())
		{
			return true;
		}else
		{
			return false;
		}
		
		
		
	}
}
