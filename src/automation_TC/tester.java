package automation_TC;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Page_Objects.Vzw_Homepage;
import appModule.Autopay;
import appModule.Global_navigation;
import appModule.Manage_plan;
import appModule.Signin_action;
import appModule.Suspendnreconnect;

import appModule.mng_intl_services;
import appModule.productsnapp;

public class tester {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		 
	
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			WebDriverWait wait = new WebDriverWait(driver, 30);
			driver.get(Utility.Constants.VZW_homepage);
			
			
			try {
				Global_navigation.Execute(driver, wait);
		
			}catch (ElementNotVisibleException EE){
//				Vzw_Homepage.Shop(driver).sendKeys(Keys.ESCAPE);
				driver.navigate().refresh();
				EE.printStackTrace();
			}
			
	}
}


