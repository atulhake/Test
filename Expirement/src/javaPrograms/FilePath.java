package javaPrograms;

import java.io.File;
import java.io.IOException;

public class FilePath {

	public static void main(String[] args) throws Exception {
		
		File ss = new File("employees.json");
		//System.out.println(ss.getPath());
		try {
			
			ss.createNewFile();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
