package BaseLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	
	public static ThreadLocal<WebDriver> tl  = new ThreadLocal<WebDriver>();
	
	public static void initialize() {
		WebDriver driver = new ChromeDriver();
		driver.get("");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().deleteAllCookies();
		tl.set(driver);
		
	}
	
	public static WebDriver getDriver() {
		return tl.get();
	}
}
