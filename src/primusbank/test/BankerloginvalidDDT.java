package primusbank.test;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utils.Apputils;
import Utils.XLUtils;
import primusbank.library.primusbankhomepage;

public class BankerloginvalidDDT extends Apputils
{
    public String xlfile="P:\\Book123.xlsx";
    public String xlsheet="bankerinvalid";
    String brname,uid,pwd;
	int j=1;
    @Test(dataProvider="testdata")
	public void checkbankerlogin(String brname,String uid,String pwd) throws IOException
	{
		primusbankhomepage phome=new primusbankhomepage();
		//bankerhomepage bhome=new bankerhomepage();
		boolean res=phome.bankerlogininvalid(brname, uid, pwd);
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
		
		//bhome.bankerlogout();
		j++;
	}
	
	@DataProvider
	public Object[][] testdata() throws IOException
	{
	int rc,cc;
	 rc=XLUtils.getRowCount(xlfile, xlsheet);
	 cc=XLUtils.getcolumncount(xlfile, xlsheet, 1);
	 Object[][] data=new Object[rc][cc];
	 for(int i=1;i<=rc;i++)
	 {
		
		data[i-1][0]=XLUtils.getStringcellData(xlfile, xlsheet, i, 0);
		data[i-1][1]=XLUtils.getStringcellData(xlfile, xlsheet, i, 1);
        data[i-1][2]=XLUtils.getStringcellData(xlfile, xlsheet, i, 2);
		 
	 }
		
		return data;
		
	}
	
	
	
	
	
	
	
	
	
	
}
