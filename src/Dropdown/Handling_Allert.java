package Dropdown;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_Allert {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Cognizant");
		driver.manage().window().maximize();

//        JavascriptExecutor js= (JavascriptExecutor) driver; 
//        
//        driver.findElement(By.xpath("//button[contains(text(),'alert box:')]")).click();
//        Thread.sleep(3000);
//        //Switch control from page to alert
//        Alert a = driver.switchTo().alert();
//        
//        //Get the text inside the popup
//        String text = a.getText();
//        System.out.println(text);
//        a.accept();//Click on the alert
//        
//        //a.dismiss();//Click on cancel button
//      
//		Actions action1 =new Actions(driver);
//	    action1.keyDown(Keys.CONTROL).sendKeys(String.valueOf('\Acquisitions')).build().perform();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(1000,0)");
	    
//		WebElement columnsNumber = driver.findElement(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']"));
//		Dimension columnCount = columnsNumber.getSize();
//		System.out.println("No of columns in this table : " + columnCount);
	}
}