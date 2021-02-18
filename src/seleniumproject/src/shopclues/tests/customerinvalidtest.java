package shopclues.tests;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import shopclues.library.loginpage;
import utils.Apputils;
import utils.XLUtils;

public class customerinvalidtest  extends Apputils
{
	 @Test
		public void checklogin() throws IOException, InterruptedException 
		{
		String xlfile="S:\\shopclues.xlsx";
		String xlsheet="invalid";
		String phone, pwd;	
		loginpage lhome=new loginpage();
		
		int rowcount=XLUtils.getRowCount(xlfile, xlsheet);
		for(int i=1;i<=rowcount;i++)
		{
			phone=XLUtils.getStringcellData(xlfile, xlsheet, i, 0);																														
			pwd=XLUtils.getStringcellData(xlfile, xlsheet, i, 1);
		    boolean res=lhome.useloginwithinvalid(phone, pwd);
		   
		    System.out.println(res);
		    System.out.println(phone);
		    System.out.println(pwd);
		
	

         SoftAssert softAssert = new SoftAssert();
	     softAssert.assertTrue(res);
	       // softAssert.assertAll();
			//Assert.assertTrue(res);
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
		
		
		}

}
