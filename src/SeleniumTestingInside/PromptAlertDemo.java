package SeleniumTestingInside;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PromptAlertDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Hitendra\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		Thread.sleep(3000);
		driver.findElement(By.id("promptAlert")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		String alertText = alert.getText();
		System.out.println("Alert Text is: " + alertText);
		alert.sendKeys("Yes");
		Thread.sleep(2000);
		alert.accept();
		driver.close();
	}
}
