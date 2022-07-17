package SeleniumTestingInside;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Cognizant");
		driver.manage().window().maximize();
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,1500);");

		List<WebElement> allheader = driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']//th"));
		System.out.println(allheader.size());

		for (WebElement ele : allheader) {
			String value = ele.getText();
			System.out.println(value);
		}
	}

}
