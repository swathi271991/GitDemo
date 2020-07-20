package Seleniumtutorials;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://www.softwaretestinghelp.com/");
		 
		//Finding all iframe tags on a web page
		List<WebElement> elements = driver.findElements(By.tagName("iframe"));
		int numberOfTags = elements.size();
		System.out.println("No. of Iframes on this Web Page are: " +numberOfTags);
		 
		// Switch to the frame using the frame id
		System.out.println("Switching to the frame");
		driver.switchTo().frame("aswift_0");
		 
		// Print the frame source code
		System.out.println("Frame Source" +driver.getPageSource());
		 
		// Switch back to main web page
		driver.switchTo().defaultContent();
		System.out.println("Switching to the main web page");
		 
		driver.quit();
		}
		}
	
