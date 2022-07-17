package DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTesting {

	WebDriver driver;

	@BeforeClass
	public void Setup() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.phptravels.net/login");
		driver.findElement(By.xpath("//input[@id='']")).sendKeys("Email");
		driver.findElement(By.xpath("//input[@placeholder='Wachtwoord']")).sendKeys("Password");
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg btn-block effect ladda-button waves-effect']")).submit();
	}

	@Test(dataProvider="LoginData")
	public void LoginTest(String Email,String Password, String exp )
	{

	}
	
	
	@DataProvider(name="LoginData")
	public String[][] getData()
   {
	  String loginData[][]={
			  					{"user@phptravels.com","demouser","valid"},
			  					{"admin@store.com","admin1","invalid"},
			  					{"admin@store.com","admin2","invalid"},
			  					{"admin@store1.com","admin3","invalid"}
	                        };
	  
	  return loginData;
   }
	
	@AfterClass
	void teardown()
	{
		driver.close();
	}
}
