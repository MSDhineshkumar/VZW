package Page_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import appModule.Commonmethods;

public class manage_plan_page {
	private static By by = null;
	private static WebElement element = null;
	
	 public static WebElement internationl_outside_US(WebDriver driver){
        by = By.xpath("//*[@id='intlUsageLinks']/ul/li[1]/a");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	 public static WebElement Addaplan(WebDriver driver){
         by = By.id("submitbutton");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	 public static WebElement outsideUS(WebDriver driver){
         by = By.id("tlGlobalDataEligibility1");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	 public static WebElement insideUS(WebDriver driver){
         by = By.id("tlGlobalDataEligibility2");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	 public static WebElement learnmore_travelpass(WebDriver driver){
        by = By.xpath("//*[@id='pageWrapper']/div[6]/div[2]/div/div[2]/a");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	 public static WebElement newsel_dropdown1(WebDriver driver){
        by = By.xpath("//*[@id='cpcFeatureSetupFrm']/section[1]/section/div[3]/div[3]/div[2]/div[5]/select");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	 public static WebElement newsel_dropdown3(WebDriver driver){
        by = By.xpath("//*[@id='cpcFeatureSetupFrm']/section[1]/section/div[3]/div[5]/div[2]/div[5]/select");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	 public static WebElement continue_intl_inside(WebDriver driver){
        by = By.id("continueCTA");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	 public static WebElement Eff_date_Thisbill(WebDriver driver){
        by = By.id("backdate-radio");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	 public static WebElement Eff_date_immediate(WebDriver driver){
        by = By.id("imdate-radio");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	 public static WebElement Eff_date_nxtbill(WebDriver driver){
         by = By.id("nextdate-radio");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
//	 public static WebElement Eff_date_continue_btn(WebDriver driver){
//         WebElement element = driver.findElement(By.className("button primary"));
//		return element;
//        }
	 public static WebElement Eff_date_continue_btn(WebDriver driver){
         by = By.xpath("(//*[@id='selectEffectiveDate']/div[11]/div/input[5])[2]");
		 WebElement element = Commonmethods.find_element(driver, by); 
		return element;
        }
	 public static WebElement confirm_btn(WebDriver driver){
        by = By.id("confirmCTA");
		 WebElement element = Commonmethods.find_element(driver, by); 
		return element;
        }
	 public static WebElement cancel_btn(WebDriver driver){
         by = By.xpath("//*[@id='cpcPlanFeatureReiewFrm']/div[3]/a");
		 WebElement element = Commonmethods.find_element(driver, by); 
		return element;
        }
	 public static WebElement cancel_yes_btn(WebDriver driver){
        by = By.xpath("/html/body/div[19]/div/div/p[5]/a");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	 public static WebElement MTN_9495361271(WebDriver driver){
         by = By.linkText("949-536-1271");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	 public static WebElement plan_options(WebDriver driver){
        by = By.xpath("//*[@id='intlUSPlan']/div[1]/div/div[3]/a");
		 WebElement element =  Commonmethods.find_element(driver, by);
		return element;
        }
	 public static WebElement select_mng_plan(WebDriver driver){
        by = By.id("tfCpcPlanPage1");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	 public static WebElement show_all_options(WebDriver driver){
        by = By.id("togglePlanSectionHeight");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	 public static WebElement Unlimited110(WebDriver driver){
         by = By.xpath("//*[@id='planListContainer']/div/div[5]/div[3]");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	 public static WebElement Ssize_plan(WebDriver driver){
         by = By.xpath("//*[@id='planListContainer']/div/div[2]/div[3]");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	 
	 
	 public static WebElement clearcart_Authenticationerrorpage(WebDriver driver){
         by = By.xpath("//*[@id='pageWrapper']/div/section/form/input[7]");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
//	 public static WebElement newsel_dropdownlist(WebDriver driver){
        
	public static WebElement newsel_dropdownlist(WebDriver driver) {
		 by = By.xpath("//*[@id='cpcFeatureSetupFrm']/section[1]/section/div[2]/div[3]/div[2]/div[5]/select");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	
}




