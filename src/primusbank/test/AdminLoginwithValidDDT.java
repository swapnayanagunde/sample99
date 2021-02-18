package primusbank.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utils.Apputils;
import Utils.XLUtils;
import primusbank.library.primusbankadminpage;
import primusbank.library.primusbankhomepage;

public class AdminLoginwithValidDDT extends Apputils
{
	
	
	public String xlfile="P:\\newfile1.xlsx";
	public String xlsheet="AdminLoginwithValidData";
	int j=1;
	
	
@Test(dataProvider="testdata")
	public void checkadminlogin(String uid,String pwd) throws IOException
	{
		primusbankhomepage phome=new primusbankhomepage();
		boolean res=phome.Adminloginwithvaliddata(uid, pwd);
		Assert.assertTrue(true);
		if(res)
		{
			XLUtils.setcellData(xlfile, xlsheet, j, 2, "pass");
			XLUtils.fillGreencolor(xlfile, xlsheet, j, 2);
		}else
		{
			XLUtils.setcellData(xlfile, xlsheet, j, 2, "fail");
			XLUtils.fillRedcolor(xlfile, xlsheet, j, 2);
		}
		primusbankadminpage  ahome=new primusbankadminpage();
		ahome.adminlogout();
		j++;
		
	}
	@DataProvider
	public Object[][]testdata() throws IOException
	{
		int rc,cc;
		rc=XLUtils.getRowCount(xlfile, xlsheet);
		cc=XLUtils.getcolumncount(xlfile, xlsheet, 1);
		Object[][] data=new Object[rc][cc];
		for(int i=1;i<=rc;i++)
		{
			data[1-1][0]=XLUtils.getStringcellData(xlfile, xlsheet, i, 0);
			data[i-1][1]=XLUtils.getStringcellData(xlfile, xlsheet, i, 1);
		}
		
		return data;
		
	}

	
}
