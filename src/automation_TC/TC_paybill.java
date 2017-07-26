package automation_TC;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import appModule.Browser;
import appModule.Signin_action;
import appModule.Suspendnreconnect;
import appModule.paybill;


public class TC_paybill {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws IOException, InterruptedException {
//		WebDriver driver = null;
//		Browser.Firefox();
//			WebDriver driver = new FirefoxDriver();
			System.setProperty("webdriver.chrome.driver", "C:\\MSD\\Execution\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			WebDriverWait wait = new WebDriverWait(driver, 30);
			driver.get(Utility.Constants.VZW_homepage);
			Signin_action.Execute(driver);
			paybill.Execute(driver, wait);
	}

}
