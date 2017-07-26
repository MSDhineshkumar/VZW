package appModule;

import java.awt.Checkbox;
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
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import automation_TC.TC_MVO_manage_app;
import Page_Objects.My_verizon_hp;
import Page_Objects.Productsnmagapp_page;
import Page_Objects.Vzw_Homepage;

public class productsnapp {
	public static void Execute(WebDriver driver,WebDriverWait wait) throws IOException{
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy ");
		Date date = new Date();
		String today= dateFormat.format(date);
	Actions action = new Actions(driver);
	action.moveToElement(My_verizon_hp.Gnav_myplns_services(driver)).moveToElement(My_verizon_hp.Gnav_mng_productsapps(driver)).click().build().perform();
	Productsnmagapp_page.Free_products(driver).click();
	
	
	try {
		
		try {
			Productsnmagapp_page.product1(driver).isEnabled();
			Productsnmagapp_page.product1(driver).click();
			
			
			Productsnmagapp_page.product2(driver).isEnabled();
			Productsnmagapp_page.product2(driver).click();
		} catch (Exception e) {
			
		}
		
		Productsnmagapp_page.Premium_products(driver).click();
		
		try {
			Productsnmagapp_page.VZ_Navigator(driver).isEnabled();
			Productsnmagapp_page.VZ_Navigator(driver).click();
			
			Productsnmagapp_page.Family_Locator(driver).isEnabled();
			Productsnmagapp_page.Family_Locator(driver).click();
			
			Productsnmagapp_page.Road_assistance(driver).isEnabled();
			Productsnmagapp_page.Road_assistance(driver).click();
		} catch (Exception e) {
			
		}
	} catch (Exception e) {
		

	}
	driver.findElement(By.xpath("//*['@class=o-add-to-lines o-content-row checkbox-add-to-line']/fieldset/div/div/div/input")).click();
	
//	try {
//		Productsnmagapp_page.ckbox1(driver).click();
//	} catch(Exception e) {
//	if (Productsnmagapp_page.ckbox1(driver).isSelected()){
//		Productsnmagapp_page.ckbox2(driver).click();
//	}else if(Productsnmagapp_page.ckbox2(driver).isSelected()){
//		Productsnmagapp_page.ckbox3(driver).click();
//	}else if(Productsnmagapp_page.ckbox3(driver).isSelected()){
//			Productsnmagapp_page.ckbox4(driver).click();
//	}else if(Productsnmagapp_page.ckbox4(driver).isSelected()){
//		Productsnmagapp_page.ckbox5(driver).click();
////	}else if(Productsnmagapp_page.ckbox5(driver).isSelected()){
////		Productsnmagapp_page.ckbox5(driver).click();
//	}
//	
//
//	}
	try{
		Productsnmagapp_page.ckbox1(driver).click();
	}catch(Exception e){
		Productsnmagapp_page.ckbox2(driver).click();
	}
	
	
	Productsnmagapp_page.confirm_purchase(driver).click();
	System.out.println("Product added successfully !!!");
	File get_products = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(get_products, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\get_products.jpg"));
//	System.out.println(Productsnmagapp_page.product_name(driver).getText());
//	System.out.println(Productsnmagapp_page.product_info(driver).getText());
//	System.out.println(Productsnmagapp_page.product_AddedMDN(driver).getText());
	Productsnmagapp_page.Ok_btn(driver).click();
	wait.until(ExpectedConditions.elementToBeClickable(Productsnmagapp_page.removeproducts_link(driver)));
	Productsnmagapp_page.removeproducts_link(driver).click();
	Productsnmagapp_page.removeproducts_btn(driver).click();
	
	File remove_products = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(remove_products, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\get_products.jpg"));
	
	Productsnmagapp_page.remove_cnf_btn(driver).click();
	System.out.println("Product removed successfully !!!");
}
}


