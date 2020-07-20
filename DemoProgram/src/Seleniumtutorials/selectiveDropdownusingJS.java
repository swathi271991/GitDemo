package Seleniumtutorials;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selectiveDropdownusingJS {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://ksrtc.in/oprs-web/");

		WebElement fromfield =  driver.findElement(By.id("fromPlaceName"));
		fromfield.sendKeys("BENG");
		
		Thread.sleep(2000);
		fromfield.sendKeys(Keys.DOWN);
		
		//its doesnt print the value of particular webelement bcz its hidden from DOM
		System.out.println(driver.findElement(By.id("fromPlaceName")).getText());

		//using JS we can handle hidden elements
		JavascriptExecutor js  = (JavascriptExecutor)driver ;
		String script = "return document.getElementById(\"fromPlaceName\").value;" ;

		String text = (String) js.executeScript(script);
		System.out.println(text);


	}

}
