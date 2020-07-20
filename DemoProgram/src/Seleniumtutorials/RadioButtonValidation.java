package Seleniumtutorials;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonValidation {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

			driver.get("https://www.spicejet.com/");
			
			WebElement radiobutton = driver.findElement(By.cssSelector("#ctl00_mainContent_rbtnl_Trip_2"));
			
			System.out.println("Is radiobutton selected .." +radiobutton.isSelected());
			
			radiobutton.click();
			
			System.out.println("Is radiobutton selected .." +radiobutton.isSelected());
			driver.close();
			

	}

}
