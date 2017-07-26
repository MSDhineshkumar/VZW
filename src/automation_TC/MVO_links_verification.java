package automation_TC;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import appModule.Autopay;
import appModule.Links_verification;
import appModule.Signin_action;

public class MVO_links_verification {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		driver.get(Utility.Constants.VZW_homepage);
		Signin_action.Execute(driver);
		Links_verification.Execute(driver, wait);
	}

}
