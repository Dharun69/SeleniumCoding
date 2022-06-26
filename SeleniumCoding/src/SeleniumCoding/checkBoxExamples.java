package SeleniumCoding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBoxExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "E:\\browserdriver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://www.leafground.com/pages/checkbox.html");
//Select the languages that you know?

WebElement selectjava = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/input[1]"));
selectjava.click();
//Confirm Selenium is checked

WebElement checkSelenium = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/input"));
boolean status1 = checkSelenium.isSelected();
System.out.println(status1);
//DeSelect only checked

WebElement firstElement = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/input[1]"));
if(firstElement.isSelected()) {
	firstElement.click();
}
WebElement secondElement = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/input[2]"));
if(secondElement.isSelected()) {
	secondElement.click();
	
}
	}
	

}
