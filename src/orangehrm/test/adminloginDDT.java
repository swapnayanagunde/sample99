package orangehrm.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Utils.Apputils;
import Utils.XLUtils;
import orangehrm.library.orangehomepage;
import orangehrm.library.orangehrmhomepage;

public class adminloginDDT extends Apputils
{
@Test
public void checkadminlogin() throws IOException
{
	String xlfile="P:\\Bookorangefile.xlsx";
	String xlsheet="Loginwithvaliddata";
	String uid,pwd;
	orangehrmhomepage ohome=new orangehrmhomepage();
	orangehomepage phome=new orangehomepage();
	int rowcount=XLUtils.getRowCount(xlfile, xlsheet);
	for(int i=1;i<=rowcount;i++)
	{
		
		uid=XLUtils.getStringcellData(xlfile, xlsheet, i, 0);
		pwd=XLUtils.getStringcellData(xlfile, xlsheet, i, 1);
		boolean res=ohome.loginmodule(uid, pwd);
		Assert.assertTrue(res);
		if(res)
		{
			XLUtils.setcellData(xlfile, xlsheet, i, 2, "pass");
			XLUtils.fillGreencolor(xlfile, xlsheet, i, 2);
		}else
		{
			XLUtils.setcellData(xlfile, xlsheet, i, 2, "fail");
			XLUtils.fillRedcolor(xlfile, xlsheet, i, 2);
		}
		phome.logoutmodule();
	
	
	
	
	
}
	
	
}
}
