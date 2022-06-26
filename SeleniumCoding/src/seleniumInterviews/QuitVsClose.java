package seleniumInterviews;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClose {


	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\browserdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/home.html");
		
		WebElement window = driver.findElement(By.xpath("//*[@id=\'post-153']/div[2]/div/ul/li[11]/a/img"));
		window.click();
		
		WebElement home1 = driver.findElement(By.id("home"));
		home1.click();
		
		driver.close();
		//driver.quit();
		
	}

}
