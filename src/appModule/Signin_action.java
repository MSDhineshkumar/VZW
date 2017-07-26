package appModule;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import Page_Objects.Vzw_Homepage;
import Utility.Constants;

public class Signin_action {

	public static void Execute(WebDriver driver) throws InterruptedException, IOException{
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy ");
		Date date = new Date();
		String today= dateFormat.format(date);
		Thread.sleep(3000);
		System.out.println(today);
		File VZW_hp = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(VZW_hp, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\vzw hp.jpg"));
		
		Vzw_Homepage.EnterMDN(driver).sendKeys(Constants.MDN);
		Vzw_Homepage.MDN_go(driver).click();
		
		Vzw_Homepage.EnterSQ(driver).sendKeys(Constants.SQ);
		Thread.sleep(1000);
		Vzw_Homepage.SQ_go(driver).click();
		
		Vzw_Homepage.EnterPassword(driver).sendKeys(Constants.Password);
		Thread.sleep(1000);
		Vzw_Homepage.Passowrd_go(driver).click();
		Thread.sleep(1000);
		File MY_VZW_hp = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(MY_VZW_hp, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\MY_VZW_hp.jpg"));
		
		System.out.println("Sign in action is successfully completed !!!");

	
	
	}
	}
	

