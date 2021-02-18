package shopclueses.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class registration
{
    @FindBy(linkText="Sign In") WebElement signnelement;
    @FindBy(xpath="//a[text()='REGISTER']") WebElement regelement;
    @FindBy(xpath="//input[@name='email']") WebElement  uidelement;
    @FindBy(name="phone") WebElement phneelement;
    @FindBy(id="register_with_password") WebElement radioelement;
    @FindBy(xpath="//*[@name='password']") WebElement pwdelement;
    @FindBy(name="register") WebElement buttonelement;
	public void verifysignup(String mail,String phone,String pword)
	{
		signnelement.click();
		regelement.click();
		uidelement.sendKeys(mail);
		phneelement.sendKeys(phone);
		radioelement.click();
		pwdelement.sendKeys(pword);
		buttonelement.click();
	}
	
	
/*	driver.findElement(By.linkText("Sign In")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id='reg_tab']")).click();
	//driver.findElement(By.linkText("REGISTER")).click();
	driver.findElement(By.name("email")).sendKeys("skomirishetty9@gmail.com");
	driver.findElement(By.name("phone")).sendKeys("9703257484");
	driver.findElement(By.id("register_with_password")).click();
	driver.findElement(By.xpath("//*[@name='password']")).sendKeys("password@123");
	driver.findElement(By.name("register")).click();*/
	
	
	
}
