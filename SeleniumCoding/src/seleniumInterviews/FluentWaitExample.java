package seleniumInterviews;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitExample {

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

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(Exception.class);

		WebElement myProfile = wait.until(new Function<WebDriver, WebElement>() {

			
			public WebElement apply(WebDriver driver) {
				// TODO Auto-generated method stub
				return driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[1]/div/div[3]/ul/li[4]/a"));
			}
			
		});
		myProfile.click();
	}

}
