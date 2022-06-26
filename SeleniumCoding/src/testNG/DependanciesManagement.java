package testNG;

import org.testng.annotations.Test;

public class DependanciesManagement {
@Test(enabled = true)
	public void elementarySchool () {
	System.out.println("elementarySchool");
		
}
@Test(dependsOnMethods = "elementarySchool")
public void highSchool () {
System.out.println("HighSchool");
}
@Test(dependsOnMethods = "highSchool")
public void higherSecondary () {
System.out.println("higherSecondary");
}
@Test(dependsOnMethods ="higherSecondary" )
public void collge () {
System.out.println("collge");
}}