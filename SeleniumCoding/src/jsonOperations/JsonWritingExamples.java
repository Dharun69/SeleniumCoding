package jsonOperations;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonWritingExamples {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		JSONObject jsonObject = new JSONObject();
		jsonObject.put("Name", "Dharun");
		jsonObject.put("Age", 1);
		
		JSONArray array=new JSONArray();
		array.add("magical smile");
		array.add("magnetic eyes");
		
		jsonObject.put("Special Qualities", array);
		FileWriter fileWriter=new FileWriter("dharrr.json");
		fileWriter.write(jsonObject.toJSONString());
		fileWriter.close();
		
	}

}
