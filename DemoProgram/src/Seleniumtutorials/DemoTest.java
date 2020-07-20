package Seleniumtutorials;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTest {

	public static void main(String[] args) {
		
		//Error provoking areas????
		
		//If you forgot to set property or if you give wrong path of chrome.exe file or if version is not correct
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // if you want to automate chromedriver we have to create object 
		                                         //of chromedriver class
		
		driver.get("https://www.google.com/"); // to open the URL
		System.out.println(driver.getTitle()); //To get the title of the page
		System.out.println(driver.getCurrentUrl()); //To get the currentURL of the page
		//System.out.println(driver.getPageSource());  //To get the html code of current page
		System.out.println(driver.getClass()); //To get the class of current object which is driver
		
		

	}

}
