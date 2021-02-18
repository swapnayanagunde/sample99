
package primusbank.library;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utils.Apputils;

public class primusbankhomepage extends Apputils 

{
	
	public boolean adminlogin(String uid,String pwd)
	{

		String exptitle,acttitle;
		exptitle="adminflow";
		driver.findElement(By.id("txtuId")).sendKeys(uid);
		driver.findElement(By.id("txtPword")).sendKeys(pwd);
		driver.findElement(By.id("login")).click();
		acttitle=driver.getTitle();
		if(exptitle.toLowerCase().contains(acttitle.toLowerCase()))
		{
			return true;
		}else
		{
			return false;
		}
	
	}
	public boolean Adminloginwithvaliddata(String uid,String pwd)
	{
		
		String exptitle,acttitle;
		exptitle="adminflow";
		driver.findElement(By.id("txtuId")).sendKeys(uid);
		driver.findElement(By.id("txtPword")).sendKeys(pwd);
		driver.findElement(By.id("login")).click();
		acttitle=driver.getTitle();
		if(exptitle.toLowerCase().contains(acttitle.toLowerCase()))
		{
			return true;
		}else
		{
			return false;
		}
		
	}
	
	public boolean Adminloginwithinvaliddata(String uid,String pwd)
	{

	driver.findElement(By.id("txtuId")).sendKeys(uid);
	driver.findElement(By.id("txtPword")).sendKeys(pwd);
	driver.findElement(By.id("login")).click();
	
	WebDriverWait wait=new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.alertIsPresent());
    Alert alt=driver.switchTo().alert();
    if(alt.getText().toLowerCase().contains("incorrect bankername/password"))
    {
    	alt.accept();
    	driver.findElement(By.id("txtuId")).clear();
    	driver.findElement(By.id("txtPword")).clear();
    	return true;
    }else
    {
    	return false;
    }
    		
	

	}
	
    public boolean bankerlogin(String brname,String uid,String pwd)

    {
    	Select branchname=new Select(driver.findElement(By.id("drlist")));
    	branchname.selectByVisibleText(brname);
    	driver.findElement(By.id("txtuId")).sendKeys(uid);
		driver.findElement(By.id("txtPword")).sendKeys(pwd);
		driver.findElement(By.id("login")).click();
		String expurl,acturl;
		expurl="Bankers_flow";
		acturl=driver.getCurrentUrl();
		if(expurl.toLowerCase().contains(acturl.toLowerCase()))
				{
			return true;
				}else
				{
					return false;
				}
    }
    public boolean bankerlogininvalid(String brname,String uid,String pwd)
    {
   
    	Select branchname=new Select(driver.findElement(By.id("drlist")));
    	branchname.selectByVisibleText(brname);
    	driver.findElement(By.id("txtuId")).sendKeys(uid);
		driver.findElement(By.id("txtPword")).sendKeys(pwd);
		driver.findElement(By.id("login")).click();
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alt=driver.switchTo().alert();
		if(alt.getText().toLowerCase().contains("inCorrect bankerName/password"))
		{
			alt.accept();
			driver.findElement(By.id("txtuId")).clear();
	    	driver.findElement(By.id("txtPword")).clear();
	    	return true;
			
		}
					return false;
				
    	
    	
    	
    }
    
    
    
}
