package TestCases;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Browser_Launching_And_Closing_Functions.Browser_Launching_And_Closing_Functions;
import Page_Objects.Dashboard_Page_Objects;
import Page_Objects.Login_Page_Objects;

public class Test_Pending_Leave_Request extends Browser_Launching_And_Closing_Functions
{
    @BeforeTest
	public void login()
	{
		PageFactory.initElements(driver, Login_Page_Objects.class);
		Login_Page_Objects.username.sendKeys(properties.getProperty("Username"));
		Login_Page_Objects.password.sendKeys(properties.getProperty("Password"));
		Login_Page_Objects.login.click();	
		
	}
	@Test
	public void verifyPendingLeaveRequest() 
	{
		PageFactory.initElements(driver, Dashboard_Page_Objects.class);
		Dashboard_Page_Objects.Dashboard.click();
		/*String actualMessage = Dashboard_Page_Objects.PendingLeaveRequest.getText();
		Assert.assertEquals(actualMessage, "No Records are Available");*/
	     if(Dashboard_Page_Objects.PendingLeaveRequestList.isEmpty()) 
	     {
	    	 System.out.println("No PendingLeaveRequest");
	     }
	     else 
	     {
	    	 System.out.println("There is PendingLeaveRequest"); 
	     }
	}
	
}




