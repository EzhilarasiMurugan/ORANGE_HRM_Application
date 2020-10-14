package Browser_Launching_And_Closing_Functions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Browser_Launching_And_Closing_Functions 
{
	public static WebDriver driver=null;
    public static Properties properties=null;

	public Properties loadPropertyFile() throws IOException 
	{
		FileInputStream fileinputstream= new FileInputStream("config.properties");
	    properties= new Properties();
		properties.load(fileinputstream);
		return properties;
	 }
	@BeforeSuite
	public void launchBrowser() throws IOException 
	{
		loadPropertyFile();
	    String browser=	properties.getProperty("browser");
	    String url=	properties.getProperty("url");
	    String driverLocation=	properties.getProperty("DriverLocation");

		if(browser.equalsIgnoreCase("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver",driverLocation);
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("chrome")) 
		{

			System.setProperty("webdriver.gecko.driver",driverLocation);
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	}
	
	@AfterSuite
	public void ClosingBrowser() 
	{
		 
		driver.manage().deleteAllCookies();
		driver.quit();
	
	}
	
	
	
}

