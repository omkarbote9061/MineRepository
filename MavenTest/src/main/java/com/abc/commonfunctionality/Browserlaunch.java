package com.abc.commonfunctionality;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

import javax.imageio.stream.FileImageInputStream;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

   
public class Browserlaunch {
	//class
	public static WebDriver driver;
	
	public static Properties property;
	
	public void browser_Initilisation() {
		//method
		ReadProperty();
		String browsername=property.getProperty("browsername");
		 
		
	    if( browsername.equalsIgnoreCase("chrome")){
			
 System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			
		}else if(browsername.equalsIgnoreCase("FireFox")){
			
			System.setProperty("webdriver.gecko.driver", "Resources/geckodriver.exe");
			    driver=new FirefoxDriver();
			    driver.manage().window().maximize();
				
			     
		}else {
			
			   System.setProperty("webdriver.edge.driver", "Resources/msedgedriver.exe");
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			
		}
	    driver.get(property.getProperty("url"));   
	   
	}

	public static void ReadProperty() {
		
		try {
			 property=new Properties();
			property.load(new FileInputStream("src/main/resources/config.properties"));
		}catch(FileNotFoundException a) {
			
		}catch(IOException j) {
			
		}
		
		
	
}
	
	
}
