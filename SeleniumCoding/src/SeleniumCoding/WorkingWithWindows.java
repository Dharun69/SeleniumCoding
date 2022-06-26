package SeleniumCoding;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\browserdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");

		String oldWindow = driver.getWindowHandle();    //Identify the parent window

		WebElement clickHomeButton = driver.findElement(By.id("home"));
		clickHomeButton.click();

		Set<String> handles  =  driver.getWindowHandles();  //set control to new window(handles has two windows now)

		for (String newwindow : handles) {
			driver.switchTo().window(newwindow);  //switch control to new window
		}
		WebElement editbox = driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a/img"));
		editbox.click();

		driver.close();

		driver.switchTo().window(oldWindow) ; //comes to default window
		//Find the number of opened windows

		WebElement openMultiple=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		openMultiple.click();

		int numberOfWindows = driver.getWindowHandles().size();
		System.out.println("Number of windows : " + numberOfWindows);
		//Close all except this window
		WebElement closeNewWindow = driver.findElement(By.id("color"));
		closeNewWindow.click();


		Set<String> newWindowHandles = driver.getWindowHandles();
		for (String allWindows : newWindowHandles) {
			if (!allWindows.equals(oldWindow)) {      //if not parent window close it

				driver.switchTo().window(allWindows);
				driver.close();

			}

		}
		driver.quit();
	}
}
