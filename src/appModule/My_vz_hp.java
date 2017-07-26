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

import Page_Objects.My_verizon_hp;

public class My_vz_hp {

	public static void Smart_rewards_Execute(WebDriver driver) throws IOException{
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy ");
		Date date = new Date();
		String today= dateFormat.format(date);
	
		My_verizon_hp.Redeem_rewards(driver).click();
		File smart_rewards = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(smart_rewards, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\smart_rewards.jpg"));
		
	
	
}
}