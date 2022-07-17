package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseover_Actions {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://artoftesting.com/samplesiteforselenium");
        driver.manage().window().maximize();
        
        //First need to place cursor on the specific element
        WebElement ele = driver.findElement(By.xpath("//body/nav[@id='site-navigation']/div[1]/div[3]/ul[1]/li[2]/a[1]"));
        Actions  act = new Actions(driver);
        act.moveToElement(ele).perform(); //mouseover on the element
        
      //act.doubleClick(ele).perform(); // perform double click actions on the element 
        
      //act.contextClick(ele).perform(); // perform right click actions on the element
        
        // Then click on next which element you want to click 
        driver.findElement(By.xpath("//a[contains(text(),'Manual Testing Tutorial')]")).click();
        
        
        //Drag and Drop
        Actions at = null;
		WebElement b1 = null;
		WebElement b3 = null;
		at.dragAndDrop(b1, b3).perform();
	}

}
