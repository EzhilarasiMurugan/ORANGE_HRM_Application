package Page_Objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.WebElementHandler;
import org.openqa.selenium.support.FindBy;

public class Dashboard_Page_Objects 
{
	@FindBy(id="menu_dashboard_index")
	public static WebElement Dashboard;
    @FindBy(xpath="//*[@id=\"task-list-group-panel-menu_holder\"]//following::td[1]")
	public static WebElement PendingLeaveRequest;
    @FindBy(xpath="//*[@id=\"task-list-group-panel-menu_holder\"]/table/tbody/tr/td/a")
    public static List<WebElement> PendingLeaveRequestList;
}
