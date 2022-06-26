package seleniumInterviews;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaginationDemo {
	static String nextClassName;

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mdbootstrap.com/docs/b4/jquery/tables/pagination/");
		
		driver.manage().window().maximize();
		
		List<String> namesList = new ArrayList<String>();
		List<WebElement> listOfNames;
		WebElement nextButton;
		
		List<WebElement> allList = driver.findElements(By.xpath("//div[@id='dtBasicExample_paginate']//a"));
		int size = allList.size();
		System.out.println("Pagination size "+ size);
		
		if(size>0) {
			
			do {
				listOfNames = driver.findElements(By.xpath("//td[@class='sorting_1']"));
				
				for (WebElement name : listOfNames) {
					namesList.add(name.getText()); 

				}
			nextButton = driver.findElement(By.id("dtBasicExample_next"));
			nextClassName = nextButton.getAttribute("class");
			
			if(!nextClassName.contains("disabled")) {
				nextButton.click();
			} else {
				break;
			}
			}
			while(true);
		} else {
			System.out.println("No pagination in this page");
		}
		
		for (String allNames : namesList) {
			System.out.println(allNames);
		}
	}

}
