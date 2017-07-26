package automation_TC;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vzw_hp_validation {
	static WebDriver driver = null;
	public static void main(String[] args) throws IOException {
		driver = appModule.Browser.IE();
			
			driver.get(Utility.Constants.VZW_homepage);
			appModule.VzwHp_validation.Execute(driver);
	}

}
