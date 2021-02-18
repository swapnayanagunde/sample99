package ecommerce.tests;

import org.testng.annotations.Test;

import ecommerce.library.addtocart;
import ecommerce.library.homepage;
import ecommerce.library.loginmodule;
import utils.Apputils2;

public class userlogintest extends Apputils2
{
	@Test
public void verifylogin() throws InterruptedException
{
	loginmodule lhome=new loginmodule();
	lhome.verifylogin("9550154060", "flipkart@2626");
	addtocart adhome=new addtocart();
	adhome.verifyitemadded("T-shirt");
	 homepage hlhome=new homepage();
	 hlhome.logoutmodule();

	
}
}

