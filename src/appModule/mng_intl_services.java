package appModule;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Page_Objects.Autopay_page;
import Page_Objects.My_verizon_hp;
import Page_Objects.Productsnmagapp_page;
import Page_Objects.Vzw_Homepage;
import Page_Objects.manage_plan_page;
import Utility.Constants;

public class mng_intl_services {
	public static void Execute(WebDriver driver,WebDriverWait wait) throws IOException, InterruptedException{
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy ");
		Date date = new Date();
		String today= dateFormat.format(date);
		Actions action = new Actions(driver);
		Vzw_Homepage.signoutCTA(driver).click();
		
		Vzw_Homepage.EnterMDN(driver).sendKeys(Constants.MDNintlplan);
		Vzw_Homepage.MDN2_go(driver).click();
		
		Vzw_Homepage.EnterSQ(driver).sendKeys(Constants.SQ);
		Thread.sleep(1000);
		Vzw_Homepage.SQ_go(driver).click();
		
		Vzw_Homepage.EnterPassword(driver).sendKeys(Constants.Password);
		Thread.sleep(1000);
		Vzw_Homepage.Passowrd_go(driver).click();
		Thread.sleep(1000);
		File MY_VZW_hp = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(MY_VZW_hp, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\intl plan Homepage MY_VZW_hp.jpg"));
		
		System.out.println("Sign in action is successfully completed !!!");
		
	
		
		action.moveToElement(My_verizon_hp.Gnav_myplns_services(driver)).moveToElement(My_verizon_hp.Gnav_mng_intl_services(driver)).click().build().perform();
		
//		wait.until(ExpectedConditions.elementToBeClickable(manage_plan_page.MTN_9495361271(driver)));
//		manage_plan_page.MTN_9495361271(driver).click();
		manage_plan_page.plan_options(driver).click();
		//manage_plan_page.Addaplan(driver).click();
		
		
		
		
		
		
		
		manage_plan_page.insideUS(driver).click();
		new Select(manage_plan_page.newsel_dropdownlist(driver)).selectByIndex(2);
		
		
//		manage_plan_page.learnmore_travelpass(driver).click();
//		new Select(manage_plan_page.newsel_dropdown1(driver)).selectByVisibleText("$5.00-International Calling Value Plan");
//		new Select(manage_plan_page.newsel_dropdown3(driver)).selectByVisibleText("$5.00-International Calling Value Plan");
		manage_plan_page.continue_intl_inside(driver).click();
//		manage_plan_page.Eff_date_nxtbill(driver).click();
		System.out.println(manage_plan_page.Eff_date_continue_btn(driver).getText());
		wait.until(ExpectedConditions.elementToBeClickable(manage_plan_page.Eff_date_continue_btn(driver)));
		manage_plan_page.Eff_date_continue_btn(driver).click();
		manage_plan_page.confirm_btn(driver).isDisplayed();
		File mng_intl = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(mng_intl, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\manageplanmng_intl.jpg"));
		
		System.out.println("Manage international plan_inside US has been successfully completed !!!");
		
//		manage_plan_page.cancel_btn(driver).click();
//		manage_plan_page.cancel_yes_btn(driver).click();
//		action.moveToElement(My_verizon_hp.Gnav_myplns_services(driver)).moveToElement(My_verizon_hp.Gnav_mng_intl_services(driver)).click().build().perform();
//		manage_plan_page.Addaplan(driver).click();
//		manage_plan_page.outsideUS(driver).click();
		
		

}
}