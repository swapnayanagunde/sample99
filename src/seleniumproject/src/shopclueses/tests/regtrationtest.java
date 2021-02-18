package shopclueses.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import shopclueses.pages.registration;
import utils.Apputils;

public class regtrationtest extends Apputils
{

	@Test
	public void verifyregistration()
	{
		
		registration rp=PageFactory.initElements(driver, registration.class);
		rp.verifysignup("skomirishetty9@gmail.com", "9703257484", "password@123");
		
		
		
	}
	

	
}
