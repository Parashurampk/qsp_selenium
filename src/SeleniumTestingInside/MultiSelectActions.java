package SeleniumTestingInside;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Action;

import org.openqa.selenium.interactions.Actions;

public class MultiSelectActions {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver",

				"C:\\Users\\Hitendra\\Downloads\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.seleniumeasy.com/test/jquery-dual-list-box-demo.html");

		Thread.sleep(1000);

		Actions act = new Actions(driver);

		List<WebElement> list = driver.findElements(By.xpath

		("//select[@class='form-control pickListSelect pickData']/option"));

		Action actions = act.keyDown(Keys.CONTROL)

				.click(list.get(0))

				.click(list.get(2))

				.click(list.get(4))

				.click(list.get(5))

				.keyUp(Keys.CONTROL)

				.build();

		actions.perform();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@class='col-sm-2 pickListButtons']/button[1]"))

				.click();

		Thread.sleep(2000);

		driver.close();

	}
}