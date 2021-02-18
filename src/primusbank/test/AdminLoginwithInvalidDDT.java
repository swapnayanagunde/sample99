package primusbank.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utils.Apputils;
import Utils.XLUtils;
import primusbank.library.primusbankhomepage;

public class AdminLoginwithInvalidDDT extends Apputils
{


	public String xlfile="P:\\newfile1.xlsx";
	public String xlsheet="AdminLoginwithInvalidData";
	int j=1;
	
	
@Test(dataProvider="testdata")
	public void checkadminlogin(String uid,String pwd) throws IOException
	{
		primusbankhomepage phome=new primusbankhomepage();
		boolean res=phome.Adminloginwithinvaliddata(uid, pwd);
		Assert.assertTrue(res);
		if(res)
		{
			XLUtils.setcellData(xlfile, xlsheet, j, 2, "pass");
			XLUtils.fillGreencolor(xlfile, xlsheet, j, 2);
		}else
		{
			XLUtils.setcellData(xlfile, xlsheet, j, 2, "fail");
			XLUtils.fillRedcolor(xlfile, xlsheet, j, 2);
		}

		j++;
		
	}
	@DataProvider
	public Object[][]testdata() throws IOException
	{
		int rc,cc;
		rc=XLUtils.getRowCount(xlfile, xlsheet);
		cc=XLUtils.getcolumncount(xlfile, xlsheet, 1);
		Object[][] data=new Object[rc][cc-1];
		for(int i=1,j=0;i<=rc;i++,j++)
		{
			data[j][0]=XLUtils.getStringcellData(xlfile, xlsheet, j, 0);
			data[i-1][1]=XLUtils.getStringcellData(xlfile, xlsheet, i, 1);
			
		}
		//00 01
//		10 11
//		20 21
		return data;
		
	}

	
	
	
	
	
	
	
}
