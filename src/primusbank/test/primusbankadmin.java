
package primusbank.test;

import org.testng.annotations.Test;

import Utils.Apputils;
import primusbank.library.primusbankadminpage;
import primusbank.library.primusbankhomepage;

public class primusbankadmin  extends Apputils
{
	@Test
	public void checkadminlogin()
	{
		primusbankhomepage phome=new primusbankhomepage();
		phome.adminlogin("Admin", "Admin");
		primusbankadminpage bhome=new primusbankadminpage();
		bhome.adminlogout();
	
	}

}
