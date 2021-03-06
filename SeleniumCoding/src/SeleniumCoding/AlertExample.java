package SeleniumCoding;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "E:\\browserdriver\\chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.get("http://www.leafground.com/pages/Alert.html");
// click the button to display a alert box
WebElement alertBox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));
alertBox.click();
Alert alert = driver.switchTo().alert();  //most important
Thread.sleep(3000); //no need to use in production code
alert.accept();

WebElement confirmbutton = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
confirmbutton.click();
Alert confirmAlert = driver.switchTo().alert(); // important
Thread.sleep(3000);
confirmAlert.dismiss();

WebElement promptBox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/button"));
promptBox.click();
Alert prompAlert = driver.switchTo().alert();
prompAlert.sendKeys("Oi");
Thread.sleep(3000);
prompAlert.accept();

	}
	

}
