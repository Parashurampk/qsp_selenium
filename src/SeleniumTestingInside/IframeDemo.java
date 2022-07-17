package SeleniumTestingInside;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Hitendra\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		Thread.sleep(2000);
		// First finding the elements using any of locator strategy
		List<WebElement> iframList = driver.findElements(By.tagName("iframe"));
		int totalFrames = iframList.size();
		System.out.println("No of Frames:" + totalFrames);
		WebElement ele = driver.findElement(By.name("iframe_b"));
		System.out.println("Frame Names are:");
		for (WebElement iframe : iframList) {
			System.out.println(iframe.getAttribute("name"));
			if (iframe.getAttribute("name").equals("iframe_b")) {
				// switch to frame by element
				driver.switchTo().frame(ele);
				// Perform all the required tasks
				driver.findElement(By.id("searchInput")).sendKeys("iframe Testing");
				Thread.sleep(2000);
				// Switching back to the main window
				driver.switchTo().defaultContent();
			}
		}
		boolean btnDisplayed = driver.findElement(By.id("simpleAlert")).isDisplayed();
		System.out.println(btnDisplayed);
		driver.close();
	}
}