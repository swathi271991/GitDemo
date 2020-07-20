package Seleniumtutorials;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class staticWebtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.siteforinfotech.com/handling-static-dynamic-tables-selenium-webdriver/");
		
		//coloum name
		for(int ColNumber=1; ColNumber<=4; ColNumber++)
		{
		System.out.println(driver.findElement(By.xpath("//*/table[1]/thead/tr/th["+ColNumber+"]")).getText());
		}
		System.out.println("********************************************************");

		//get all values in table
		for(int RowNumber=1; RowNumber<=4; RowNumber++)
		for(int ColNumber=1; ColNumber<=4; ColNumber++)
		{
		System.out.println(driver.findElement(By.xpath("//*/table[1]/tbody/tr["+RowNumber+"]/td["+ColNumber+"]")).getText());
		}
	}
}
		