package SeleniumCoding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\browserdriver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://www.leafground.com/pages/Image.html");
	
	    WebElement firstImage = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/img"));
	    firstImage.click();
	    
	    WebElement homeImage = driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[4]/a/img"));
	    homeImage.click();
	    WebElement brokenImage = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/img"));
	//naturalWidth = 0
	    
	    if(brokenImage.getAttribute("naturalWidth").equals("0")) {
	       System.out.println("The image is broken");
	} else {
		System.out.println("The image is NOT broken");
	}
	}
}
