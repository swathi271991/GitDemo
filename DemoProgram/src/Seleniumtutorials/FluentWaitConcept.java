package Seleniumtutorials;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.xpath("//div[@id ='start']/button")).click();

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);

		WebElement element  = wait.until(new Function<WebDriver, WebElement>()
		{
        	public WebElement apply(WebDriver driver)
			{
				if(driver.findElement(By.xpath("//div[@id ='finish']/h4")).isDisplayed())
				{
					return driver.findElement(By.xpath("//div[@id ='finish']/h4"));
				}
				else
				{
					return null;
				}

			}
		});
		System.out.println(driver.findElement(By.xpath("//div[@id ='finish']/h4")).getText());
		System.out.println("fluent wait implemented successfully");

	}

}
