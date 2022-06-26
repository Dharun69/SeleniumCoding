package seleniumInterviews;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MaximizeWindow {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\browserdriver\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.navigate().to("http://www.google.com");


		//driver.manage().window().maximize();


		/*
		 * Dimension dimension = new Dimension(1920, 1080);
		 * driver.manage().window().setSize(dimension);
		 */
	
		
	
	
	}

}
