package shopclues.library;

import org.openqa.selenium.By;

import utils.Apputils;

public class loginpage  extends Apputils
{
	public boolean uselogin(String phone,String pwd) throws InterruptedException
	{
		String exptitle,acttitle;
		exptitle="Online Shopping Site India ";
		driver.findElement(By.xpath("//a[text()='Sign In']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='main_user_login']")).sendKeys(phone);
		driver.findElement(By.xpath("//form[@name='loginform']//input[@name='password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//*[@id='login_button']")).click();
		acttitle=driver.getTitle();
		if(exptitle.toLowerCase().contains(acttitle.toLowerCase()))
		{
			
			return true;
			
			
		}else
		{
			return false;
		}
		
	}
	public  boolean useloginwithinvalid(String phone,String pwd) throws InterruptedException
	{
	
		driver.findElement(By.xpath("//*[@id='main_user_login']")).sendKeys(phone);
		driver.findElement(By.xpath("//form[@name='loginform']//input[@name='password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//*[@id='login_button']")).click();
		try {
			

			driver.findElement(By.xpath("//*[@id='main_user_login']")).clear();
			driver.findElement(By.xpath("//form[@name='loginform']//input[@name='password']")).clear();
			return driver.findElement(By.xpath("//span[text()='Incorrect login details.']")).isDisplayed();
		}
		catch(Exception e){
			return false;
		}
		
//		if()
//		{
//			//driver.findElement(By.xpath("//*[@id='main_user_login']")).clear();
//			//driver.findElement(By.xpath("//form[@name='loginform']//input[@name='password']")).clear();
//			return true;
//			
//			
//		}else
//		{
//			return false;
//		}
//		
		
	            }
	       
			
	}


	
	        


