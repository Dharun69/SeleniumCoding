package seleniumInterviews;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\browserdriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://www.phptravels.net/login");

		WebElement userName = driver.findElement(By.xpath("//input[@name='email'] [@placeholder='Email']"));
		userName.sendKeys("user@phptravels.com");

		WebElement passWord = driver.findElement(By.xpath("//input[@type='password'] [@placeholder='Password']"));
		passWord.sendKeys("demouser");

		WebElement login = driver.findElement(By.xpath("//button[@type='submit'] [@class='btn btn-default btn-lg btn-block effect ladda-button waves-effect']"));
		login.click();

		//WebDriverWait wait = new WebDriverWait(driver, 10);  basically, this is deprecated.


		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement myProfile =	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"fadein\"]/div[1]/div/div[3]/ul/li[4]/a")));
		myProfile.click();
	}

}
