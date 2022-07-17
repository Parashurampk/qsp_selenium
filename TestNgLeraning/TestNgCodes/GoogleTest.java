package TestNgCodes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");

	}

	@Test(priority = 2,groups = "Logo")
	public void googleTitleTest() {
		String Title = driver.getTitle();
		System.out.println(Title);
	}
	
	@Test(priority = 1,groups = "Logo")
	public void googleLogoTest() {
		boolean b= driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
	}
	
	@Test(priority = 3)
	public void imageText() {
		boolean b= driver.findElement(By.xpath("//a[normalize-space()='Images']")).isEnabled();
	}
	
	@Test(priority = 4)
	public void searchTextbox() {
		boolean b= driver.findElement(By.xpath("//input[@title='Search']")).isEnabled();
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
