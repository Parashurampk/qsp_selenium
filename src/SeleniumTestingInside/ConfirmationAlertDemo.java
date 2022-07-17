package SeleniumTestingInside;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlertDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Hitendra\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		// Thread.sleep(2000);

		driver.findElement(By.id("confirmationAlert")).click();

		if (isAlertPresent(driver)) {
			System.out.println("Alert is present");
		} else {
			System.out.println("Alert is not present");
		}
		driver.close();
	}

	public static boolean isAlertPresent(WebDriver ldriver) {

		try {
			Alert alert = ldriver.switchTo().alert();
			String alerteTxt = alert.getText();
			alert.accept();
			// alert.dismiss();
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
		}
		return false;
	}
}
