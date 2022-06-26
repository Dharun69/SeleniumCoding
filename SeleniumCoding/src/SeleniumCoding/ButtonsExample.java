package SeleniumCoding;

//import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonsExample {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "E:\\browserdriver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://www.leafground.com/pages/Button.html");
// 1 find the xy position 
WebElement getPositionButton=driver.findElement(By.id("position"));
Point xypoint = getPositionButton.getLocation();
int xvalue=xypoint.getX();
int yvalue=xypoint.getY();
System.out.println("X value is :"+xvalue +"Y value is :"+yvalue);

// 2 find button color
WebElement colorButton = driver.findElement(By.id("color"));
String color =colorButton.getCssValue("background-color");
System.out.println("Button color is :"+color);

//3 find the size
WebElement size = driver.findElement(By.id("size"));
int height = size.getSize().getHeight();
int width =size.getSize().getWidth();
System.out.println("The Height is :"+ height + "The Width is :" + width);

//4 click go home button
WebElement gohome = driver.findElement(By.id("home"));
gohome.click();
	}

}
