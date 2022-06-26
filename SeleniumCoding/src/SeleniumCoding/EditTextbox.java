package SeleniumCoding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditTextbox {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "E:\\browserdriver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://www.leafground.com/pages/Edit.html"); 

WebElement Entermailid = driver.findElement(By.id("email"));
Entermailid.sendKeys("dharun.r44@test.com");

WebElement Addtext = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
Addtext.sendKeys("Hi Dharun");

WebElement gettextbox = driver.findElement(By.name("username"));
String value = gettextbox.getAttribute("value");
System.out.println(value);

WebElement Clearbox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));

Clearbox.clear();

WebElement disabled = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input"));
boolean enabled = disabled.isDisplayed();
System.out.println(enabled);

}
}