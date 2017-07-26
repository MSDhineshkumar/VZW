package appModule;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Browser {

	
	public static  WebDriver Firefox () throws InterruptedException, IOException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	

		driver.get(Utility.Constants.VZW_homepage);
		return driver;
	}
	
	public static WebDriver  Chrome () {
		System.setProperty("webdriver.chrome.driver", "D:\\MSD\\Selenium\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get(Utility.Constants.VZW_homepage);
		return driver;
	}
	public static WebDriver  IE () {
	
		System.setProperty("webdriver.ie.driver", "D:\\MSD\\Selenium\\Driver\\IEDriverServer.exe");
		
		WebDriver driver = new InternetExplorerDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get(Utility.Constants.VZW_homepage);
		return driver;
	}
}
