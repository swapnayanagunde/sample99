package primusbank.library;

import org.openqa.selenium.By;

import Utils.Apputils;

public class primusbankadminpage extends Apputils
{
public boolean adminlogout()
{
	driver.findElement(By.xpath("//img[@src='images/admin_but_03.jpg']")).click();
	if(driver.findElement(By.id("login")).isDisplayed())
	{
		return true;
	}else
	{
		return false;
	}

}
}