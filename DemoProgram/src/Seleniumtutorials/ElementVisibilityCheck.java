package Seleniumtutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityCheck {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		String appUrl = "https://google.com";
        driver.get(appUrl);
		driver.manage().window().maximize();

		String expectedTitle = "Google";
		String actualTitle = driver.getTitle();

		// compare the expected title of the page with the actual title of the page and print the result
		if (expectedTitle.equals(actualTitle))
		{
			System.out.println("Verification Successful");
		}
		else{
			System.out.println("Verification Failed");
		}
// verify if the “Google Search” button is displayed and print the result
boolean subtbtnPresence=driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[1]/div[3]/center/input[1]")).isDisplayed();
System.out.println("submit Displayed---" + subtbtnPresence);		

boolean subbtnEnabled = driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[1]/div[3]/center/input[1]")).isEnabled();
System.out.println("Submit Enabled---" + subbtnEnabled);		

		WebElement searchTextBox = driver.findElement(By.name("q"));
		searchTextBox.clear();
		searchTextBox.sendKeys("Selenium");
		// close the web browser
		driver.close();
		System.out.println("Test executed successfully.");
		}}
