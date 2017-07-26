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

import Page_Objects.My_verizon_hp;
import Page_Objects.Sus_n_reconnect_page;
import Page_Objects.Vzw_Homepage;

public class Suspendnreconnect {
	public static void Execute(WebDriver driver) throws IOException{
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy ");
		Date date = new Date();
		String today= dateFormat.format(date);
		Actions action = new Actions(driver);
		My_verizon_hp.Gnav_myverizon(driver).click();
		action.moveToElement(My_verizon_hp.Gnav_mydevices(driver)).moveToElement(My_verizon_hp.Gnav_sus_n_reconnect(driver)).click().build().perform();
		Sus_n_reconnect_page.Suspend_reconnect_service(driver).click();
		Sus_n_reconnect_page.lost_stolen(driver).click();
		Sus_n_reconnect_page.Keep_billing(driver).click();
		Sus_n_reconnect_page.suspend_sel_line(driver).click();
		System.out.println(Sus_n_reconnect_page.Suspend_reconnect_text(driver).getText());
		Sus_n_reconnect_page.Close_window_suspend(driver).click();
		File suspend = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(suspend, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\suspend.jpg"));
		
		Sus_n_reconnect_page.Suspend_reconnect_service(driver).click();
		Sus_n_reconnect_page.Resume_line(driver).click();
		System.out.println(Sus_n_reconnect_page.Suspend_reconnect_text(driver).getText());
		Sus_n_reconnect_page.Close_window_reconnect(driver).click();
		File reconnect = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(reconnect, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\reconnect.jpg"));
		
		
	}
}
