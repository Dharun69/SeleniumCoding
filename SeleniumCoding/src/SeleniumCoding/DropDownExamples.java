package SeleniumCoding;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExamples {

	public static void main(String[] args) {//throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\browserdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		WebElement dropdown1 = driver.findElement(By.id("dropdown1"));
		Select select = new Select(dropdown1);
		//select.deselectByIndex(2);
		select.selectByIndex(2);
		//Thread.sleep(3000);
		select.selectByValue("3");
		//Thread.sleep(3000);
		select.selectByVisibleText("Appium");
		//get the number of dropdown options
		
		List<WebElement> listOfOptions= select.getOptions();
		int size = listOfOptions.size();
		System.out.println("Number of elements :"+ size);
		
		// You can use sendkeys for dropdown element.

		dropdown1.sendKeys("Loadrunner");
		WebElement multiselect=driver.findElement(By.
				xpath("//*[@id=\'contentblock\']/section/div[6]/select"));
		
		Select multiselectbox = new Select(multiselect);
		multiselectbox.selectByIndex(1);
		multiselectbox.selectByIndex(2);
		multiselectbox.selectByIndex(3);
	}

}
