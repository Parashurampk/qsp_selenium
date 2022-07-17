package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_HiddenDivision {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/?&utm_source=bing&utm_medium=cpc&utm_campaign=BR_Cleartrip%7CDomain_E%7C%7Ccleartrip%20com%7Ce&msclkid=fbc2a0566ef11e2f5ca5c0256ff5f01c");
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//body/section[@id='Home']/div[1]/div[1]/div[1]/form[1]/div[4]/section[2]/div[1]/dl[1]/dd[1]/div[1]/a[1]/i[1]")).click();
        Thread.sleep(3000);
        
        //Select particular date and click on that .
        driver.findElement(By.xpath("(//a[.=17])[1]")).click();

	}

}
