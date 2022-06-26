package seleniumInterviews;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetVsNavigate {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\browserdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.get("http://www.google.com"); //Dom appear wait
		
		driver.navigate().to("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("bikes"+Keys.ENTER);
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.navigate().forward();
		

	
	}

}
