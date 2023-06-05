package wsm.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ConfigDriver {
	public static WebDriver buildSetupDriverFireFox() {
		String PATH_GECKO = "D:\\eclipse-workspace\\Practices\\src\\lib\\geckodriver.exe";
		String PATCH_CHROME = "D:\\eclipse-workspace\\Practices\\src\\lib\\chromedriver.exe";
		System.setProperty("webdriver.gecko.driver", PATH_GECKO);
		return (WebDriver) new FirefoxDriver();
		
	}
	
	public static WebDriver buildSetupDriverChrome() {
		String PATCH_CHROME = "D:\\eclipse-workspace\\Practices\\src\\lib\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", PATCH_CHROME);
		return (WebDriver) new ChromeDriver();
		
	}
	
}