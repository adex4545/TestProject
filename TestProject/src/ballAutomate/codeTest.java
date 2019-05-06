package ballAutomate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class codeTest {

	public static void main(String[] args) {
		
		
		 System.setProperty("webdriver.gecko.driver","C:\\Program Files\\Drivers\\geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();
		 driver.get("http://www.google.com/");
	}

}
