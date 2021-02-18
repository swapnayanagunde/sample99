package facebook.library;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import Utils.AppUtils1;

public class fbloginpage extends AppUtils1
 {
public void logoutfb()
{
	driver.findElement(By.xpath("//div[4]/div[1]/span/div/div[1]/i")).click();
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("javascript:window.scrollBy(250,350)");
    
	
	
	
}
	
}
