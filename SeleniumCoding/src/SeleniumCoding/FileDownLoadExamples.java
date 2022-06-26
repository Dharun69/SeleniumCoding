package SeleniumCoding;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownLoadExamples {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\browserdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/upload-download");

		
			WebElement downloadLink = driver.findElement(By.linkText("Download"));
			downloadLink.click();
			Thread.sleep(3000);
			
			File fileLocation = new File("C:\\Users\\Dharun\\Downloads");
			File[] totalFiles = fileLocation.listFiles();
			
			for (File file : totalFiles) {
				if (file.getName().equals("SampleFile.jpeg"));
				System.out.println("File is downloaded" );
				break;
			}
}

}
