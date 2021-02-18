package orangehrm.library;

import org.openqa.selenium.By;

import Utils.Apputils;

public class orangehrmhomepage extends Apputils

{
	public boolean loginmodule(String uid,String pwd)
	{
		driver.findElement(By.id("txtUsername")).sendKeys(uid);
		driver.findElement(By.id("txtPassword")).sendKeys(pwd);
		driver.findElement(By.name("Submit")).click();
		String exptitle,acttitle;
		exptitle="OrangeHRM";
		acttitle=driver.getTitle();
		if(acttitle.toLowerCase().contains(exptitle.toLowerCase()))
		{
			return true;
		}else
		{
			return false;
		}
	}
		public boolean Loginwithvaliddata(String uid,String pwd)
		{
			
			driver.findElement(By.id("txtUsername")).sendKeys(uid);
			driver.findElement(By.id("txtPassword")).sendKeys(pwd);
			driver.findElement(By.name("Submit")).click();
			String exptitle,acttitle;
			exptitle="OrangeHRM";
			acttitle=driver.getTitle();
			if(acttitle.toLowerCase().contains(exptitle.toLowerCase()))
			{
				return true;
			}else
			{
				return false;
			}
	
			
		}
		public boolean Loginwithinvaliddata(String uid,String pwd)
		{
			
			driver.findElement(By.id("txtUsername")).sendKeys(uid);
			driver.findElement(By.id("txtPassword")).sendKeys(pwd);
			driver.findElement(By.name("Submit")).click();
		//WebDriverWait wait=new WebDriverWait(driver, 20);
		//wait.until(ExpectedConditions.alertIsPresent());
		//Alert alt=driver.switchTo().alert();
		if(driver.findElement(By.id("spanMessage")).isDisplayed())
		{
			return true;
		}else
			
			return false;
		}

}
