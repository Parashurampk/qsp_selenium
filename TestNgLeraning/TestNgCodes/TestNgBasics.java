package TestNgCodes;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {

	@BeforeSuite
	public void launchBrowser() {
		System.out.println("setup system property");
	}

	@BeforeClass
	public void setUp() {
		System.out.println("launch browser");
	}

	@BeforeTest
	public void login() {
		System.out.println("login to app");
	}
	
	@BeforeMethod
	public void enterURL() {
		System.out.println("enter url");
	}
	
	@Test
	public void googleLoginTest() {
		System.out.println("google Login Test");
	}
	
	@AfterMethod
	public void lohOut() {
		System.out.println("logout from App");
	}
	
	@AfterTest
	public void deleteAllCookies() {
		System.out.println("deleteAllCookies ");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("deleteAllCookies ");
	}
	
	@AfterSuite
	public void generateTestReport() {
		System.out.println("generateTestReport ");
	}
	
	
}
