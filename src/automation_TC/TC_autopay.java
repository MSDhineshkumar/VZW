package automation_TC;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import appModule.Autopay;
import appModule.Signin_action;

public class TC_autopay {

	
	public static void main(String[] args) throws InterruptedException, IOException {
		
			
		System.setProperty("webdriver.chrome.driver", "C:\\MSD\\Execution\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			WebDriverWait wait = new WebDriverWait(driver, 30);
			driver.get(Utility.Constants.VZW_homepage);
			Signin_action.Execute(driver);
			Autopay.Execute(driver);
	}


	}


