package orangehrm.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import Utils.Apputils;
import orangehrm.library.orangehomepage;
import orangehrm.library.orangehrmhomepage;

public class adminlogin  extends Apputils
{
@Test
	public void checkadminlogin()
	{
		
		orangehrmhomepage ohome=new orangehrmhomepage();
	    boolean  res=ohome.loginmodule("Admin", "Qedge123!@#");
		Assert.assertTrue(res);
		
		orangehomepage phome=new orangehomepage();
		phome.logoutmodule();
	
		
		
		
		
		
	}

	
}
