package seleniumInterviews;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchResultLinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");

		WebElement searchBox =  driver.findElement(By.name("q"));
		searchBox.sendKeys("Game of thrones \n");
		Thread.sleep(5000);


		/*
		 * This will print all the URLs in the page List<WebElement> totalLinks =
		 * driver.findElements(By.xpath("//a")); 
		 * for (WebElement links : totalLinks) {
		 * System.out.println(links.getAttribute("href")); }
		 */

		
		////*[@id='search']//following::h3//following::div/cite
	
	//Fetch main links
		
		List<WebElement> mainLinks = driver.findElements(By.xpath("//*[@id='search']//following::h3//following::div/cite"));
	
		for (WebElement links : mainLinks) {
			System.out.println(links.getText());
		}
	}

}
