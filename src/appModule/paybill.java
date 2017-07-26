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
import org.openqa.selenium.support.ui.WebDriverWait;

import Page_Objects.My_verizon_hp;
import Page_Objects.Vzw_Homepage;
import Page_Objects.paybill_page;
import Utility.Constants;

public class paybill {
	public static void Execute(WebDriver driver, WebDriverWait wait) throws IOException, InterruptedException{
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy ");
		Date date = new Date();
		String today= dateFormat.format(date);
	Actions action = new Actions(driver);
	action.moveToElement(My_verizon_hp.Gnav_myverizon(driver)).moveToElement(My_verizon_hp.Gnav_mybilling(driver)).moveToElement(My_verizon_hp.Gnav_paybill(driver)).click().build().perform();
	
	wait.until(ExpectedConditions.elementToBeClickable(My_verizon_hp.Gnav_myverizon(driver)));
	
	paybill_page.otheramount(driver).sendKeys(Constants.Other_amount);
	paybill_page.morepayment_options(driver).click();
	paybill_page.CC_radiobtn(driver).click();
	Thread.sleep(3000);
	paybill_page.CC_number(driver).sendKeys(Constants.CC_number);
	Thread.sleep(3000);
	paybill_page.usethiscard_btn(driver).click();
	paybill_page.exp_date(driver).sendKeys(Constants.exp_date);
	paybill_page.SecurityCode(driver).sendKeys(Constants.security_code);
	paybill_page.ZipCode(driver).sendKeys(Constants.zipcode); 
	paybill_page.continue_btn(driver).click();
	paybill_page.paybill_cnf_btn(driver).isEnabled();
	File pay_bill = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(pay_bill, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\paybill.jpg"));
	
	System.out.println("paybill sucessfully completed !!!");
	
	
}


}

