package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import Browser_Launching_And_Closing_Functions.Browser_Launching_And_Closing_Functions;
import Page_Objects.Recuirtments_Page_Objects;

public class Test_Recuirments extends Browser_Launching_And_Closing_Functions 
{
	@Test
	public void check_Vacancies() 
	{
		PageFactory.initElements(driver,Recuirtments_Page_Objects.class);
		Recuirtments_Page_Objects.Recuirments.click();
		Recuirtments_Page_Objects.Vacancies.click();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		
		//selecting hiringmanager
		Select selectHiringManager = new Select(Recuirtments_Page_Objects.hiringManager);
		 selectHiringManager.selectByVisibleText("Dominic Chase");
		 
		//selecting Status
		 Select selectStatus = new Select(Recuirtments_Page_Objects.status);
		 selectStatus.selectByVisibleText("Closed");
		 
		 
		 Recuirtments_Page_Objects.search.click();
		 String vacancyResult = Recuirtments_Page_Objects.vacancyValue.getText();
		 Assert.assertEquals(vacancyResult, "No Records Found");
		 
	
	}
	

}
