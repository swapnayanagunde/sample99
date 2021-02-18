package shopclueses.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginpage 
{
	@FindBy(xpath="//*[@id='sign-in']") WebElement  signinelement;
	@FindBy(xpath="//*[@id='main_user_login']") WebElement uidelement;
	@FindBy(xpath="//form[@name='loginform']//input[@name='password']") WebElement pwdelement;
	@FindBy(xpath="//*[@id='login_button']") WebElement loginelement;

public void userlogin(String phone,String pwd) throws InterruptedException
{
	signinelement.click();
	Thread.sleep(10000);
	uidelement.sendKeys(phone);
	pwdelement.sendKeys(pwd);
	loginelement.click();
}

}

