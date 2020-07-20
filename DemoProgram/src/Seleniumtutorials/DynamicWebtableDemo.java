package Seleniumtutorials;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebtableDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://demo.guru99.com/test/web-table-element.php"); //enter URL
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		//method1
        List<WebElement> noofrows = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr"));
		System.out.println(noofrows.size());
		
		//*[@id="leftcontainer"]/table/tbody/tr[1]/td[4]
		//*[@id="leftcontainer"]/table/tbody/tr[2]/td[4]
		
		String firstxpath = "//*[@id=\"leftcontainer\"]/table/tbody/tr[";
		String secondxpath = "]/td[1]";
		
		for (int i=1; i<=noofrows.size(); i++)
		{
			String textofvalues = driver.findElement(By.xpath(firstxpath+i+secondxpath)).getText();
			System.out.println(i + ")" +textofvalues);
		}
        //method2
		
		WebElement bankvalue = driver.findElement(By.xpath("//a[contains(text(),'UCO Bank')]/parent::td//following-sibling::td[3]"));
		String val = bankvalue.getText();
		
		if(!val.isEmpty())
		{
			System.out.println("test pass");;
		}else
		{
			System.out.println("test fail");
		}
		
		
		
		
		
		
		
		
	}

}
