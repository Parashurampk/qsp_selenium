package zenQ;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

	
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/popup.php");
		
		String parent=driver.getWindowHandle();	
		System.out.println("Parent id :" +parent);
		
		driver.findElement(By.xpath("//a[@href='../articles_popup.php']")).click();
		
		Set<String>	allwindows=driver.getWindowHandles();
		System.out.println("All windows :" +allwindows);
		
		for (String handle:allwindows)
		{
			if (!parent.equals(handle))
			{
				driver.switchTo().window(handle);
				driver.findElement(By.xpath("//input[@name='emailid']"));
				driver.findElement(By.xpath("//input[@name='btnLogin']"));
			}
		}
		driver.switchTo().window(parent);
		System.out.println(driver.getTitle());
	}
	
}

