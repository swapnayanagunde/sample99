package primusbank.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Utils.Apputils;
import Utils.XLUtils;
import primusbank.library.bankerhomepage;
import primusbank.library.primusbankhomepage;

public class Bankerlogin extends Apputils
{

	
	
	@Test
	public void checkbankerlogin(String brname,String uid,String pwd) throws IOException
	{
		

		 String xlfile="P:\\Book123.xlsx";
		 String xlsheet="bankervalid";
	primusbankhomepage phome=new primusbankhomepage();
	bankerhomepage bhome=new bankerhomepage();
	int rowcount=XLUtils.getRowCount(xlfile, xlsheet);
	for(int i=1;i<=rowcount;i++)
	{
		brname=XLUtils.getStringcellData(xlfile, xlsheet, i, 0);
		uid=XLUtils.getStringcellData(xlfile, xlsheet, i, 1);
		pwd=XLUtils.getStringcellData(xlfile, xlsheet, i, 2);
	boolean res=phome.bankerlogin(brname, uid, pwd);
	Assert.assertTrue(res);
	if(res)
	{
		XLUtils.setcellData(xlfile, xlsheet, i, 3, "PASS");
		XLUtils.fillGreencolor(xlfile, xlsheet, i, 3);
	}else
	{
		XLUtils.setcellData(xlfile, xlsheet, i, 3, "FAIL");
		XLUtils.fillRedcolor(xlfile, xlsheet, i, 3);
	}
	bhome.bankerlogout();
	
	}
	
	
}
}