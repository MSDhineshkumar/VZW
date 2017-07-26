package automation_TC;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import Page_Objects.Vzw_Homepage;
import appModule.My_vz_hp;
import appModule.Signin_action;
import appModule.Suspendnreconnect;

public class TC_VZW_homepage {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		driver.get(Utility.Constants.VZW_homepage);
		Signin_action.Execute(driver);
		My_vz_hp.Smart_rewards_Execute(driver);

	}

}
