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
import Page_Objects.Vzw_Homepage;

public class Global_navigation {
	public static void Execute(WebDriver driver,WebDriverWait wait) throws Exception{
		
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy ");
		Date date = new Date();
		String today= dateFormat.format(date);
		System.out.println(today);
		
			
		Actions action = new Actions(driver);
		wait.until(ExpectedConditions.elementToBeClickable(Vzw_Homepage.Shop(driver)));
		action.moveToElement(Vzw_Homepage.Shop(driver)).moveToElement(Vzw_Homepage.Phones_Devices(driver)).moveToElement(Vzw_Homepage.Smartphones(driver)).click().build().perform();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		File Smartphones = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Smartphones, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\gnav\\Smartphones.jpg"));
			
		
		wait.until(ExpectedConditions.elementToBeClickable(Vzw_Homepage.Shop(driver)));
		action.moveToElement(Vzw_Homepage.Shop(driver)).moveToElement(Vzw_Homepage.Phones_Devices(driver)).moveToElement(Vzw_Homepage.Basicphones(driver)).click().build().perform();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		File Basicphones = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Basicphones, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\gnav\\Basicphones.jpg"));
		
		wait.until(ExpectedConditions.elementToBeClickable(Vzw_Homepage.Shop(driver)));
		action.moveToElement(Vzw_Homepage.Shop(driver)).moveToElement(Vzw_Homepage.Phones_Devices(driver)).moveToElement(Vzw_Homepage.Tablets(driver)).click().build().perform();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		File Tablets = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Tablets, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\gnav\\Tablets.jpg"));
		
		wait.until(ExpectedConditions.elementToBeClickable(Vzw_Homepage.Shop(driver)));
		action.moveToElement(Vzw_Homepage.Shop(driver)).moveToElement(Vzw_Homepage.Phones_Devices(driver)).moveToElement(Vzw_Homepage.Prepaiddevices(driver)).click().build().perform();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		File Prepaiddevices = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Prepaiddevices, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\gnav\\Prepaiddevices.jpg"));
		
		
		wait.until(ExpectedConditions.elementToBeClickable(Vzw_Homepage.Shop(driver)));
		action.moveToElement(Vzw_Homepage.Shop(driver)).moveToElement(Vzw_Homepage.Phones_Devices(driver)).moveToElement(Vzw_Homepage.Mobile_hotspots(driver)).click().build().perform();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		File Mobile_hotspots = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Mobile_hotspots, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\gnav\\Mobile_hotspots.jpg"));
		
		wait.until(ExpectedConditions.elementToBeClickable(Vzw_Homepage.Shop(driver)));
		action.moveToElement(Vzw_Homepage.Shop(driver)).moveToElement(Vzw_Homepage.Phones_Devices(driver)).moveToElement(Vzw_Homepage.HomenOffice_solutions(driver)).click().build().perform();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		File HomenOffice_solutions = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(HomenOffice_solutions, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\gnav\\HomenOffice_solutions.jpg"));
		
		wait.until(ExpectedConditions.elementToBeClickable(Vzw_Homepage.Shop(driver)));
		action.moveToElement(Vzw_Homepage.Shop(driver)).moveToElement(Vzw_Homepage.Phones_Devices(driver)).moveToElement(Vzw_Homepage.Wearable_Tech(driver)).click().build().perform();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		File Wearable_Tech = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Wearable_Tech, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\gnav\\Wearable_Tech.jpg"));
		
		wait.until(ExpectedConditions.elementToBeClickable(Vzw_Homepage.Shop(driver)));
		action.moveToElement(Vzw_Homepage.Shop(driver)).moveToElement(Vzw_Homepage.Phones_Devices(driver)).moveToElement(Vzw_Homepage.BYOD(driver)).click().build().perform();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		File BYOD = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(BYOD, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\gnav\\BYOD.jpg"));
		
		wait.until(ExpectedConditions.elementToBeClickable(Vzw_Homepage.Shop(driver)));
		action.moveToElement(Vzw_Homepage.Shop(driver)).moveToElement(Vzw_Homepage.Phones_Devices(driver)).moveToElement(Vzw_Homepage.iPhone7(driver)).click().build().perform();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		File iPhone7 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(iPhone7, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\gnav\\iPhone7.jpg"));
		
		wait.until(ExpectedConditions.elementToBeClickable(Vzw_Homepage.Shop(driver)));
		action.moveToElement(Vzw_Homepage.Shop(driver)).moveToElement(Vzw_Homepage.Phones_Devices(driver)).moveToElement(Vzw_Homepage.iPhone7plus(driver)).click().build().perform();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		File iPhone7plus = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(iPhone7plus, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\gnav\\iPhone7plus.jpg"));
		
		
		wait.until(ExpectedConditions.elementToBeClickable(Vzw_Homepage.Shop(driver)));
		action.moveToElement(Vzw_Homepage.Shop(driver)).moveToElement(Vzw_Homepage.Hum(driver)).moveToElement(Vzw_Homepage.What_is_Hum(driver)).click().build().perform();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		File What_is_Hum = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(What_is_Hum, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\gnav\\What_is_Hum.jpg"));
		
		
		driver.get(Utility.Constants.VZW_homepage);
		wait.until(ExpectedConditions.elementToBeClickable(Vzw_Homepage.Shop(driver)));
		action.moveToElement(Vzw_Homepage.Shop(driver)).moveToElement(Vzw_Homepage.Hum(driver)).moveToElement(Vzw_Homepage.Shop_Hum(driver)).click().build().perform();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		File Shop_Hum = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Shop_Hum, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\gnav\\Shop_Hum.jpg"));
		
		wait.until(ExpectedConditions.elementToBeClickable(Vzw_Homepage.Shop(driver)));
		action.moveToElement(Vzw_Homepage.Shop(driver)).moveToElement(Vzw_Homepage.Plans_Services(driver)).moveToElement(Vzw_Homepage.New_vz_plan(driver)).click().build().perform();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		File New_vz_plan = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(New_vz_plan, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\gnav\\New_vz_plan.jpg"));
		
		wait.until(ExpectedConditions.elementToBeClickable(Vzw_Homepage.Shop(driver)));
		try {
			action.moveToElement(Vzw_Homepage.Shop(driver)).moveToElement(Vzw_Homepage.Plans_Services(driver)).moveToElement(Vzw_Homepage.prepaidplans(driver)).click().build().perform();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		File prepaidplans = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(prepaidplans, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\gnav\\prepaidplans.jpg"));
		
		wait.until(ExpectedConditions.elementToBeClickable(Vzw_Homepage.Shop(driver)));
		action.moveToElement(Vzw_Homepage.Shop(driver)).moveToElement(Vzw_Homepage.Plans_Services(driver)).moveToElement(Vzw_Homepage.intlservices(driver)).click().build().perform();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		File intlservices = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(intlservices, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\gnav\\intlservices.jpg"));
		
		wait.until(ExpectedConditions.elementToBeClickable(Vzw_Homepage.Shop(driver)));
		action.moveToElement(Vzw_Homepage.Shop(driver)).moveToElement(Vzw_Homepage.Plans_Services(driver)).moveToElement(Vzw_Homepage.Dataonly(driver)).click().build().perform();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		File Dataonly = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Dataonly, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\gnav\\Dataonly.jpg"));
		
		wait.until(ExpectedConditions.elementToBeClickable(Vzw_Homepage.Shop(driver)));
		action.moveToElement(Vzw_Homepage.Shop(driver)).moveToElement(Vzw_Homepage.Plans_Services(driver)).moveToElement(Vzw_Homepage.Exclusive_apps(driver)).click().build().perform();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		File Exclusive_apps = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Exclusive_apps, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\gnav\\Exclusive_apps.jpg"));
		
		wait.until(ExpectedConditions.elementToBeClickable(Vzw_Homepage.Shop(driver)));
		action.moveToElement(Vzw_Homepage.Shop(driver)).moveToElement(Vzw_Homepage.Plans_Services(driver)).moveToElement(Vzw_Homepage.Content_transfer(driver)).click().build().perform();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		File Content_transfer = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Content_transfer, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\gnav\\Content_transfer.jpg"));
		
		wait.until(ExpectedConditions.elementToBeClickable(Vzw_Homepage.Shop(driver)));
		action.moveToElement(Vzw_Homepage.Shop(driver)).moveToElement(Vzw_Homepage.Plans_Services(driver)).moveToElement(Vzw_Homepage.Total_mobile_protection(driver)).click().build().perform();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		File Total_mobile_protection = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Total_mobile_protection, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\gnav\\Total_mobile_protection.jpg"));
		
		
		wait.until(ExpectedConditions.elementToBeClickable(Vzw_Homepage.Shop(driver)));
		action.moveToElement(Vzw_Homepage.Shop(driver)).moveToElement(Vzw_Homepage.Accessories(driver)).moveToElement(Vzw_Homepage.Casesnprotection(driver)).click().build().perform();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		File Casesnprotection = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Casesnprotection, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\gnav\\Casesnprotection.jpg"));
		
		wait.until(ExpectedConditions.elementToBeClickable(Vzw_Homepage.Shop(driver)));
		action.moveToElement(Vzw_Homepage.Shop(driver)).moveToElement(Vzw_Homepage.Accessories(driver)).moveToElement(Vzw_Homepage.Batterieschargers(driver)).click().build().perform();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		File Batterieschargers = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Batterieschargers, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\gnav\\Batterieschargers.jpg"));
		
		wait.until(ExpectedConditions.elementToBeClickable(Vzw_Homepage.Shop(driver)));
		action.moveToElement(Vzw_Homepage.Shop(driver)).moveToElement(Vzw_Homepage.Accessories(driver)).moveToElement(Vzw_Homepage.Audio(driver)).click().build().perform();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		File Audio = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Audio, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\gnav\\Audio.jpg"));
		
		wait.until(ExpectedConditions.elementToBeClickable(Vzw_Homepage.Shop(driver)));
		action.moveToElement(Vzw_Homepage.Shop(driver)).moveToElement(Vzw_Homepage.Accessories(driver)).moveToElement(Vzw_Homepage.Cartravel(driver)).click().build().perform();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		File Cartravel = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Cartravel, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\gnav\\Cartravel.jpg"));
		
		wait.until(ExpectedConditions.elementToBeClickable(Vzw_Homepage.Shop(driver)));
		action.moveToElement(Vzw_Homepage.Shop(driver)).moveToElement(Vzw_Homepage.Accessories(driver)).moveToElement(Vzw_Homepage.Smarthome(driver)).click().build().perform();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		File Smarthome = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Smarthome, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\gnav\\Smarthome.jpg"));
		
		wait.until(ExpectedConditions.elementToBeClickable(Vzw_Homepage.Shop(driver)));
		action.moveToElement(Vzw_Homepage.Shop(driver)).moveToElement(Vzw_Homepage.Accessories(driver)).moveToElement(Vzw_Homepage.Smartwatches(driver)).click().build().perform();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		File Smartwatches = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Smartwatches, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\gnav\\Smartwatches.jpg"));
		
		wait.until(ExpectedConditions.elementToBeClickable(Vzw_Homepage.Shop(driver)));
		action.moveToElement(Vzw_Homepage.Shop(driver)).moveToElement(Vzw_Homepage.Accessories(driver)).moveToElement(Vzw_Homepage.Sportnfitness(driver)).click().build().perform();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		File Sportnfitness = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Sportnfitness, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\gnav\\Sportnfitness.jpg"));
		
		wait.until(ExpectedConditions.elementToBeClickable(Vzw_Homepage.Shop(driver)));
		action.moveToElement(Vzw_Homepage.Shop(driver)).moveToElement(Vzw_Homepage.Accessories(driver)).moveToElement(Vzw_Homepage.Photography(driver)).click().build().perform();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		File Photography = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Photography, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\gnav\\Photography.jpg"));
		
		wait.until(ExpectedConditions.elementToBeClickable(Vzw_Homepage.Shop(driver)));
		action.moveToElement(Vzw_Homepage.Shop(driver)).moveToElement(Vzw_Homepage.Accessories(driver)).moveToElement(Vzw_Homepage.Gamesntoys(driver)).click().build().perform();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		File Gamesntoys = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Gamesntoys, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\gnav\\Gamesntoys.jpg"));
		
		wait.until(ExpectedConditions.elementToBeClickable(Vzw_Homepage.Shop(driver)));
		action.moveToElement(Vzw_Homepage.Shop(driver)).moveToElement(Vzw_Homepage.Accessories(driver)).moveToElement(Vzw_Homepage.Everyday_essentials(driver)).click().build().perform();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		File Everyday_essentials = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Everyday_essentials, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\gnav\\Everyday_essentials.jpg"));
		
		wait.until(ExpectedConditions.elementToBeClickable(Vzw_Homepage.Shop(driver)));
		action.moveToElement(Vzw_Homepage.Shop(driver)).moveToElement(Vzw_Homepage.Accessories(driver)).moveToElement(Vzw_Homepage.Signal_bosters(driver)).click().build().perform();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		File Signal_bosters = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Signal_bosters, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\gnav\\Signal_bosters.jpg"));
		
		wait.until(ExpectedConditions.elementToBeClickable(Vzw_Homepage.Shop(driver)));
		action.moveToElement(Vzw_Homepage.Shop(driver)).moveToElement(Vzw_Homepage.Accessories(driver)).moveToElement(Vzw_Homepage.Giftcards(driver)).click().build().perform();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		File Giftcards = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Giftcards, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\gnav\\Giftcards.jpg"));
		
		wait.until(ExpectedConditions.elementToBeClickable(Vzw_Homepage.Shop(driver)));
		action.moveToElement(Vzw_Homepage.Shop(driver)).moveToElement(Vzw_Homepage.Deals(driver)).moveToElement(Vzw_Homepage.Shopdeals(driver)).click().build().perform();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		File Shopdeals = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Shopdeals, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\gnav\\Shopdeals.jpg"));
		
		wait.until(ExpectedConditions.elementToBeClickable(Vzw_Homepage.Shop(driver)));
		action.moveToElement(Vzw_Homepage.Shop(driver)).moveToElement(Vzw_Homepage.Deals(driver)).moveToElement(Vzw_Homepage.Receive1gb(driver)).click().build().perform();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		File Receive1gb = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Receive1gb, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\gnav\\Receive1gb.jpg"));
		
		driver.get(Utility.Constants.VZW_homepage);
		wait.until(ExpectedConditions.elementToBeClickable(Vzw_Homepage.Shop(driver)));
		action.moveToElement(Vzw_Homepage.Shop(driver)).moveToElement(Vzw_Homepage.Deals(driver)).moveToElement(Vzw_Homepage.Stuck(driver)).click().build().perform();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		File Stuck = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Stuck, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\gnav\\Stuck.jpg"));
		
		wait.until(ExpectedConditions.elementToBeClickable(Vzw_Homepage.Shop(driver)));
		action.moveToElement(Vzw_Homepage.Shop(driver)).moveToElement(Vzw_Homepage.Deals(driver)).moveToElement(Vzw_Homepage.Certifiedpreowned(driver)).click().build().perform();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		File Certifiedpreowned = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Certifiedpreowned, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\gnav\\Certifiedpreowned.jpg"));
		
		wait.until(ExpectedConditions.elementToBeClickable(Vzw_Homepage.Shop(driver)));
		action.moveToElement(Vzw_Homepage.Shop(driver)).moveToElement(Vzw_Homepage.Deals(driver)).moveToElement(Vzw_Homepage.Emp_discounts(driver)).click().build().perform();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		File Emp_discounts = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Emp_discounts, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\gnav\\Emp_discounts.jpg"));
		
		wait.until(ExpectedConditions.elementToBeClickable(Vzw_Homepage.Shop(driver)));
		action.moveToElement(Vzw_Homepage.Shop(driver)).moveToElement(Vzw_Homepage.Deals(driver)).moveToElement(Vzw_Homepage.Accessory_bundels(driver)).click().build().perform();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		File Accessory_bundels = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Accessory_bundels, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\gnav\\Accessory_bundels.jpg"));
		
		wait.until(ExpectedConditions.elementToBeClickable(Vzw_Homepage.Shop(driver)));
		action.moveToElement(Vzw_Homepage.Shop(driver)).moveToElement(Vzw_Homepage.Deals(driver)).moveToElement(Vzw_Homepage.Tv_home_internet(driver)).click().build().perform();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		File Tv_home_internet = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Tv_home_internet, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\gnav\\Tv_home_internet.jpg"));
		
		wait.until(ExpectedConditions.elementToBeClickable(Vzw_Homepage.Shop(driver)));
		action.moveToElement(Vzw_Homepage.Shop(driver)).moveToElement(Vzw_Homepage.WhyVerizon(driver)).moveToElement(Vzw_Homepage.LTEadv(driver)).click().build().perform();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		File LTEadv = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(LTEadv, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\gnav\\LTEadv.jpg"));
		
		wait.until(ExpectedConditions.elementToBeClickable(Vzw_Homepage.Shop(driver)));
		action.moveToElement(Vzw_Homepage.Shop(driver)).moveToElement(Vzw_Homepage.WhyVerizon(driver)).moveToElement(Vzw_Homepage.Better_matters(driver)).click().build().perform();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		File Better_matters = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Better_matters, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\gnav\\Better_matters.jpg"));
		
		wait.until(ExpectedConditions.elementToBeClickable(Vzw_Homepage.Shop(driver)));
		action.moveToElement(Vzw_Homepage.Shop(driver)).moveToElement(Vzw_Homepage.WhyVerizon(driver)).moveToElement(Vzw_Homepage.Coveragemap(driver)).click().build().perform();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		File Coveragemap = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Coveragemap, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\gnav\\Coveragemap.jpg"));
		
		wait.until(ExpectedConditions.elementToBeClickable(Vzw_Homepage.Shop(driver)));
		action.moveToElement(Vzw_Homepage.Shop(driver)).moveToElement(Vzw_Homepage.WhyVerizon(driver)).moveToElement(Vzw_Homepage.Smartrewards(driver)).click().build().perform();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		File Smartrewards = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Smartrewards, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\gnav\\Smartrewards.jpg"));
		
		wait.until(ExpectedConditions.elementToBeClickable(Vzw_Homepage.Shop(driver)));
		action.moveToElement(Vzw_Homepage.Shop(driver)).moveToElement(Vzw_Homepage.WhyVerizon(driver)).moveToElement(Vzw_Homepage.Ispu(driver)).click().build().perform();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		File Ispu = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Ispu, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\gnav\\Ispu.jpg"));
		
		wait.until(ExpectedConditions.elementToBeClickable(Vzw_Homepage.Shop(driver)));
		action.moveToElement(Vzw_Homepage.Shop(driver)).moveToElement(Vzw_Homepage.WhyVerizon(driver)).moveToElement(Vzw_Homepage.Referafriend(driver)).click().build().perform();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		File Referafriend = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Referafriend, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\gnav\\Referafriend.jpg"));
		
		wait.until(ExpectedConditions.elementToBeClickable(Vzw_Homepage.Shop(driver)));
		action.moveToElement(Vzw_Homepage.Shop(driver)).moveToElement(Vzw_Homepage.Brands(driver)).moveToElement(Vzw_Homepage.Apple(driver)).click().build().perform();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		File Apple = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Apple, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\gnav\\Apple.jpg"));
		
		wait.until(ExpectedConditions.elementToBeClickable(Vzw_Homepage.Shop(driver)));
		action.moveToElement(Vzw_Homepage.Shop(driver)).moveToElement(Vzw_Homepage.Brands(driver)).moveToElement(Vzw_Homepage.Droid(driver)).click().build().perform();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		File Droid = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Droid, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\gnav\\Droid.jpg"));
		
		wait.until(ExpectedConditions.elementToBeClickable(Vzw_Homepage.Shop(driver)));
		action.moveToElement(Vzw_Homepage.Shop(driver)).moveToElement(Vzw_Homepage.Brands(driver)).moveToElement(Vzw_Homepage.Google(driver)).click().build().perform();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		File Google = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Google, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\gnav\\Google.jpg"));
		
		wait.until(ExpectedConditions.elementToBeClickable(Vzw_Homepage.Shop(driver)));
		action.moveToElement(Vzw_Homepage.Shop(driver)).moveToElement(Vzw_Homepage.Brands(driver)).moveToElement(Vzw_Homepage.LG(driver)).click().build().perform();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		File LG = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(LG, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\gnav\\LG.jpg"));
		
		wait.until(ExpectedConditions.elementToBeClickable(Vzw_Homepage.Shop(driver)));
		action.moveToElement(Vzw_Homepage.Shop(driver)).moveToElement(Vzw_Homepage.Brands(driver)).moveToElement(Vzw_Homepage.Motorola(driver)).click().build().perform();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		File Motorola = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Motorola, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\gnav\\Motorola.jpg"));
		
		wait.until(ExpectedConditions.elementToBeClickable(Vzw_Homepage.Shop(driver)));
		action.moveToElement(Vzw_Homepage.Shop(driver)).moveToElement(Vzw_Homepage.Brands(driver)).moveToElement(Vzw_Homepage.Samsung(driver)).click().build().perform();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		File Samsung = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Samsung, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\gnav\\Samsung.jpg"));
		
		wait.until(ExpectedConditions.elementToBeClickable(Vzw_Homepage.Shop(driver)));
		action.moveToElement(Vzw_Homepage.Shop(driver)).moveToElement(Vzw_Homepage.Kids(driver)).click().build().perform();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		File Kids = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Kids, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\gnav\\Kids.jpg"));
		
		wait.until(ExpectedConditions.elementToBeClickable(Vzw_Homepage.Support(driver)));
		action.moveToElement(Vzw_Homepage.Support(driver)).moveToElement(Vzw_Homepage.Gethelpwithyour(driver)).moveToElement(Vzw_Homepage.Device(driver)).click().build().perform();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		File Device = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Device, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\gnav\\Device.jpg"));
		
		wait.until(ExpectedConditions.elementToBeClickable(Vzw_Homepage.Support(driver)));
		action.moveToElement(Vzw_Homepage.Support(driver)).moveToElement(Vzw_Homepage.Gethelpwithyour(driver)).moveToElement(Vzw_Homepage.Billing_payments(driver)).click().build().perform();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		File Billing_payments = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Billing_payments, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\gnav\\Billing_payments.jpg"));
		
		wait.until(ExpectedConditions.elementToBeClickable(Vzw_Homepage.Support(driver)));
		action.moveToElement(Vzw_Homepage.Support(driver)).moveToElement(Vzw_Homepage.Gethelpwithyour(driver)).moveToElement(Vzw_Homepage.Planaccounts(driver)).click().build().perform();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		File Planaccounts = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Planaccounts, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\gnav\\Planaccounts.jpg"));
		
		wait.until(ExpectedConditions.elementToBeClickable(Vzw_Homepage.Support(driver)));
		action.moveToElement(Vzw_Homepage.Support(driver)).moveToElement(Vzw_Homepage.Gethelpwithyour(driver)).moveToElement(Vzw_Homepage.Serivesnapps(driver)).click().build().perform();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		File Serivesnapps = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Serivesnapps, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\gnav\\Serivesnapps.jpg"));
		
		wait.until(ExpectedConditions.elementToBeClickable(Vzw_Homepage.Support(driver)));
		action.moveToElement(Vzw_Homepage.Support(driver)).moveToElement(Vzw_Homepage.Gethelpwithyour(driver)).moveToElement(Vzw_Homepage.intlservices_support(driver)).click().build().perform();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		File intlservices_support = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(intlservices_support, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\gnav\\intlservices_support.jpg"));
		
		wait.until(ExpectedConditions.elementToBeClickable(Vzw_Homepage.Support(driver)));
		action.moveToElement(Vzw_Homepage.Support(driver)).moveToElement(Vzw_Homepage.Gethelpwithyour(driver)).moveToElement(Vzw_Homepage.Troubleshooting(driver)).click().build().perform();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		File Troubleshooting = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Troubleshooting, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\gnav\\Troubleshooting.jpg"));
		
		wait.until(ExpectedConditions.elementToBeClickable(Vzw_Homepage.Support(driver)));
		action.moveToElement(Vzw_Homepage.Support(driver)).moveToElement(Vzw_Homepage.Trendingsupporttopics(driver)).click().build().perform();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		File Trendingsupporttopics = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Trendingsupporttopics, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\gnav\\Trendingsupporttopics.jpg"));
		
		wait.until(ExpectedConditions.elementToBeClickable(Vzw_Homepage.Support(driver)));
		action.moveToElement(Vzw_Homepage.Support(driver)).moveToElement(Vzw_Homepage.Communityforms(driver)).click().build().perform();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		File Communityforms = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Communityforms, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\gnav\\Communityforms.jpg"));
		
		wait.until(ExpectedConditions.elementToBeClickable(Vzw_Homepage.Support(driver)));
		action.moveToElement(Vzw_Homepage.Support(driver)).moveToElement(Vzw_Homepage.Orderstatus(driver)).click().build().perform();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		File Orderstatus = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Orderstatus, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\gnav\\Orderstatus.jpg"));
		
		wait.until(ExpectedConditions.elementToBeClickable(Vzw_Homepage.MyVerizon(driver)));
		action.moveToElement(Vzw_Homepage.MyVerizon(driver)).moveToElement(Vzw_Homepage.Signin(driver)).click().build().perform();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		File Signin = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Signin, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\gnav\\Signin.jpg"));
		
		
		wait.until(ExpectedConditions.elementToBeClickable(Vzw_Homepage.MyVerizon(driver)));
		action.moveToElement(Vzw_Homepage.MyVerizon(driver)).moveToElement(Vzw_Homepage.Learnmore(driver)).click().build().perform();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		File Learnmore = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Learnmore, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\gnav\\Learnmore.jpg"));
		
		wait.until(ExpectedConditions.elementToBeClickable(Vzw_Homepage.MyVerizon(driver)));
		action.moveToElement(Vzw_Homepage.MyVerizon(driver)).moveToElement(Vzw_Homepage.Register(driver)).click().build().perform();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		File Register = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Register, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\gnav\\Register.jpg"));
		
		
		
		
		
		
		
		
		
		
		
		
}
}