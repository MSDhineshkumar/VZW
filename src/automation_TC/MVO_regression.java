package automation_TC;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import appModule.Autopay;
import appModule.Manage_plan;
import appModule.Signin_action;
import appModule.Suspendnreconnect;
import appModule.mng_intl_services;
import appModule.paybill;
import appModule.productsnapp;

public class MVO_regression {

	public static WebDriver driver = null;
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\MSD\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		driver.get(Utility.Constants.VZW_homepage);

		try {
			Signin_action.Execute(driver);
		} catch (Exception e) {
			
			System.out.println("Error: Unable to Sign in.....");
		}
		
		try {
			paybill.Execute(driver, wait);
		} catch (Exception e) {
			System.out.println("Error: Issue in paybill...");
		}
		try {
			Autopay.Execute(driver);
		} catch (Exception e) {
			System.out.println("Error: Issue in Autopay...");
		}
		
		try {
			Suspendnreconnect.Execute(driver);
		} catch (Exception e) {
			System.out.println("Error: Issue in Suspend/reconnect...");
		}
		
//		new WebDriverWait(driver, 30);	
//		productsnapp.Execute(driver, wait);
		
		
	
//		Manage_plan.Execute(driver, wait);
		try {
			Manage_plan.Execute(driver, wait);
		} catch (Exception e) {
			System.out.println("Error: Issue in Manage plan...");
		}
		
		try {
			new WebDriverWait(driver, 30);	
			productsnapp.Execute(driver, wait);
		} catch (Exception e) {
			System.out.println("Error: Issue in manage products and apps/Might be in future transanction...");
		}
		
		
		try {
			new WebDriverWait(driver, 30);	
			mng_intl_services.Execute(driver, wait);
		} catch (Exception e) {
			System.out.println("Error: Issue in Manage international plan...");
		}
		System.out.println("done");
		
//		driver.close();

	}

}
