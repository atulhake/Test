package javaPrograms;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.regex.*;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;

public class Regex {
	public static void main(String[] args) throws ParseException, Exception {/*
	
        JSONObject obj = new JSONObject();
      
        try {
			obj.put("name", "mkyong.com");
		     obj.put("age", new Integer(100));
		     JSONArray list = new JSONArray();
		        list.put("msg 1");
		        list.put("msg 2");
		        list.put("msg 3");

		        obj.put("messages", list);

		        try (FileWriter file = new FileWriter("employees.json")) {

		            file.write(obj.toString());
		            file.flush();

		        } catch (IOException e) {
		        }

		} catch (JSONException e1) {
	
		}
        System.out.print(obj);
   
   */

      /*  //JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();
         
        try (FileReader reader = new FileReader("employees.json"))
        {
            //Read JSON file
            Object obj = jsonParser.parse(reader);
 
            JSONArray employeeList = (JSONArray) obj;
            System.out.println(employeeList);
             
 
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
	int a = 10;
	System.out.println(a);
	
	}

}
