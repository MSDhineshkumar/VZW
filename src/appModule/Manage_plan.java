package appModule;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Page_Objects.My_verizon_hp;
import Page_Objects.manage_plan_page;

public class Manage_plan {
	public static void Execute(WebDriver driver,WebDriverWait wait) throws IOException{
	DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy ");
	Date date = new Date();
	String today= dateFormat.format(date);
	String pagetitle1 = driver.getTitle();
	System.out.println(pagetitle1);
	Actions action = new Actions(driver);
//	My_verizon_hp.Gnav_myverizon(driver).click();
	
//	wait.until(ExpectedConditions.elementToBeClickable(My_verizon_hp.Gnav_myplns_services(driver)));
//	wait.until(ExpectedConditions.elementToBeClickable(My_verizon_hp.Gnav_manageplan(driver)));
//	action.moveToElement(My_verizon_hp.Gnav_myplns_services(driver)).moveToElement(My_verizon_hp.Gnav_manageplan(driver)).click().build().perform();
	
	My_verizon_hp.Manage_planCTA(driver).click();
	String pagetitle = driver.getTitle();
	System.out.println(pagetitle);
	if (pagetitle.equalsIgnoreCase("Authentication Error Page"))			
	{
	manage_plan_page.clearcart_Authenticationerrorpage(driver).click();
	}
	
	manage_plan_page.select_mng_plan(driver).click();
//	WebElement show_all_options = manage_plan_page.show_all_options(driver);
//			
//	if (show_all_options.isDisplayed())
//	{
//	manage_plan_page.show_all_options(driver).click();
//	}
//	String Unlimited = "$110.00";o
//	WebElement unlimited = driver.findElement(By.xpath("//*[@id='planListContainer']/div/div[5]/div[3]"))
//	if (unlimited.equals(Unlimited))
//	{
	manage_plan_page.Ssize_plan(driver).getText();
	manage_plan_page.Ssize_plan(driver).click();
//	WebElement planfeeinlist = driver.findElement(By.xpath("//*[@id='planListContainer']/div/div[5]/div[3]"));
//	WebElement planfeeinsummary= driver.findElement(By.xpath("//*[@id='planSummarySection']/div[1]/div[2]/span[4]"));
////	WebElement intlplaninsummary = driver.findElement(By.xpath("//*[@id='planSummarySection']/div[1]/div[4]/span[3]"));
//	WebElement lineaccessfee = (driver.findElement(By.xpath("//*[@id='planSummarySection']/div[1]/div[3]/span[3]")));
//	WebElement Monthlytotal = driver.findElement(By.xpath("//*[@id='planSummarySection']/div[1]/div[5]/div[2]"));
//	
//	String strlineaccessfee = driver.findElement(By.xpath("//*[@id='planSummarySection']/div[1]/div[3]/span[3]")).getText().replace("$", "");

	
	
	
//	Double Doublelineaccessfee = Double.parseDouble(strlineaccessfee);
	

	
	
	Double Doublelineaccessfee = Double.parseDouble(driver.findElement(By.xpath("//*[@id='planSummarySection']/div[1]/div[3]/span[3]")).getText().replace("$", ""));
	Double Doubleplanfeeinsummary = Double.parseDouble(driver.findElement(By.xpath("//*[@id='planSummarySection']/div[1]/div[2]/span[4]")).getText().replace("$", ""));
																					//*[@id="planSummarySection"]/div[1]/div[2]/span[4]
//	Double Doubleintlplaninsummary = Double.parseDouble(driver.findElement(By.xpath("//*[@id='planSummarySection']/div[1]/div[4]/span[3]")).getText().replace("$", ""));
	Double DoubleMonthlytotal = Double.parseDouble(driver.findElement(By.xpath("//*[@id='planSummarySection']/div[1]/div[5]/div[2]")).getText().replace("$", "").replace("*", ""));
	Double Doubleplanfeeinlist = Double.parseDouble(driver.findElement(By.xpath("//*[@id='planListContainer']/div/div[2]/div[3]")).getText().replace("$", ""));
	
	
	System.out.println(Doublelineaccessfee);
	System.out.println(Doubleplanfeeinsummary);
//	System.out.println(Doubleintlplaninsummary);
	System.out.println(DoubleMonthlytotal);
	System.out.println(Doubleplanfeeinlist);
	System.out.println(Doublelineaccessfee);
	
	
	
	if (Doubleplanfeeinlist.equals(Doubleplanfeeinsummary))
			{
		System.out.println("PASS: plan price in list and summary are same  "+"planfeeinlist--"+Doubleplanfeeinlist+"  planfeeinsummary--"+Doubleplanfeeinsummary+"  ");
			}
	else {
		System.out.println("FAIL: plan price in list and summary are different  "+"planfeeinlist--"+Doubleplanfeeinlist+"  planfeeinsummary--"+Doubleplanfeeinsummary+"  ");
		}
	
	Double Total = Doublelineaccessfee + Doubleplanfeeinsummary;
	
//	Double Total = Doublelineaccessfee + Doubleplanfeeinsummary + Doubleintlplaninsummary ;
	
	
	if (Total.equals(DoubleMonthlytotal))
	{
		System.out.println("PASS: Monthly total is correct, total is--"+Total+"");
	}else {
		System.out.println("FAIL: Monthly total is not correct, total--"+Total+" Expected--"+Total+"  Actual--"+DoubleMonthlytotal);
	}
	
	
	wait.until(ExpectedConditions.elementToBeClickable(manage_plan_page.continue_intl_inside(driver)));
	manage_plan_page.continue_intl_inside(driver).click();
	
	wait.until(ExpectedConditions.elementToBeClickable(manage_plan_page.Eff_date_continue_btn(driver)));
	manage_plan_page.Eff_date_continue_btn(driver).click();
	
//	WebElement Table = driver.findElement(By.xpath("//*[@id='pageWrapper']/section[2]/table/tbody"));
//	
//	System.out.println(Table.getText());

	
//	List<WebElement> PLANDETAILS = driver.findElements(By.linkText("PLAN DETAILS"));
//	System.out.println(PLANDETAILS.size());
//	
//	List<Double> Doublepreviousmonthly1 = new ArrayList<>();
//	List<Double> DoubleNewmonthly1 = new ArrayList<>();
//	List<Double> Doublepreviousmonthly2 = new ArrayList<>();
//	List<Double> DoubleNewmonthly2 = new ArrayList<>();
//	
//	
//	
//	
//	for(int i=1;i<=5;i++){
//		
//		Double Doublepreviousmonthly_temp = Double.parseDouble(driver.findElement(By.xpath("(//*[@class='cpcReviewTable_contentRow']/td[3])["+i+"]")).getText().replace("$", ""));
//		Doublepreviousmonthly1.add(Doublepreviousmonthly_temp);
//		
//		Double DoubleNewmonthly1_temp = Double.parseDouble(driver.findElement(By.xpath("(//*[@class='cpcReviewTable_contentRow']/td[4])["+i+"]")).getText().replace("$", ""));
//		DoubleNewmonthly1.add(DoubleNewmonthly1_temp);
//		
//		Double Doublepreviousmonthly2_temp = Double.parseDouble(driver.findElement(By.xpath("(//*[@class='preMonthlyTotalCost'])["+i+"]")).getText().replace("$", ""));
//		Doublepreviousmonthly2.add(Doublepreviousmonthly2_temp);
//		
//		Double DoubleNewmonthly2_temp = Double.parseDouble(driver.findElement(By.xpath("(//*[@class='newMonthlyTotalCost'])["+i+"]")).getText().replace("$", ""));
//		DoubleNewmonthly2.add(DoubleNewmonthly2_temp);
//		
//	}
//	Double Doublepreviousmonthly1_total = 0.00;
//	Double DoubleNewmonthly1_total = 0.00;
//	Double Doublepreviousmonthly2_total = 0.00;
//	Double DoubleNewmonthly2_total = 0.00;
//		for (int i=0; i<Doublepreviousmonthly1.size(); i++){
//			Doublepreviousmonthly1_total = Doublepreviousmonthly1_total + Doublepreviousmonthly1.get(i);
//			DoubleNewmonthly1_total = DoubleNewmonthly1_total + Doublepreviousmonthly1.get(i);
//			Doublepreviousmonthly2_total = Doublepreviousmonthly2_total + Doublepreviousmonthly1.get(i);
//			DoubleNewmonthly2_total = DoubleNewmonthly2_total + Doublepreviousmonthly1.get(i);	
//		}
//	
//
//		
//	Double Doubletotalpreviousmonthly = Double.parseDouble(driver.findElement(By.xpath("//*[@id='pageWrapper']/section[2]/table/tbody/tr[37]/td[2]")).getText().replace("$", ""));
//	System.out.println(Doubletotalpreviousmonthly);										
//	
//	Double Doubletotalnewmonthly = Double.parseDouble(driver.findElement(By.xpath("//*[@id='pageWrapper']/section[2]/table/tbody/tr[37]/td[3]")).getText().replace("$", ""));
//	System.out.println(Doubletotalnewmonthly);									
//	
//	Double Doublenewplan = Double.parseDouble(driver.findElement(By.xpath("//*[@id='pageWrapper']/section[2]/table/tbody/tr[2]/td[4]")).getText().replace("$", ""));
//	System.out.println(Doublenewplan);										
//	
//	Double Doublepreviousplan = Double.parseDouble(driver.findElement(By.xpath("//*[@id='pageWrapper']/section[2]/table/tbody/tr[3]/td[3]")).getText().replace("$", ""));
//	System.out.println(Doublepreviousplan);										
//	
////	Double Doublesafetymode = Double.parseDouble(driver.findElement(By.xpath("//*[@id='pageWrapper']/section[2]/table/tbody/tr[5]/td[3]")).getText().replace("$", ""));
////	System.out.println(Doublesafetymode);
////	
////	Double DoubleCarryoverData = Double.parseDouble(driver.findElement(By.xpath("//*[@id='pageWrapper']/section[2]/table/tbody/tr[6]/td[3]")).getText().replace("$", ""));
////	System.out.println(DoubleCarryoverData);
//	
//	
////	Double previousmonthlytotal = Doublepreviousmonthly1_total + Doublepreviousmonthly2_total + Doublesafetymode + DoubleCarryoverData + Doublepreviousplan;
//	Double previousmonthlytotal = Doublepreviousmonthly1_total + Doublepreviousmonthly2_total + Doublepreviousplan;
//	
//	Double newmonthlytotal = DoubleNewmonthly1_total + DoubleNewmonthly2_total + Doublenewplan;
//	
//	System.out.println(previousmonthlytotal);
//	System.out.println(newmonthlytotal);
//	
//	
//	if (previousmonthlytotal == Doubletotalpreviousmonthly){
//		System.out.println("PASS: previous monthly total is correct");
//	}else{
//		System.out.println("FAIL: previous monthly total is incorrect");
//	}
//	
//	if (newmonthlytotal == Doubletotalnewmonthly){
//		System.out.println("PASS: new monthly total is correct");
//	}else{
//		System.out.println("FAIL: new monthly total is incorrect");
//	}
	

	manage_plan_page.confirm_btn(driver).isDisplayed();
	File mng_plan = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(mng_plan, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\manageplan.jpg"));
	
	System.out.println("Manage plan has been successfully completed !!!");
	
	
	
	}	
	
}
//
//
//List<WebElement> ButtonNamelist = myTestDriver
//.findElements(By
//.cssSelector("span[class^='z-button']"));
//
//System.out.println(ButtonNamelist.size());
//for(int i=0;i<ButtonNamelist.size();i++){
//	
//	int j=i+3;
//	drive
//	
//}

// old plan  //*[@id="pageWrapper"]/section[2]/table/tbody/tr[3]
// nnew plan  //*[@id="pageWrapper"]/section[2]/table/tbody/tr[2]/td[4]
// 
// Safemode  //*[@id="pageWrapper"]/section[2]/table/tbody/tr[5]/td[3]
////*[@id="pageWrapper"]/section[2]/table/tbody/tr[5]/td[4]
// 
// carry over data //*[@id="pageWrapper"]/section[2]/table/tbody/tr[6]/td[3]
// 
////*[@id="pageWrapper"]/section[2]/table/tbody/tr[6]/td[4]
// 
// total //*[@id="pageWrapper"]/section[2]/table/tbody/tr[39]/td[2]
// 
////*[@id="pageWrapper"]/section[2]/table/tbody/tr[39]/td[3]
 
 
 
	//*[@id="pageWrapper"]/section[2]/table/tbody/tr[8]/td[3]
	
	//*[@id="extFeatures"]/td[3]/div[1]
	
	
	//*[@id="pageWrapper"]/section[2]/table/tbody/tr[15]/td[3]
	
	//*[@id="extFeatures"]/td[3]/div[1]
	
	
	
	//*[@id="extFeatures"]/td[3]/div[1]
	
	//*[@id="extFeatures"]/td[3]/div[1]
	
	//*[@id="extFeatures"]/td[4]/div[1]
	
	//*[@id="extFeatures"]/td[4]/div[1]

