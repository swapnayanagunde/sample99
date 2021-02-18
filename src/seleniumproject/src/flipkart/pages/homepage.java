package flipkart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import utils.Apputils2;

public class homepage extends Apputils2
{
	
	@FindBy(xpath=".//div[@class='exehdJ'][contains(text(),'Swapna')]") WebElement scrollelement;
	 @FindBy(xpath="//div[text()='Logout']") WebElement signoutelement;
	// WebElement we = driver.findElement(By.xpath(".//div[@class='exehdJ'][contains(text(),'Swapna')]/../.."));
	// builder.moveToElement(we).build().perform();
	// Thread.sleep(10000);
	// driver.findElement(By.xpath("//div[text()='Logout']")).click();
	
	
	
	
	public void verifylogout() throws InterruptedException
	
	{
		Thread.sleep(10000);
		 Actions builder= new Actions(driver);
		builder.moveToElement(scrollelement).build().perform();
		signoutelement.click();
	}
	
	

}
