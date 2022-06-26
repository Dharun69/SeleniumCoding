package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsExample {


	String name = "hi";
	//boolean value = false;
@Test
	public void checkEqual() {
		
		  if(name.equals("hi")) { 
			  System.out.println("Ouput is hi"); 
			  }else {
		  System.out.println("Not correct"); 
		  }
		 
	
	Assert.assertEquals(name, "Hi");
}
}
