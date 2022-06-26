package seleniumInterviews;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class ActiveElementExample {
	//static WebElement q;

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");


		driver.switchTo().activeElement().sendKeys("bikes \n");
		//PageFactory.initElements(driver, ActiveElementExample.class);
		//q.sendKeys("CBE \n");

	}

}
