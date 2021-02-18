package flipkart.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.Apputils2;

public class addcartpage extends Apputils2
{
    @FindBy(xpath="//*[@name='q']") WebElement searchelememnt;
	@FindBy(xpath="//button[@class='L0Z3Pu']") WebElement buttonelement;
	@FindBy(xpath="//a[text()='Striped Men Round Neck Blue, Yellow T-Shirt']") WebElement imgelement;
	@FindBy(xpath="//span[@class='_3iRXzi']") WebElement button2element;
	@FindBy(css = "li#swatch-4-size>a") WebElement sizeelement;
	@FindBy(xpath="//*[@type='button']") WebElement addelement;
	@FindBy(xpath="//button[text()='CONTINUE']") WebElement button3element;
	@FindBy(xpath="//input[@id='COD']//following-sibling::div[1]") WebElement paymentelement;
	
     @FindBy(xpath="//button[@type='button']") WebElement button4element;
	 
	
	
	
	
	public void verifyaddcart(String itemname) throws InterruptedException
	{
		Thread.sleep(10000);
		searchelememnt.sendKeys(itemname);
		buttonelement.click();
		imgelement.click();
		String MainWindow=driver.getWindowHandle();
	    Set<String> s1=driver.getWindowHandles();		
          Iterator<String> i1=s1.iterator();	
        		
          
        while(i1.hasNext())			
        {		
            String ChildWindow=i1.next();		
            		
            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
            {    		
                 
                    // Switching to Child window
            	
             driver.switchTo().window(ChildWindow);	
             Thread.sleep(10000);
            button2element.click();
            sizeelement.click();
            addelement.click();
            button3element.click();
            JavascriptExecutor js=(JavascriptExecutor)driver;
        	js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        	Thread.sleep(50000);
        	paymentelement.click();
           WebDriverWait wait = new WebDriverWait(driver,30);
        	wait.until(ExpectedConditions.presenceOfElementLocated((By) (button4element)));
       	  //  button4element.click();
        	//WebDriverWait wait = new WebDriverWait(driver,30);
         //  wait.until(ExpectedConditions.visibilityOfElementLocated(buyelement));
        	
		
		
		
	}
	
            
        }
	}
}
