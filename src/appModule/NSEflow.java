package appModule;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import Page_Objects.Customize_page;
import Page_Objects.PDPpage;
import Page_Objects.Vzw_Homepage;
import Page_Objects.planpage_nse;
import Page_Objects.shopping_cart_page;
import Utility.Constants;

public class NSEflow {
	public static void Execute(WebDriver driver) throws IOException{
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy ");
		Date date = new Date();
		String today= dateFormat.format(date);
		Actions action = new Actions(driver);
	
			
//			Vzw_Homepage.HPsamrtphones(driver).click();
			pagination.pageination_devices(driver, "Moto Z Play Droid");
//			PDPpage.Monthly_price(driver).click();
			PDPpage.nextstep(driver).click();
			PDPpage.Zipcode(driver).sendKeys(Constants.zipcode);
			PDPpage.Confirm_location(driver).click();
			PDPpage.new_customer(driver).click();
			Customize_page.Addtocartandselplan(driver).click();
			planpage_nse.Addtocartandselplan(driver).click();
			System.out.println(shopping_cart_page.monthly_price(driver).getText());
			System.out.println(shopping_cart_page.retail_price(driver).getText());
			System.out.println(shopping_cart_page.offer_text(driver).getText());
			
}
}




