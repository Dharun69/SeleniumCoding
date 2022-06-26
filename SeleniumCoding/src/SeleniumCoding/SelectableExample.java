package SeleniumCoding;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectableExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\browserdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/selectable.html");
		
		List<WebElement>  selectable = driver.findElements(By.xpath("//*[@id=\'selectable\']/li"));
		int listOfSize = selectable.size();
		System.out.println(listOfSize);
/*Actions actions = new Actions(driver);
actions.keyDown(Keys.CONTROL)
.click(selectable.get(0))
.click(selectable.get(1))
.click(selectable.get(2))           
.build().perform();*/

Actions actions = new Actions(driver);	
actions.clickAndHold(selectable.get(0));
actions.clickAndHold(selectable.get(1));
actions.clickAndHold(selectable.get(1));
actions.clickAndHold(selectable.get(2));
actions.build().perform();

	}

}
