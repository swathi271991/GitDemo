package Seleniumtutorials;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleCalendar2 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
		
		driver.get("https://www.path2usa.com/travel-companions");
		
		WebElement datepicker = driver.findElement(By.id("travel_date"));
		WebDriverWait wait2 = new WebDriverWait(driver, 20);
		wait2.until(ExpectedConditions.elementToBeClickable(By.id("travel_date")));
		
		datepicker.click();
		
while(!driver.findElement(By.cssSelector("[class ='datepicker-days'] [class ='datepicker-switch']")).getText().contains("May"))
		{
			driver.findElement(By.cssSelector("th.next")).click();
		}
		
		List<WebElement> days = driver.findElements(By.cssSelector(".day"));
		int no_of_days = days.size();
		System.out.println(no_of_days);
		
		for (int i = 0; i<no_of_days; i++)
		{
			String datetext = days.get(i).getText();
			if(datetext.equalsIgnoreCase("9"))
			{
				days.get(i).click();
				System.out.println("Date has been selected");
				break;
			}
		}
		driver.close();
		
	}

}
