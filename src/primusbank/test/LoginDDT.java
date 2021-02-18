package primusbank.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginDDT 
{

	
	@Test(dataProvider="someData")
	public void checkLogin(String uid,String pwd)
	{
		System.out.println(uid+" "+pwd);
	}
	
	@DataProvider
	public Object[][] loginData()

	{
		
		Object[][]data=new Object[3][2];
		
		//firstrow
		data[0][0]="uid1";
		data[0][1]="pwd1";
		//second row
		data[1][0]="uid2";
		data[1][1]="pwd2";
		//third row
		data[2][0]="uid3";
		data[2][1]="pwd3";
		return data;
		
	}
	
	
	@DataProvider
	public Object[][] someData()

	{
		
		Object[][]data=new Object[2][2];
		
		//firstrow
		data[0][0]="u1";
		data[0][1]="p1";
		//second row

		data[1][0]="u2";
		data[1][1]="p2";
		return data;
		
	}
	
	
	
	
	
	
	
	
	
}
