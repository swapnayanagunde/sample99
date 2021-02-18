package ecommerce.library;

import org.openqa.selenium.By;

import utils.Apputils2;

public class loginmodule extends Apputils2
{

	public boolean verifylogin(String Mnumber,String pwd)
	{
	
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys(Mnumber);
		driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys(pwd);
		driver.findElement(By.xpath("//*[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		if(driver.findElement(By.xpath("//div[@class='exehdJ'][contains(text(),'Swapna')]")).isDisplayed())
		{
			return true;
		}else
		{
		
		return false;
		}	
		
	}
	
	
}
