package Testcasepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.SendKeysAction;
import org.testng.annotations.Test;

import com.abc.commonfunctionality.Browserlaunch;

import projectwork.Dashboard;
import projectwork.Loginpage;

public class Loginpagetest extends Browserlaunch {

	public static void main(String[] args) throws InterruptedException {
	           	Browserlaunch object=new Browserlaunch(); 
	               	object.browser_Initilisation();
	 //approach 1st-classname.static-variable.findelemment(By.)-------->Browserlaunch.driver.findElement(By.)
	 //by extending one class by other        
	                Loginpagetest object2=new  Loginpagetest();
	                object2.login_unsuccessfull();
	                object2.login_succesfull();
	}
        
	@Test
	public void login_unsuccessfull() {
		
		       Loginpage newobj=new Loginpage(driver);	
		       newobj.login("omkar", "omkar123");
		       
		if(newobj.invalidtxt().isDisplayed()) {
			System.out.println("Your credentials are invalid.please login with valid credentials");
		}else {
			System.out.println("login with invalid credentials is succesfull");
		}
	}
	
	    @Test  
	public void login_succesfull() throws InterruptedException {
		
          Loginpage newobj=new Loginpage(driver); 
		       newobj.login("Admin", "admin123");
		        
	Dashboard newobj1=new Dashboard(driver);	        
		              Thread.sleep(1000);
		if(newobj1.dashboardtxt().isDisplayed()) {
			System.out.println("Your login is successfull with valid credentials and you are arrived @dashboard UI");
		}else {
			System.out.println("your login is unsuccessful with valid credentials");
		}
		
		
	}
	
}
