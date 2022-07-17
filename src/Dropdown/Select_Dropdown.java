package Dropdown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Dropdown {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://artoftesting.com/samplesiteforselenium");
        driver.manage().window().maximize();
        
       WebElement ele=driver.findElement(By.xpath("//select[@id='testingDropdown']"));
       Select s = new Select(ele);
      //s.selectByIndex(index);
      //s.selectByValue(arg0);
      s.selectByVisibleText("Manual Testing");
       
       
      
   	
   	  // Count the options in the dropdown
      
       List<WebElement>options =s.getOptions();   //Get the address of all the options 
       int count =options.size();
       System.out.println("Number of options in the dropdowns=" +  count);
       
       
       //(Print all the dropdown options )
      
      for (WebElement we :options)    //By using enhanced loop
      {
    	  String text = we.getText();
    	  System.out.println("Number of options in the dropdowns are =" + text);
    	 
      }

      	
//      for (int i=0; i<count; i++)    //By using loop 
//      {
//    	  WebElement ele1= options.get(i);
//    	  String text = ele1.getText();
//    	  System.out.println("Number of options in the dropdowns are =" + text);
//      }
      
      //sort the text in Ascending order 
      ArrayList<String> l= new ArrayList<String>();
      for(WebElement we :options)
      
      {
    	 String text = we.getText();
    	 l.add(text);
      }
  	  Collections.sort(l);
  	  {
  		for(String t:l)
  		{
  			System.out.println(t);
  		}
  	}
  	  
  	  
  	  //Verify whether the specified option is present or not 
  	  if (l.contains("Database Testing"))
  	  {
  		  System.out.println("options is presesnt"); 
  	  }
  	  else
  	  {
  		System.out.println("options is Not presesnt");
  	  }
	}


}
