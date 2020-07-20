package Seleniumtutorials;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxHandling {

	public static void main(String[] args) {
	
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://www.spicejet.com/");
		
		WebElement checkbox1 = driver.findElement(By.cssSelector("#ctl00_mainContent_chk_StudentDiscount"));
	    System.out.println("Is checkbox selected .." +checkbox1.isSelected());
		
		checkbox1.click();
		
		System.out.println("Is checkbox selected .." +checkbox1.isSelected());
		driver.close();
		
	}

}
