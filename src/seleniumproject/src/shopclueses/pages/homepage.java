package shopclueses.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.Apputils;

public class homepage extends Apputils
{
@FindBy(xpath="//*[@id='sc_uname']") WebElement signoutlink;
@FindBy(xpath="//i[@class='usr_signout']") WebElement logoutlink;
	
public void logout() throws InterruptedException
	{
	   Thread.sleep(10000);
		signoutlink.click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", logoutlink);
		Thread.sleep(10000);
		logoutlink.click();
	}
}

