package shopclues.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import shopclues.library.homepage;
import shopclues.library.loginpage;
import utils.Apputils;
import utils.XLUtils;

public class customervalidtest extends Apputils
{
   @Test
	public void checklogin() throws IOException, InterruptedException 
	{
	String xlfile="S:\\shopclues.xlsx";
	String xlsheet="valid";
	String phone,pwd;
	loginpage lhome=new loginpage();
	int rowcount=XLUtils.getRowCount(xlfile, xlsheet);
	for(int i=1;i<=rowcount;i++)
	{
		phone=XLUtils.getStringcellData(xlfile, xlsheet, i, 0);
		pwd=XLUtils.getStringcellData(xlfile, xlsheet, i, 1);
		boolean res=lhome.uselogin(phone, pwd);
		Assert.assertTrue(res);
		if(res)
		{
			XLUtils.setcellData(xlfile, xlsheet, i, 2, "PASS");
			XLUtils.fillGreencolor(xlfile, xlsheet, i, 2);
		}else
		{
			XLUtils.setcellData(xlfile, xlsheet, i, 2, "FAIL");
			XLUtils.fillRedcolor(xlfile, xlsheet, i, 2);
		}
		
	}
	homepage hhome=new homepage();													
	hhome.logoutmodule();
	
	}
}








































