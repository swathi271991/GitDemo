package Seleniumtutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocatorConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/"); // to open the URL
		
//Xpath is defined in N number of ways.. 
//Firebug/Firepath is depreciated from firefox version 56..if you still want to use then degrade we need to degrade
		
//Defining the webelement using xpath (Syntax : //tagname[@attribute ='value'] --> double quote is not accepted
		
//1) Absoulute xpath :- /html/body/div[1]/div[3]/div[5]/a
//2) Relative xpath :- //input[@id ='username']
		
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("Name");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("pass");
		driver.findElement(By.xpath("//*[@id='Login']")).click(); 
		System.out.println(driver.findElement(By.cssSelector("#error")).getText()); //to get the text of 
		                                                                   //particular webElemnt
		

//Defining the webelement using CSSSelector (Syntax : #id)
// There is no direct way to get CSS in chrome..we can find that in tool bar below.
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.cssSelector("#email")).sendKeys("Name");
		driver.findElement(By.cssSelector("#pass")).sendKeys("pass");
		driver.findElement(By.cssSelector("#u_0_b")).click(); 
		
		
		
		
		
		
		
		
	}

}
