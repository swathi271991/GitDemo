package Seleniumtutorials;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectivDropdowns {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://ksrtc.in/oprs-web/");

		WebElement fromfield =  driver.findElement(By.id("fromPlaceName"));
		fromfield.sendKeys("BENG");
		fromfield.sendKeys(Keys.DOWN);
		fromfield.sendKeys(Keys.DOWN);
		
		String actualtxt = fromfield.getText();
		System.out.println(actualtxt);
		
	}

}
