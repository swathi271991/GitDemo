package Seleniumtutorials;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
		driver.get("https://www.amazon.com/");
		
		WebElement expand = driver.findElement(By.xpath("//*[@id='nav-link-accountList']/span[1]/span"));
		
		Actions builder = new Actions(driver);
		builder.moveToElement(expand).build().perform();
		
		System.out.println("sucessfully mousehoverd");

	}

}
