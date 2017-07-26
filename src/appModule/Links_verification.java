package appModule;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Page_Objects.My_verizon_hp;
import Page_Objects.Productsnmagapp_page;
import Page_Objects.Vzw_Homepage;

public class Links_verification {
	public static void Execute(WebDriver driver,WebDriverWait wait) throws Exception{
		
	DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy ");
	Date date = new Date();
	String today= dateFormat.format(date);
	System.out.println(today);
	
		
	Actions action = new Actions(driver);
	wait.until(ExpectedConditions.elementToBeClickable(My_verizon_hp.Gnav_mybilling(driver)));
	action.moveToElement(My_verizon_hp.Gnav_mybilling(driver)).moveToElement(My_verizon_hp.Gnav_Viewbill(driver)).click().build().perform();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	File Gnav_Viewbill = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(Gnav_Viewbill, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\mybilling.jpg"));
		
	
	
	wait.until(ExpectedConditions.elementToBeClickable(My_verizon_hp.Gnav_mybilling(driver)));
	action.moveToElement(My_verizon_hp.Gnav_mybilling(driver)).moveToElement(My_verizon_hp.Gnav_Mng_payment_accounts(driver)).click().build().perform();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	File Gnav_Mng_payment_accounts = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(Gnav_Mng_payment_accounts, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\Gnav_Mng_payment_accounts.jpg"));
	
	wait.until(ExpectedConditions.elementToBeClickable(My_verizon_hp.Gnav_mybilling(driver)));
	action.moveToElement(My_verizon_hp.Gnav_mybilling(driver)).moveToElement(My_verizon_hp.Gnav_Doc_receipts(driver)).click().build().perform();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	File Gnav_Doc_receipts = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(Gnav_Doc_receipts, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\Gnav_Doc_receipts.jpg"));
	
	wait.until(ExpectedConditions.elementToBeClickable(My_verizon_hp.Gnav_mybilling(driver)));
	action.moveToElement(My_verizon_hp.Gnav_mybilling(driver)).moveToElement(My_verizon_hp.Gnav_Payment_history(driver)).click().build().perform();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	File Gnav_Payment_history = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(Gnav_Payment_history, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\Gnav_Payment_history.jpg"));
	
	wait.until(ExpectedConditions.elementToBeClickable(My_verizon_hp.Gnav_mybilling(driver)));
	action.moveToElement(My_verizon_hp.Gnav_mybilling(driver)).moveToElement(My_verizon_hp.Gnav_paper_free_billing(driver)).click().build().perform();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	File Gnav_paper_free_billing = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(Gnav_paper_free_billing, new File("D:\\MSD\\Execution\\Automation\\"+today+"Gnav_paper_free_billing.jpg"));
	
	wait.until(ExpectedConditions.elementToBeClickable(My_verizon_hp.Gnav_mybilling(driver)));
	action.moveToElement(My_verizon_hp.Gnav_mybilling(driver)).moveToElement(My_verizon_hp.Gnav_Payment_arrangements(driver)).click().build().perform();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	File Gnav_Payment_arrangements = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(Gnav_Payment_arrangements, new File("D:\\MSD\\Execution\\Automation\\"+today+"Gnav_Payment_arrangements.jpg"));
	
	
	Thread.sleep(10000);
	wait.until(ExpectedConditions.elementToBeClickable(My_verizon_hp.Gnav_mydevices(driver)));
	action.moveToElement(My_verizon_hp.Gnav_mydevices(driver)).moveToElement(My_verizon_hp.Gnav_Device_overview(driver)).click().build().perform();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	File Gnav_Device_overview = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(Gnav_Device_overview, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\Gnav_mydevices\\Gnav_Device_overview.jpg"));
	
	wait.until(ExpectedConditions.elementToBeClickable(My_verizon_hp.Gnav_mydevices(driver)));
	action.moveToElement(My_verizon_hp.Gnav_mydevices(driver)).moveToElement(My_verizon_hp.Gnav_Activate_switch(driver)).click().build().perform();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	File Gnav_Activate_switch = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(Gnav_Activate_switch, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\Gnav_mydevices\\Gnav_Activate_switch.jpg"));
	
	My_verizon_hp.Gnav_myverizon(driver).click();
	wait.until(ExpectedConditions.elementToBeClickable(My_verizon_hp.Gnav_mydevices(driver)));
	action.moveToElement(My_verizon_hp.Gnav_mydevices(driver)).moveToElement(My_verizon_hp.Gnav_Myorders(driver)).click().build().perform();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	File Gnav_Myorders = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(Gnav_Myorders, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\Gnav_mydevices\\Gnav_Myorders.jpg"));
	
	My_verizon_hp.Gnav_myverizon(driver).click();
	wait.until(ExpectedConditions.elementToBeClickable(My_verizon_hp.Gnav_mydevices(driver)));
	action.moveToElement(My_verizon_hp.Gnav_mydevices(driver)).moveToElement(My_verizon_hp.Gnav_mycloud(driver)).click().build().perform();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	File Gnav_mycloud = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(Gnav_mycloud, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\Gnav_mydevices\\Gnav_mycloud.jpg"));
	
//	wait.until(ExpectedConditions.elementToBeClickable(My_verizon_hp.Gnav_mydevices(driver)));
//	action.moveToElement(My_verizon_hp.Gnav_mydevices(driver)).moveToElement(My_verizon_hp.Gnav_upgrade_devices(driver)).click().build().perform();
//	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//	File Gnav_upgrade_devices = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	FileUtils.copyFile(Gnav_upgrade_devices, new File("D:\\MSD\\Execution\\Automation/Gnav_mydevices/Gnav_upgrade_devices.jpg"));
	
	driver.get(Utility.Constants.VZW_homepage);
	My_verizon_hp.Gnav_myverizon(driver).click();
	wait.until(ExpectedConditions.elementToBeClickable(My_verizon_hp.Gnav_mydevices(driver)));
	action.moveToElement(My_verizon_hp.Gnav_mydevices(driver)).moveToElement(My_verizon_hp.Gnav_Changemobilenumber(driver)).click().build().perform();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	File Gnav_Changemobilenumber = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(Gnav_Changemobilenumber, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\Gnav_mydevices\\Gnav_Changemobilenumber.jpg"));
	
	wait.until(ExpectedConditions.elementToBeClickable(My_verizon_hp.Gnav_mydevices(driver)));
	action.moveToElement(My_verizon_hp.Gnav_mydevices(driver)).moveToElement(My_verizon_hp.Gnav_manageconnecteddevices(driver)).click().build().perform();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	File Gnav_manageconnecteddevices = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(Gnav_manageconnecteddevices, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\Gnav_mydevices\\Gnav_manageconnecteddevices.jpg"));
	
//	wait.until(ExpectedConditions.elementToBeClickable(My_verizon_hp.Gnav_mydevices(driver)));
//	action.moveToElement(My_verizon_hp.Gnav_mydevices(driver)).moveToElement(My_verizon_hp.Gnav_Addadevice(driver)).click().build().perform();
//	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//	File Gnav_Addadevice = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	FileUtils.copyFile(Gnav_Addadevice, new File("D:\\MSD\\Execution\\Automation/Gnav_mydevices/Gnav_Addadevice.jpg"));
	
	wait.until(ExpectedConditions.elementToBeClickable(My_verizon_hp.Gnav_mydevices(driver)));
	action.moveToElement(My_verizon_hp.Gnav_mydevices(driver)).moveToElement(My_verizon_hp.Gnav_managevoicemailpassword(driver)).click().build().perform();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	File Gnav_managevoicemailpassword = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(Gnav_managevoicemailpassword, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\Gnav_mydevices\\Gnav_managevoicemailpassword.jpg"));
	
	
	Thread.sleep(5000);
	wait.until(ExpectedConditions.elementToBeClickable(My_verizon_hp.Gnav_myplns_services(driver)));
	action.moveToElement(My_verizon_hp.Gnav_myplns_services(driver)).moveToElement(My_verizon_hp.Gnav_myplan(driver)).click().build().perform();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	File Gnav_myplan = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(Gnav_myplan, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\Gnav_myplns_services\\Gnav_myplan.jpg"));
	
	wait.until(ExpectedConditions.elementToBeClickable(My_verizon_hp.Gnav_myplns_services(driver)));
	action.moveToElement(My_verizon_hp.Gnav_myplns_services(driver)).moveToElement(My_verizon_hp.Gnav_family_safegaurds(driver)).click().build().perform();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	File Gnav_family_safegaurds = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(Gnav_family_safegaurds, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\Gnav_myplns_services\\Gnav_family_safegaurds.jpg"));
	
	wait.until(ExpectedConditions.elementToBeClickable(My_verizon_hp.Gnav_myplns_services(driver)));
	action.moveToElement(My_verizon_hp.Gnav_myplns_services(driver)).moveToElement(My_verizon_hp.Gnav_Blocks(driver)).click().build().perform();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	File Gnav_Blocks = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(Gnav_Blocks, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\Gnav_myplns_services\\Gnav_Blocks.jpg"));
	
	driver.get(Utility.Constants.VZW_homepage);
	My_verizon_hp.Gnav_myverizon(driver).click();
	wait.until(ExpectedConditions.elementToBeClickable(My_verizon_hp.Gnav_myplns_services(driver)));
	action.moveToElement(My_verizon_hp.Gnav_myplns_services(driver)).moveToElement(My_verizon_hp.Gnav_sendamsg(driver)).click().build().perform();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scrFile, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\Gnav_myplns_services\\Gnav_sendamsg.jpg"));
	
	My_verizon_hp.Gnav_myverizon(driver).click();
	My_verizon_hp.Gnav_myverizon(driver).click();
	wait.until(ExpectedConditions.elementToBeClickable(My_verizon_hp.Gnav_myplns_services(driver)));
	action.moveToElement(My_verizon_hp.Gnav_myplns_services(driver)).moveToElement(My_verizon_hp.Gnav_managefamilybase(driver)).click().build().perform();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	File Gnav_managefamilybase = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(Gnav_managefamilybase, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\Gnav_myplns_services\\Gnav_managefamilybase.jpg"));
	
	wait.until(ExpectedConditions.elementToBeClickable(My_verizon_hp.Gnav_myplns_services(driver)));
	action.moveToElement(My_verizon_hp.Gnav_myplns_services(driver)).moveToElement(My_verizon_hp.Gnav_myoffers(driver)).click().build().perform();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	File Gnav_myoffers = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(Gnav_myoffers, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\Gnav_myplns_services\\Gnav_myoffers.jpg"));
	Thread.sleep(5000);
	
	wait.until(ExpectedConditions.elementToBeClickable(My_verizon_hp.Gnav_my_profile(driver)));
	action.moveToElement(My_verizon_hp.Gnav_my_profile(driver)).moveToElement(My_verizon_hp.Gnav_my_profile_settings(driver)).click().build().perform();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	File Gnav_my_profile_settings = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(Gnav_my_profile_settings, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\Gnav_my_profile\\Gnav_my_profile_settings.jpg"));
	
	wait.until(ExpectedConditions.elementToBeClickable(My_verizon_hp.Gnav_my_profile(driver)));
	action.moveToElement(My_verizon_hp.Gnav_my_profile(driver)).moveToElement(My_verizon_hp.Gnav_Accounts_alerts(driver)).click().build().perform();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	File Gnav_Accounts_alerts = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(Gnav_Accounts_alerts, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\Gnav_my_profile\\Gnav_Accounts_alerts.jpg"));
	
	wait.until(ExpectedConditions.elementToBeClickable(My_verizon_hp.Gnav_my_profile(driver)));
	action.moveToElement(My_verizon_hp.Gnav_my_profile(driver)).moveToElement(My_verizon_hp.Gnav_smart_rewards(driver)).click().build().perform();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	File Gnav_smart_rewards = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(Gnav_smart_rewards, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\Gnav_my_profile\\Gnav_smart_rewards.jpg"));
	
	My_verizon_hp.Gnav_myverizon(driver).click();
	wait.until(ExpectedConditions.elementToBeClickable(My_verizon_hp.Gnav_my_profile(driver)));
	action.moveToElement(My_verizon_hp.Gnav_my_profile(driver)).moveToElement(My_verizon_hp.Gnav_manage_billing_address(driver)).click().build().perform();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	File Gnav_manage_billing_address = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(Gnav_manage_billing_address, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\Gnav_my_profile\\Gnav_manage_billing_address.jpg"));
	
	wait.until(ExpectedConditions.elementToBeClickable(My_verizon_hp.Gnav_my_profile(driver)));
	action.moveToElement(My_verizon_hp.Gnav_my_profile(driver)).moveToElement(My_verizon_hp.Gnav_Assign_acc_managers(driver)).click().build().perform();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	File Gnav_Assign_acc_managers = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(Gnav_Assign_acc_managers, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\Gnav_my_profile\\Gnav_Assign_acc_managers.jpg"));
	
	wait.until(ExpectedConditions.elementToBeClickable(My_verizon_hp.Gnav_my_profile(driver)));
	action.moveToElement(My_verizon_hp.Gnav_my_profile(driver)).moveToElement(My_verizon_hp.Gnav_privacy_settings(driver)).click().build().perform();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	File Gnav_privacy_settings = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(Gnav_privacy_settings, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\Gnav_my_profile\\Gnav_privacy_settings.jpg"));
	
	wait.until(ExpectedConditions.elementToBeClickable(My_verizon_hp.Gnav_my_profile(driver)));
	action.moveToElement(My_verizon_hp.Gnav_my_profile(driver)).moveToElement(My_verizon_hp.Gnav_vz_selects(driver)).click().build().perform();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	File Gnav_vz_selects = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(Gnav_vz_selects, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\Gnav_my_profile\\Gnav_vz_selects.jpg"));
	
	wait.until(ExpectedConditions.elementToBeClickable(My_verizon_hp.Gnav_my_profile(driver)));
	action.moveToElement(My_verizon_hp.Gnav_my_profile(driver)).moveToElement(My_verizon_hp.Gnav_manage_family_friends(driver)).click().build().perform();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	File Gnav_manage_family_friends = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(Gnav_manage_family_friends, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\Gnav_my_profile\\Gnav_manage_family_friends.jpg"));
	
	wait.until(ExpectedConditions.elementToBeClickable(My_verizon_hp.Gnav_my_profile(driver)));
	action.moveToElement(My_verizon_hp.Gnav_my_profile(driver)).moveToElement(My_verizon_hp.Gnav_my_referral_rewards(driver)).click().build().perform();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	File Gnav_my_referral_rewards = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(Gnav_my_referral_rewards, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\Gnav_my_profile\\Gnav_my_referral_rewards.jpg"));
	
	

	Thread.sleep(5000);
	wait.until(ExpectedConditions.elementToBeClickable(My_verizon_hp.Gnav_My_usage(driver)));
	action.moveToElement(My_verizon_hp.Gnav_My_usage(driver)).moveToElement(My_verizon_hp.Gnav_Manage_usage(driver)).click().build().perform();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	File Gnav_Manage_usage = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(Gnav_Manage_usage, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\Gnav_My_usage\\Gnav_Manage_usage.jpg"));
	
	wait.until(ExpectedConditions.elementToBeClickable(My_verizon_hp.Gnav_My_usage(driver)));
	action.moveToElement(My_verizon_hp.Gnav_My_usage(driver)).moveToElement(My_verizon_hp.Gnav_mng_usage_alerts(driver)).click().build().perform();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	File Gnav_mng_usage_alerts = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(Gnav_mng_usage_alerts, new File("D:\\MSD\\Execution\\Automation"+today+"\\Gnav_My_usage\\Gnav_mng_usage_alerts.jpg"));
	 
	System.out.println("Global naviagtion links verificaton is successfully completed !!! ");
	
	
	
	}
	
}