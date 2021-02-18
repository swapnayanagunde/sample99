package primusbank.test;

import org.testng.annotations.Test;

import Utils.Apputils;
import primusbank.library.bankerhomepage;
import primusbank.library.primusbankhomepage;

public class primusbankbanker extends Apputils
{
	@Test
public void checkbankermodule()
{
	primusbankhomepage phome=new primusbankhomepage();
	phome.bankerlogin("Ameerpet", "Banker", "Banker");
	bankerhomepage bhome=new bankerhomepage();
	bhome.bankerlogout();
}
}
