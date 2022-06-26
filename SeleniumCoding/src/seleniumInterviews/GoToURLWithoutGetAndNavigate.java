package seleniumInterviews;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoToURLWithoutGetAndNavigate {

	public static void main(String[] args) {

		String url = "http://www.facebook.com";
		
		WebDriver driver = new ChromeDriver();
		
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		
		executor.executeScript("window.location = \'"+url+"\'");
	}

}
