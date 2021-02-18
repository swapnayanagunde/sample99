package facebook.library;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Utils.AppUtils1;

public class facebookhomepage extends AppUtils1
 {
@Test
	public boolean logintofb(String uid,String pwd)
	{
		driver.findElement(By.id("email")).sendKeys(uid);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		driver.findElement(By.id("u_0_b")).click();
		String exptitle,acttitle;
		exptitle="facebook";
		acttitle=driver.getTitle();
		if(acttitle.toLowerCase().contains(exptitle.toLowerCase()))
				{
			return true;
				}
		else
		{
			return false;
		}
		
		
		
		
		
		
		
		
	}
	

}
