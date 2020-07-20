package Seleniumtutorials;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		
		WebElement gmaillink = driver.findElement(By.xpath("//a[text() ='Gmail']"));
		gmaillink.click(); //click() method is used to click on particular link
		
		WebElement Signinlink = driver.findElement(By.xpath("//div[@class ='h-c-header__cta']//ul//li[2]//a[@class ='h-c-header__nav-li-link ' and @ga-event-action='sign in']"));
		Signinlink.click();
		
		Set<String> windowhandles = driver.getWindowHandles(); //it gives the number of windows currently opened
		System.out.println(windowhandles.size()); //gives the size
		System.out.println(windowhandles);
		
		Iterator<String> itr = windowhandles.iterator();
		
		String parentwindow = itr.next();
		System.out.println(parentwindow);
		
		String childwindow = itr.next();
		System.out.println(childwindow);
		
		driver.switchTo().window(childwindow);
		driver.findElement(By.id("identifierId")).sendKeys("swathichaganti27@gmail.com");
		driver.findElement(By.xpath("//span[text() ='Next']")).click();
		
		driver.close(); //closes the current browser
		driver.quit(); //closes all the opened browser
		
		
		
		
		
		
		
		
	}

}
