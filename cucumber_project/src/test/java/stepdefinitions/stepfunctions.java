package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepfunctions

{
	public static WebDriver driver;
	
	@Given("I open Browser with url {string}")
public void launchApp(String url) 
{
    driver=new FirefoxDriver();
    driver.manage().deleteAllCookies();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    driver.get(url);
    
}

@Then("I should see Login page")
public void i_should_see_login_page() 
{
    if(driver.findElement(By.id("btnLogin")).isDisplayed())
    {
    	System.out.println("Application launch successfful");
    }else
    {
    	System.out.println("Application launch failed");
    }
}

@When("I Enter Username as {string}")
public void i_enter_username_as(String uid)
{
   driver.findElement(By.id("txtUsername")).sendKeys(uid);
}

@When("I Enter Password as {string}")
public void i_enter_password_as(String pwd) 
{
	driver.findElement(By.id("txtPassword")).sendKeys(pwd);
}

@When("I click Login")
public void i_click_login()
{
  driver.findElement(By.id("btnLogin")).click();
}

@Then("I should see Admin Home page")
public void i_should_see_admin_home_page()
{
    if(driver.findElement(By.linkText("Admin")).isDisplayed())
    {
    	System.out.println("Admin Login successful");
    }else
    {
    	System.out.println("Admin Login failed");
    }
}

@When("I close Browser")
public void i_close_browser() 
{
   driver.close();
}

}
