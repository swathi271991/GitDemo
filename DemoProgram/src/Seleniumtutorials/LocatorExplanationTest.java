package Seleniumtutorials;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorExplanationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // if you want to automate chromedriver we have to create object 
		                                         //of chromedriver class
		
		driver.get("https://www.facebook.com/"); // to open the URL
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//every object in a webpage may or maynot have id, name, class so..better to prefer xpath and CSS
		
		//Defining the webelement using Id.//Alpha numeric id may vary after every refresh(login btn)
		
		WebElement emailfield = driver.findElement(By.id("email"));
		emailfield.sendKeys("sampleLogin");
		
		//Defining the webelement using name
		
		WebElement passfield = driver.findElement(By.name("pass"));
		passfield.sendKeys("TCS@123");
		
		//Defining the webelement using linkText and how do we define link ?? if tag name starts with "a"
		
		WebElement forgotlink = driver.findElement(By.linkText("Forgotten account?"));
		forgotlink.click();
		driver.close();
		
		//Defining the webelement using partiallinkText 
		
		/* WebElement forgotlink = driver.findElement(By.partialLinkText("Forgotten"));
		forgotlink.click(); */
		
		
		
		
	}

}
