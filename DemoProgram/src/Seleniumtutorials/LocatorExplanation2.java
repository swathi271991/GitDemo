package Seleniumtutorials;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorExplanation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/"); // to open the URL
		
		//Defining the webelement using class name (Class name shouldn't have spaces, id we have spaces 
		                        //then it will consider as compound class, there is a chance of failure so 
		                         // compund class shouldn't use)
		
		/*if name attribute is same for both username and password then selenium by default search from 
		top left and it clicks on username field and ignores password*/
		
		driver.findElement(By.id("username")).sendKeys("Name");
		driver.findElement(By.name("pw")).sendKeys("test123");
		driver.findElement(By.className("button r4 wide primary")).click(); //--> compound class
		
		
	   /* ********************************************** */
	    driver.get("https://www.facebook.com/");
	    driver.findElement(By.className("inputtext login_form_input_box")).sendKeys("Name");
	                   //we should enter the value in password bt its entering in uname bcz classname is same
	    
	    
	    
		
		
		
		
		
	}

}
