package seleniumInterviews;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectAllTheCheckboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/checkbox.html");


		List<WebElement> selectAll = driver.findElements(By.xpath("//input[@type='checkbox']"));

		for (WebElement webElement : selectAll) {
			if(webElement.isDisplayed()) {
				webElement.click();

				if(!webElement.isSelected()) {
					webElement.click();
				}
			}


		}

	}

}
