package Page_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import appModule.Commonmethods;

public class My_verizon_hp {
	private static By by = null;
	private static WebElement element = null;
	
	 public static WebElement Gnav_myplns_services(WebDriver driver){
        by =  By.xpath("//*[@id='myvz-fixed-subMenu-wrapper']/div/div/ul/li[5]/a/span");
		WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	 public static WebElement Gnav_myverizon(WebDriver driver){
         by = By.id("onavmenu3");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	 public static WebElement Gnav_mng_productsapps(WebDriver driver){
         by = By.xpath("//*[@id='myvz-fixed-subMenu-wrapper']/div/div/ul/li[5]/div[2]/div/table/tbody/tr[1]/td[2]/span[2]/a");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	 public static WebElement Gnav_mydevices(WebDriver driver){
         by = By.xpath("//*[@id='myvz-fixed-subMenu-wrapper']/div/div/ul/li[4]/a/span");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	 public static WebElement Gnav_sus_n_reconnect(WebDriver driver){
         by = By.xpath("//*[@id='myvz-fixed-subMenu-wrapper']/div/div/ul/li[4]/div[2]/div/table/tbody/tr[2]/td/span[2]/a");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	 public static WebElement Gnav_mng_intl_services(WebDriver driver){
         by = By.xpath("//*[@id='myvz-fixed-subMenu-wrapper']/div/div/ul/li[5]/div[2]/div/table/tbody/tr[3]/td[2]/span[2]/a");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	 public static WebElement Gnav_mybilling(WebDriver driver){
         by = By.xpath("//*[@id='myvz-fixed-subMenu-wrapper']/div/div/ul/li[2]/a/span");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element; 
        }
	 public static WebElement Gnav_paybill(WebDriver driver){
        by = By.xpath("//*[@id='myvz-fixed-subMenu-wrapper']/div/div/ul/li[2]/div[2]/div/table/tbody/tr[2]/td[1]/span[2]/a");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	 public static WebElement Gnav_Autopay(WebDriver driver){
         by = By.xpath("//*[@id='myvz-fixed-subMenu-wrapper']/div/div/ul/li[2]/div[2]/div/table/tbody/tr[1]/td[2]/span[2]/a");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	 public static WebElement Get_support(WebDriver driver){
        by = By.xpath("//*[@id='deviceDetail']/div[1]/div[1]/div[2]/ul/li[3]/a");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	 public static WebElement Redeem_rewards(WebDriver driver){
        by = By.xpath("//*[@id='accountBar']/div/div[2]/div/a");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	 public static WebElement Color_legend_tooltip(WebDriver driver){
        by = By.xpath("//*[@id='myVzwOverview']/div[4]/div/div[2]/div[1]/span/span");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	 public static WebElement Device2(WebDriver driver){
        by = By.xpath("//*[@id='deviceSlider']/div/div[3]/a[2]/span[3]");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	 public static WebElement Edit_link(WebDriver driver){
        by = By.xpath("//*[@id='deviceDetail']/div[1]/div[1]/div[1]/div[1]/a");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	 public static WebElement Name_txtbox(WebDriver driver){
        by = By.xpath("//*[@id='o-editName-form']/div/ul/li[2]/div[2]/input[2]");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	 public static WebElement Name_save(WebDriver driver){
         by = By.id("save-name");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	 public static WebElement Device_name(WebDriver driver){
        by = By.xpath("//*[@id='deviceDetail']/div[1]/div[1]/div[1]/div[1]/span");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	 public static WebElement Gnav_Viewbill(WebDriver driver){
         by = By.xpath("//*[@id='myvz-fixed-subMenu-wrapper']/div/div/ul/li[2]/div[2]/div/table/tbody/tr[1]/td[1]/span[2]/a");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	 public static WebElement Gnav_Mng_payment_accounts(WebDriver driver){
         WebElement element = driver.findElement(By.xpath("//*[@id='myvz-fixed-subMenu-wrapper']/div/div/ul/li[2]/div[2]/div/table/tbody/tr[1]/td[3]/span[2]/a"));
		return element;
        }
	 public static WebElement Gnav_Doc_receipts(WebDriver driver){
         by = By.xpath("//*[@id='myvz-fixed-subMenu-wrapper']/div/div/ul/li[2]/div[2]/div/table/tbody/tr[1]/td[4]/span[2]/a");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	 public static WebElement Gnav_Payment_history(WebDriver driver){
         by = By.xpath("//*[@id='myvz-fixed-subMenu-wrapper']/div/div/ul/li[2]/div[2]/div/table/tbody/tr[2]/td[2]/span[2]/a");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	 public static WebElement Gnav_paper_free_billing(WebDriver driver){
        by = By.xpath("//*[@id='myvz-fixed-subMenu-wrapper']/div/div/ul/li[2]/div[2]/div/table/tbody/tr[2]/td[3]/span[2]/a");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	 public static WebElement Gnav_Payment_arrangements(WebDriver driver){
         by = By.xpath("//*[@id='myvz-fixed-subMenu-wrapper']/div/div/ul/li[2]/div[2]/div/table/tbody/tr[2]/td[4]/span[2]/a");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	 public static WebElement Gnav_My_usage(WebDriver driver){
         by = By.xpath("//*[@id='myvz-fixed-subMenu-wrapper']/div/div/ul/li[3]/a/span");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	 public static WebElement Gnav_Manage_usage(WebDriver driver){
         by = By.xpath("//*[@id='myvz-fixed-subMenu-wrapper']/div/div/ul/li[3]/div[2]/div/table/tbody/tr/td[1]/span[2]/a");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	 public static WebElement Gnav_mng_usage_alerts(WebDriver driver){
        by = By.xpath("//*[@id='myvz-fixed-subMenu-wrapper']/div/div/ul/li[3]/div[2]/div/table/tbody/tr/td[2]/span[2]/a");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	 public static WebElement Gnav_Device_overview(WebDriver driver){
         by = By.xpath("//*[@id='myvz-fixed-subMenu-wrapper']/div/div/ul/li[4]/div[2]/div/table/tbody/tr[1]/td[1]/span[2]/a");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	 public static WebElement Gnav_Activate_switch(WebDriver driver){
         by = By.xpath("//*[@id='myvz-fixed-subMenu-wrapper']/div/div/ul/li[4]/div[2]/div/table/tbody/tr[1]/td[2]/span[2]/a");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	 public static WebElement Gnav_Myorders(WebDriver driver){
        by = By.xpath("//*[@id='myvz-fixed-subMenu-wrapper']/div/div/ul/li[4]/div[2]/div/table/tbody/tr[1]/td[3]/span[2]/a");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	 public static WebElement Gnav_mycloud(WebDriver driver){
        by = By.xpath("//*[@id='myvz-fixed-subMenu-wrapper']/div/div/ul/li[4]/div[2]/div/table/tbody/tr[1]/td[4]/span[2]/a");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	 public static WebElement Gnav_upgrade_devices(WebDriver driver){
         by = By.xpath("//*[@id='myvz-fixed-subMenu-wrapper']/div/div/ul/li[4]/div[2]/div/table/tbody/tr[2]/td[1]/span[2]/a");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	 public static WebElement Gnav_Changemobilenumber(WebDriver driver){
         by = By.xpath("//*[@id='myvz-fixed-subMenu-wrapper']/div/div/ul/li[4]/div[2]/div/table/tbody/tr[2]/td[3]/span[2]/a");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	 public static WebElement Gnav_Addadevice(WebDriver driver){
        by = By.xpath("//*[@id='myvz-fixed-subMenu-wrapper']/div/div/ul/li[4]/div[2]/div/table/tbody/tr[3]/td[1]/span[2]/a");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	 public static WebElement Gnav_managevoicemailpassword(WebDriver driver){
         by = By.xpath("//*[@id='myvz-fixed-subMenu-wrapper']/div/div/ul/li[4]/div[2]/div/table/tbody/tr[3]/td[2]/span[2]/a");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	 public static WebElement Gnav_myplan(WebDriver driver){
         by = By.xpath("//*[@id='myvz-fixed-subMenu-wrapper']/div/div/ul/li[5]/div[2]/div/table/tbody/tr[1]/td[1]/span[2]/a");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	 public static WebElement Gnav_family_safegaurds(WebDriver driver){
        by = By.xpath("//*[@id='myvz-fixed-subMenu-wrapper']/div/div/ul/li[5]/div[2]/div/table/tbody/tr[1]/td[3]/span[2]/a");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	 public static WebElement Gnav_Blocks(WebDriver driver){
         by = By.xpath("//*[@id='myvz-fixed-subMenu-wrapper']/div/div/ul/li[5]/div[2]/div/table/tbody/tr[2]/td[1]/span[2]/a");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	 public static WebElement Gnav_manageconnecteddevices(WebDriver driver){
        by = By.xpath("//*[@id='myvz-fixed-subMenu-wrapper']/div/div/ul/li[4]/div[2]/div/table/tbody/tr[2]/td[4]/span[2]/a");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	 public static WebElement Gnav_manageplan(WebDriver driver){
         by = By.xpath("//*[@id='myvz-fixed-subMenu-wrapper']/div/div/ul/li[5]/div[2]/div/table/tbody/tr[2]/td[2]/span[2]/a");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	 public static WebElement Gnav_sendamsg(WebDriver driver){
        by = By.xpath("//*[@id='myvz-fixed-subMenu-wrapper']/div/div/ul/li[5]/div[2]/div/table/tbody/tr[2]/td[3]/span[2]/a");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	 public static WebElement Gnav_managefamilybase(WebDriver driver){
        by = By.xpath("//*[@id='myvz-fixed-subMenu-wrapper']/div/div/ul/li[5]/div[2]/div/table/tbody/tr[2]/td[4]/span[2]/a");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	 public static WebElement Gnav_myoffers(WebDriver driver){
        by = By.xpath("//*[@id='myvz-fixed-subMenu-wrapper']/div/div/ul/li[5]/div[2]/div/table/tbody/tr[3]/td[1]/span[2]/a");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	 public static WebElement Gnav_my_profile(WebDriver driver){
        by = By.xpath("//*[@id='myvz-fixed-subMenu-wrapper']/div/div/ul/li[6]/a/span");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	 public static WebElement Gnav_my_profile_settings(WebDriver driver){
        by = By.xpath("//*[@id='myvz-fixed-subMenu-wrapper']/div/div/ul/li[6]/div[2]/div/table/tbody/tr[1]/td[1]/span[2]/a");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	 public static WebElement Gnav_Accounts_alerts(WebDriver driver){
         by = By.xpath("//*[@id='myvz-fixed-subMenu-wrapper']/div/div/ul/li[6]/div[2]/div/table/tbody/tr[1]/td[2]/span[2]/a");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	 public static WebElement Gnav_smart_rewards(WebDriver driver){
         by = By.xpath("//*[@id='myvz-fixed-subMenu-wrapper']/div/div/ul/li[6]/div[2]/div/table/tbody/tr[1]/td[3]/span[2]/a");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	 public static WebElement Gnav_manage_billing_address(WebDriver driver){
        by = By.xpath("//*[@id='myvz-fixed-subMenu-wrapper']/div/div/ul/li[6]/div[2]/div/table/tbody/tr[1]/td[4]/span[2]/a");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	 public static WebElement Gnav_Assign_acc_managers(WebDriver driver){
         by = By.xpath("//*[@id='myvz-fixed-subMenu-wrapper']/div/div/ul/li[6]/div[2]/div/table/tbody/tr[2]/td[1]/span[2]/a");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	 public static WebElement Gnav_privacy_settings(WebDriver driver){
        by = By.xpath("//*[@id='myvz-fixed-subMenu-wrapper']/div/div/ul/li[6]/div[2]/div/table/tbody/tr[2]/td[2]/span[2]/a");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	 public static WebElement Gnav_vz_selects(WebDriver driver){
         by = By.xpath("//*[@id='myvz-fixed-subMenu-wrapper']/div/div/ul/li[6]/div[2]/div/table/tbody/tr[2]/td[3]/span[2]/a");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	 public static WebElement Gnav_manage_family_friends(WebDriver driver){
        by = By.xpath("//*[@id='myvz-fixed-subMenu-wrapper']/div/div/ul/li[6]/div[2]/div/table/tbody/tr[2]/td[4]/span[2]/a");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	 public static WebElement Gnav_my_referral_rewards(WebDriver driver){
        by = By.xpath("//*[@id='myvz-fixed-subMenu-wrapper']/div/div/ul/li[6]/div[2]/div/table/tbody/tr[3]/td/span[2]/a");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	 public static WebElement Gnav_vz_select1s(WebDriver driver){
       by = By.xpath("//*[@id='myvz-fixed-subMenu-wrapper']/div/div/ul/li[6]/div[2]/div/table/tbody/tr[2]/td[3]/span[2]/a");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	 public static WebElement Gnav_vz_sehlects(WebDriver driver){
         by = By.xpath("//*[@id='myvz-fixed-subMenu-wrapper']/div/div/ul/li[6]/div[2]/div/table/tbody/tr[2]/td[3]/span[2]/a");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	 public static WebElement Gnav_vz_shelects(WebDriver driver){
         by = By.xpath("//*[@id='myvz-fixed-subMenu-wrapper']/div/div/ul/li[6]/div[2]/div/table/tbody/tr[2]/td[3]/span[2]/a");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	 public static WebElement Gnav_vhz_selects(WebDriver driver){
        by = By.xpath("//*[@id='myvz-fixed-subMenu-wrapper']/div/div/ul/li[6]/div[2]/div/table/tbody/tr[2]/td[3]/span[2]/a");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	 public static WebElement Manage_planCTA(WebDriver driver){
	        by = By.xpath("//*[@id='myVzwOverview']/div[4]/div/div[2]/div[2]/div[2]/a[2]");
			 WebElement element = Commonmethods.find_element(driver, by);
			return element;
	        }
	 
	 
	 
	 
	
	
}


