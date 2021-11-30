package Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class base {
	
	public static WebDriver driver;
	
	public static WebDriver InitiateDriver()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Global\\eclipse-workspace\\FreeCrmBDDAutomationFramework\\src\\main\\java\\Resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(3000, TimeUnit.MILLISECONDS);
		driver.get("https://freecrm.com/");
		return driver;
	}
	
	public void explicitWait(WebElement ele)
	{
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	

}
