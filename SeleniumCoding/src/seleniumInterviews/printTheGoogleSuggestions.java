package seleniumInterviews;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class printTheGoogleSuggestions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		
		WebElement searchBox =  driver.findElement(By.name("q"));
		searchBox.sendKeys("Game of thrones");
		
		Thread.sleep(5000);
	
		List<WebElement> searchSuggestions = driver.findElements(By.xpath("//ul[@role='listbox']//following::li"));
	
		//int position=0;
		
		for (WebElement webElement : searchSuggestions) {
			
			String text = webElement.getText();
			System.out.println(text);
			if(text.contains("cast")) {
				webElement.click();
				break;
			}
			
			//position++;
			
			/*
			 * if(position==3) {
			 *  webElement.click(); 
			 *  break; 
			 *  }
			 */
		}
	
	}

}
