package jsonOperations;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonReadingExample {

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub

		JSONParser jsonParser=new JSONParser();
		FileReader fileReader=new FileReader("dharrr.json");
		
	Object parsedObject =	jsonParser.parse(fileReader);
	
	JSONObject jsonObject = (JSONObject) parsedObject;
	String name =(String) jsonObject.get("Name");
	Long age =(Long) jsonObject.get("Age");
	JSONArray array =(JSONArray) jsonObject.get("Special Qualities");
	
	Iterator iterator = array.iterator();
	System.out.println("The Name is "+name);
	System.out.println("The age is "+age);
	while(iterator.hasNext()) {
		System.out.println("The Special Qualites is " + iterator.next());
	}
	
	
	
	}

}
