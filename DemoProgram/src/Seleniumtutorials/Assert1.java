package Seleniumtutorials;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assert1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		System.out.println("Hi Hello good Morning");
		System.out.println("How r u");
		
		System.out.println("Hi Hello good Morning1");
		System.out.println("How r u1");
		
		System.out.println("Hi Hello good Morning2");
		System.out.println("How r u3");
		
		System.out.println("Hi Hello good Morning3");
		System.out.println("How r u2");
		
		

	}

}
