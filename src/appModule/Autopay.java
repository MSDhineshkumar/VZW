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
import org.openqa.selenium.support.ui.Select;

import Page_Objects.Autopay_page;
import Page_Objects.My_verizon_hp;
import Utility.Constants;

public class Autopay {
	
	public static void Execute(WebDriver driver) throws IOException{
		
		
		Actions action = new Actions(driver);
		action.moveToElement(My_verizon_hp.Gnav_myverizon(driver)).moveToElement(My_verizon_hp.Gnav_mybilling(driver)).moveToElement(My_verizon_hp.Gnav_Autopay(driver)).click().build().perform();
		disabled(driver);
		
		
		
//		try {
//			autopaydisable=Autopay_page.Disable_autopay(driver).getText().equalsIgnoreCase("Disable");
//			disable(driver);
//		} catch (Exception e) {
//			System.out.println("in catch");
//			nodisable(driver);
//			
//		}
		
		
		
		
		
}
	public static void enabled(WebDriver driver) throws IOException {
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy ");
		Date date = new Date();
		String today= dateFormat.format(date);
		Actions action = new Actions(driver);
		Autopay_page.Disable_autopay(driver).click();
		Autopay_page.confirm_Disable_autopay(driver).click();
		File Autopay_disable = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Autopay_disable, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\Autopay disable.jpg"));
		
		System.out.println(Autopay_page.Autopay_disable_text(driver).getText());
		action.moveToElement(My_verizon_hp.Gnav_mybilling(driver)).moveToElement(My_verizon_hp.Gnav_Autopay(driver)).click().build().perform();
		Autopay_page.CC_radio_btn(driver).click();
		Autopay_page.CC_nickname(driver).sendKeys(Constants.CC_nickname);
		Autopay_page.CC_number(driver).sendKeys(Constants.CC_number);
		Autopay_page.CC_exp_date(driver).sendKeys(Constants.exp_date);
		Autopay_page.CC_Securitycode(driver).sendKeys(Constants.security_code);
		Autopay_page.CC_Zipcode(driver).sendKeys(Constants.zipcode);
		new Select(Autopay_page.payment_day_dropdown(driver)).selectByVisibleText("30");
		Autopay_page.Autopay_Continue(driver).click();
		Autopay_page.Autopay_Confirm_btn(driver).click();
		File Autopay_enable = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Autopay_enable, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\Autopay enable.jpg"));
		
		System.out.println(Autopay_page.Autopay_Confirm_text(driver).getText());		
	}
	
	
	public static void disabled (WebDriver driver) throws IOException {
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy ");
		Date date = new Date();
		String today= dateFormat.format(date);
		Autopay_page.CC_radio_btn(driver).click();
		Autopay_page.CC_nickname(driver).sendKeys(Constants.CC_nickname);
		Autopay_page.CC_number(driver).sendKeys(Constants.CC_number);
		Autopay_page.CC_exp_date(driver).sendKeys(Constants.exp_date);
		Autopay_page.CC_Securitycode(driver).sendKeys(Constants.security_code);
		Autopay_page.CC_Zipcode(driver).sendKeys(Constants.zipcode);
		new Select(Autopay_page.payment_day_dropdown(driver)).selectByIndex(2);
		Autopay_page.Autopay_Continue(driver).click();
		Autopay_page.Autopay_Confirm_btn(driver).click();
		try {
		System.out.println(Autopay_page.Autopay_Confirm_text(driver).getText());
		}
		catch (Exception e){
		System.out.println("in catch");
		System.out.println(Autopay_page.Alert_unabletoautopay(driver).getText());
		File Autopay_error = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Autopay_error, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\Autopay error.jpg"));
		
	}
	}
}