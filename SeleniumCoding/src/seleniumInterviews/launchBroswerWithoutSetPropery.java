package seleniumInterviews;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchBroswerWithoutSetPropery {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "E:\\browserdriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.google.com");
	}

}
