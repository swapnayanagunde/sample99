package primusbank.library;

import org.openqa.selenium.By;

import Utils.Apputils;

public class bankerhomepage extends Apputils
{
public boolean bankerlogout()
{
	driver.findElement(By.id("IMG1")).click();
	if(driver.findElement(By.id("login")).isDisplayed())
	{
		return true;
	}else
	{
		return false;
	}
}
}
