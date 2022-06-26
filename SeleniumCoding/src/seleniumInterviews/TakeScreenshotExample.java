package seleniumInterviews;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshotExample {

	public static void main(String[] args) throws IOException, AWTException {

		System.setProperty("webdriver.chrome.driver", "E:\\browserdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.navigate().to("http://www.leafground.com/pages/Alert.html");

		driver.manage().window().maximize();
		//Take a screenshot
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		File sourceFile =  screenshot.getScreenshotAs(OutputType.FILE);
		File destinationFile = new File("E:\\Screenshots\\demo.png");
		FileHandler.copy(sourceFile, destinationFile);

		driver.findElement(By.xpath("//button[@onclick='normalAlert()']")).click();

		Robot robot = new Robot();
		Dimension screenSize =Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle = new Rectangle(screenSize);
		BufferedImage source = robot.createScreenCapture(rectangle);
		
		File destinationnFile = new File("E:\\Screenshots\\afteralert.png");
		ImageIO.write(source, "png", destinationnFile);

		
	}

}
