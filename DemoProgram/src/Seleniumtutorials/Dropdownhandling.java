package Seleniumtutorials;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dropdownhandling {

	public static void main(String[] args) {


System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

driver.get("https://www.spicejet.com/");
		
new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("div#divpaxinfo"))).click();

Select selectAdult = new Select(new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div#divpaxOptions div.passengers-wrap2 p>select[name$='_Adult']"))));
selectAdult.selectByVisibleText("5");

Select selectChild = new Select(new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div#divpaxOptions div.passengers-wrap2 p>select[name$='_Child']"))));
selectChild.selectByValue("3");

Select selectInfant = new Select(new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div#divpaxOptions div.passengers-wrap2 p>select[name$='_Infant']"))));
selectInfant.selectByIndex(1);
        
System.out.println("Dropdown is selected");
driver.quit();

	}

}
