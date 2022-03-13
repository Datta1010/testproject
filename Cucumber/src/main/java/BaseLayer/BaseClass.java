package BaseLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
public static void  intistizion() {
	System.setProperty("webdriver.chrome.driver",
			System.getProperty("user.dir") + "//AllBrowserDrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
}
	
	
	
	

}
