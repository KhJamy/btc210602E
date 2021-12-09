package Db;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadFile {
	
	public Properties readProfile(String path) throws IOException {
		
		FileInputStream f = new FileInputStream(path);
		Properties prop = new Properties();
		prop.load(f);
		return prop;
		
		//System.out.println();
	}
	
	public void name() {
		
		System.out.println("hi");
		
	}
}
