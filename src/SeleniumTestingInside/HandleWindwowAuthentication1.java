package SeleniumTestingInside;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindwowAuthentication1 {

	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Hitendra\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		// driver.close();

	}

}