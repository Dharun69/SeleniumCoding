package SeleniumCoding;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompletion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\browserdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/autoComplete.html");

WebElement input = driver.findElement(By.id("tags"));
input.sendKeys("s");
Thread.sleep(4000);   //implicite and explicite wait
List<WebElement> allTheList = driver.findElements(By.xpath("//*[@id=\'ui-id-1\']/li"));
System.out.println(allTheList.size());
for (WebElement webElement : allTheList) {
	if ( webElement.getText().equals("Web Services")) {
	webElement.click();
	break;
}
	}
}
}