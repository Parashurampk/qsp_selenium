/**
 * 
 */
package TestNgCodes;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * @author Parashuram
 *
 */
public class FlipkartTest {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/search?q=mobiles&sid=tyy%2C4io&as=on&as-show=on&otracker=AS_QueryStore_OrganicAutoSuggest_1_1_na_na_ps&otracker1=AS_QueryStore_OrganicAutoSuggest_1_1_na_na_ps&as-pos=1&as-type=HISTORY&suggestionId=mobiles%7CMobiles&requestId=c0709070-c908-44f6-950f-7bd600092ca3");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	}

	@Test
	public void searchMobileList() {

	WebElement countElements =driver.findElement(By.xpath("//div[@class='_4rR01T']"));
	countElements.getSize();
	}
}