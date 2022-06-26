package SeleniumCoding;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.Enter;

public class CalenderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\browserdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/Calendar.html");
		
		WebElement searchBox = driver.findElement(By.id("datepicker"));
		//searchBox.sendKeys("3/10/2022"+ Keys.ENTER);
		searchBox.click();
		////a[@title='Next']
		WebElement nextButton = driver.findElement(By.xpath("//a[@title='Next']"));
		nextButton.click();
		
		//a[contains(text(),'10')]
		WebElement selectButton = driver.findElement(By.xpath("//a[contains(text(),'10')]"));
		selectButton.click();
		
	}

}
