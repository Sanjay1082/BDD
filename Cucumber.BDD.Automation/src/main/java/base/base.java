package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class base {
	
	public static WebDriver driver;
	
	public static WebDriver initiationOfDriver() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Global\\eclipse-workspace\\Cucumber.BDD.Automation\\src\\main\\java\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://freecrm.com/");
		driver.manage().window().maximize();
		return driver;
	}
	
	public void explicitWait(WebElement element) {
    	WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(	ExpectedConditions.visibilityOf(element));
	}

}
