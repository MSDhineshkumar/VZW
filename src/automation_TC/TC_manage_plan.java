package automation_TC;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import appModule.Manage_plan;
import appModule.Signin_action;


public class TC_manage_plan {

	
	public static void main(String[] args) throws InterruptedException, IOException {
//		WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\MSD\\Execution\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		driver.get(Utility.Constants.VZW_homepage);
		Signin_action.Execute(driver);
		Manage_plan.Execute(driver, wait);

	}

}
