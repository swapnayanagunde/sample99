
package shopclues.tests;

import org.testng.annotations.Test;

import shopclues.library.homepage;
import shopclues.library.loginpage;
import utils.Apputils;

public class Customerlogintest extends Apputils
{
	@Test
	public void loginmodule() throws InterruptedException
	 {
	
		//Apputils.launchApp();
		loginpage lhome=new loginpage();
		boolean res=lhome.uselogin("9703257484", "password@123");
		//Assert.assertTrue(res);
		if(res)
		{
			System.out.println("true");
			
		}
			else
		{
			System.out.println("fail");
		}
	homepage hhome=new homepage();																		
	hhome.logoutmodule();
	//Apputils.closeApp();
			
	}
}
