package SeleniumCoding;

import java.util.List;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SortableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\browserdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/sortable.html");
List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\'sortable\']/li"));	

WebElement fromElements = elements.get(6);
WebElement toElements=elements.get(0);

Actions actions = new Actions(driver);
actions.clickAndHold(fromElements);
actions.moveToElement(toElements);
actions.release(toElements);
actions.build().perform();

	}

}
