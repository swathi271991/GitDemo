package Seleniumtutorials;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTableHandling {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
		
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		
		//No.of Columns
        List<WebElement>  col = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/thead/tr/th"));
        System.out.println("No of cols are : " +col.size()); 
        
        //No.of rows 
        List<WebElement>  rows = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]")); 
        System.out.println("No of rows are : " + rows.size());
        
        //complete row values
        String rowvalue = driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[3]")).getText();
        System.out.println(rowvalue);
        
        //Cell value of 3rd row and 3rd column
        String cellvalue = driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[3]/td[3]")).getText();
        System.out.println(cellvalue);
        
        driver.close();
		

	}

}
