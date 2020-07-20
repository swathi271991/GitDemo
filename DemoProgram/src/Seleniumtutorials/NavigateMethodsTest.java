package Seleniumtutorials;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethodsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // if you want to automate chromedriver we have to create object 
		                                         //of chromedriver class
		
		driver.navigate().to("https://www.google.com/"); // to open the URL
		System.out.println(driver.getTitle()); //To get the title of the page
		
		driver.navigate().to("https://facebook.com"); //navigating to facebook page
		System.out.println(driver.getTitle());
		
		driver.navigate().back(); //navigating back to google page
		System.out.println(driver.getTitle());
		
		driver.navigate().refresh();// refreshing the current google page
		
		driver.navigate().forward(); // navigating to forward page
		System.out.println(driver.getTitle());
		
		driver.close();
		
		

	}

}
