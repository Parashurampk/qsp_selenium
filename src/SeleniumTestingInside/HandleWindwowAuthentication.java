package SeleniumTestingInside;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindwowAuthentication {

	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Hitendra\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/basic_auth");
		Thread.sleep(2000);
		Runtime.getRuntime().exec("C:\\Users\\Hitendra\\Desktop\\Authen.exe");
		Thread.sleep(2000);
		// driver.close();
	}
}