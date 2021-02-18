
package orangehrm.test;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utils.Apputils;
import Utils.XLUtils;
import orangehrm.library.orangehrmhomepage;

public class orangehrminvalidDDT extends Apputils
{
	
	public String xlfile="P:\\Bookorangefile.xlsx";
	public String xlsheet="Loginwithinvaliddata";
	int j=1;
	
	@Test(dataProvider="testdata")
	public void checkadminlogin(String uid,String pwd) throws IOException
	{
		orangehrmhomepage ohome=new orangehrmhomepage();
		boolean res=ohome.Loginwithinvaliddata(uid, pwd);
		Assert.assertTrue(res);
		if(res)
		{
			XLUtils.setcellData(xlfile, xlsheet, j, 2, "pass");
			XLUtils.fillGreencolor(xlfile, xlsheet, j, 2);
		}else
		{
			XLUtils.setcellData(xlfile, xlsheet, j,2, "fail");
			XLUtils.fillRedcolor(xlfile, xlsheet, j, 2);
		}
		
		j++;
		
	}

	
	
	@DataProvider
	Object[][]testdata() throws IOException
	{
		int rc,cc;
		rc=XLUtils.getRowCount(xlfile, xlsheet);
		cc=XLUtils.getcolumncount(xlfile, xlsheet,1 );
		Object[][]data=new Object[rc][cc];
		for(int i=1;i<=rc;i++)
		{
		data[i-1][0]=XLUtils.getStringcellData(xlfile, xlsheet, i, 0);
		data[i-1][1]=XLUtils.getStringcellData(xlfile, xlsheet, i, 1);
		
		}
		
		return data;
		
	}
	
	
	
	
	
	
	
}
