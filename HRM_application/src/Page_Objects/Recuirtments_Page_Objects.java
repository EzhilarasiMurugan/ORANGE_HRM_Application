package Page_Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Recuirtments_Page_Objects 
{
	@FindBy(id="menu_recruitment_viewRecruitmentModule")
	public static WebElement Recuirments;
	
	@FindBy(linkText="Vacancies")
	public static WebElement Vacancies;
	
	@FindBy(name="vacancySearch[jobTitle]")
	public static WebElement jobTitle;
	
	@FindBy(name="vacancySearch[jobVacancy]")
	public static WebElement jobVacancy;
	
	@FindBy(name="vacancySearch[hiringManager]")
	public static WebElement hiringManager;
	
	@FindBy(name="vacancySearch[status]")
	public static WebElement status;
	
	@FindBy(id="btnSrch")
	public static WebElement search;
	
	@FindBy(xpath="//tr//td[1]")
	public static WebElement vacancyValue;

}
