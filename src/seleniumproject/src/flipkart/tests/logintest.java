package flipkart.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import flipkart.pages.addcartpage;
import flipkart.pages.homepage;
import flipkart.pages.loginpage;
import utils.Apputils2;

public class logintest extends Apputils2
{
   @Test
	public void verifylogin() throws InterruptedException
	{
		
		loginpage lpp=PageFactory.initElements(driver,loginpage.class);
		lpp.loginmethod("9550154060", "flipkart@2626");
		addcartpage app=PageFactory.initElements(driver, addcartpage.class);
		app.verifyaddcart("t-shirt");
	    homepage hpp=PageFactory.initElements(driver, homepage.class);
        hpp.verifylogout();
   
	}
}
