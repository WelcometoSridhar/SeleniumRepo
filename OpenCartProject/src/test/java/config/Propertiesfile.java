package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class Propertiesfile {
	
	static String projectpath = System.getProperty("user.dir");
	Properties prop= new Properties();

	public static void main(String[] args) throws Exception {
		gerPropertiesData();
		setPropertiesData();
	}
	
	public static void gerPropertiesData() throws Exception {
			
		try {
			
			Properties prop= new Properties();			
			//String projectpath = System.getProperty("user.dir");
			InputStream fis= new FileInputStream(projectpath+"\\src\\test\\java\\config\\config.properties");
			prop.load(fis);
			String browser = prop.getProperty("browser");
			System.out.println(browser);
				 
		} catch (FileNotFoundException e) {
			e.getMessage();
			e.getMessage();
			e.printStackTrace();
		}
		
		
	}

	public static void setPropertiesData() throws Exception {
		
		
		
		try {
			Properties outprop= new Properties();
			OutputStream  output= new FileOutputStream(projectpath+"\\src\\test\\java\\config\\output.properties");
			outprop.setProperty("Test", "pass");
			outprop.store(output, null);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.getMessage();
			e.getMessage();
			e.printStackTrace();
		}
	}
	
}
