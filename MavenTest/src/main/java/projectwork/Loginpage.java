package projectwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.abc.commonfunctionality.Browserlaunch;

public class Loginpage {

	
	//non-primitive return-type
	     public  WebDriver driver;
	     
	      
	     //here we created parameterized constructor
	public Loginpage(WebDriver driver) {
		this.driver=driver;
			
	}

	public WebElement username() {
		
		return driver.findElement(By.xpath("//input[@id='txtUsername']"));
	
	}
	
	public WebElement password() {
		
		return driver.findElement(By.xpath("//input[@name='txtPassword']"));
		
	}
	 
	public WebElement loginbtn(){
		
		return driver.findElement(By.xpath("//input[@name='Submit']"));
		
	}
	
	public WebElement invalidtxt() {
		
		return driver.findElement(By.xpath("//span[@id='spanMessage']"));
		
	}
	
	public void login(String username,String password) {
		username().sendKeys(username);
		password().sendKeys(password);
		loginbtn().click();
	}
}
