package orangehrm.test;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utils.Apputils;
import Utils.XLUtils;
import orangehrm.library.orangehomepage;
import orangehrm.library.orangehrmhomepage;

public class orangehrmvalidDDT  extends Apputils
{
	
	public String xlfile="P:\\Bookorangefile.xlsx";
	public String xlsheet="Loginwithvaliddata";
	int j=1;

	@Test(dataProvider="somedata")
	public void checklogin(String uid,String pwd) throws IOException
	{
		orangehrmhomepage ohome=new orangehrmhomepage();
		orangehomepage bhome=new orangehomepage();
		boolean res=ohome.Loginwithvaliddata(uid, pwd);
		Assert.assertTrue(res);
		if(res)
		{
		XLUtils.setcellData(xlfile, xlsheet, j, 3, "pass");
		XLUtils.fillGreencolor(xlfile, xlsheet, j, 3);
		
		}else
		{
			XLUtils.setcellData(xlfile, xlsheet, j, 3, "fail");
			XLUtils.fillRedcolor(xlfile, xlsheet, j, 3);
		}
		bhome.logoutmodule();
		j++;
		
		
	}
	
	
	@DataProvider
	public Object[][]somedata() throws IOException
	{
		int rc,cc;
		rc=XLUtils.getRowCount(xlfile, xlsheet);
		cc=XLUtils.getcolumncount(xlfile, xlsheet, 1);
		Object[][] data=new Object[rc][cc];
		for(int i=1;i<rc;i++)
		{
			data[1][0]=XLUtils.getStringcellData(xlfile, xlsheet, i, 0);
			data[1][1]=XLUtils.getStringcellData(xlfile, xlsheet, i, 1);
		}
		
	
		return data;
		
	}
	
	
	
	
	
}
