package SeleniumCoding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadUsingSendkeys {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"E:\\browserdriver\\chromedriver.exe");
		
		String baseUrl = "http://demo.guru99.com/test/upload/";
		WebDriver driver = new ChromeDriver();
		driver.get(baseUrl);

		//maximize browser
		driver.manage().window().maximize();

		WebElement upload = driver.findElement(By.id("uploadfile_0"));

		upload.sendKeys("C:\\Users\\Dharun\\Downloads\\Wait Time.docx");

        driver.findElement(By.id("terms")).click();
		Thread.sleep(5000);

       // driver.findElement(By.name("send")).click();

        driver.findElement(By.id("submitbutton")).click();

		//C:\Users\Dharun\Downloads\Wait Time.docx

	}

}
