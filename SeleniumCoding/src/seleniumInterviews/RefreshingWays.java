package seleniumInterviews;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RefreshingWays {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\browserdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("Bikes"+Keys.ENTER);
		driver.findElement(By.name("q")).sendKeys("Bikes"+Keys.ENTER+Keys.F5); 

		//refresh command
		//driver.navigate().refresh();
		
		//get current url
		
		//driver.get(driver.getCurrentUrl());
		
		//javascript Executor
		/*
		 * JavascriptExecutor executor = (JavascriptExecutor) driver;
		 * executor.executeScript("location.reload()");
		 */
		
		/*
		 * JavascriptExecutor executor = (JavascriptExecutor) driver;
		 * executor.executeScript("history.go()");
		 */
		
		/*
		 * Robot robot = new Robot(); 
		 * robot.keyPress(KeyEvent.VK_F5);
		 * robot.keyRelease(KeyEvent.VK_F5);
		 */
		
		
	}

}
