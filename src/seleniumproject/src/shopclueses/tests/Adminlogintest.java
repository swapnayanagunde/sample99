package shopclueses.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import shopclueses.pages.homepage;
import shopclueses.pages.loginpage;
import utils.Apputils;

public class Adminlogintest extends Apputils
{
    @Test
	public void checkadminlogin() throws InterruptedException
	{
		
    	loginpage lp=PageFactory.initElements(driver, loginpage.class);
    	lp.userlogin("9703257484", "password@123");
    	homepage hp=PageFactory.initElements(driver,homepage.class );
    	hp.logout();
    	
    	
    	
    	
    	
	}
	
	
	
}
