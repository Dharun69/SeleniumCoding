package SeleniumCoding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "E:\\browserdriver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.navigate().to("http://www.leafground.com/pages/table.html");

// Get the count of number of columns
List<WebElement> columns = driver.findElements(By.tagName("th"));
int columnCount = columns.size();
System.out.println("Number of columns"+columnCount);

//Get the count of number of rows

List<WebElement> rows = driver.findElements(By.tagName("tr"));
int rowsSize = rows.size();
System.out.println("Number of rows"+rowsSize);

//Get the progress value of 'Learn to interact with Elements'

WebElement getPercent = driver.findElement
(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));
	String percent = getPercent.getText();
	System.out.println("Percentage is "+ percent);
	
	//Check the vital task for the least completed progress.

List<WebElement> allProgress = driver.findElements(By.xpath("//td[2]"));

List<Integer> numberList = new ArrayList<Integer>();

for (WebElement webElement : allProgress) {
	String individual = webElement.getText().replace("%", "");
	numberList.add(Integer.parseInt(individual));
	}
System.out.println("Final list"+ numberList);


int smallValue = Collections.min(numberList);
System.out.println("Small value is"+smallValue);

////td[normalize-space()="20%"]//following::td[1]

String smallValueString = Integer.toString(smallValue)+"%";	

String finalXpath = "//td[normalize-space()="+"\""+smallValueString+ "\""+"]"+"//following::td[1]";
	System.out.println(finalXpath);
	
	WebElement checkBox = driver.findElement(By.xpath(finalXpath));
	checkBox.click();
	}
}
