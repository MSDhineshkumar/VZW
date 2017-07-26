package Page_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import appModule.Commonmethods;

public class Autopay_page {
	
	private static By by = null;
	private static WebElement element = null;
		
	
	public static WebElement Disable_autopay(WebDriver driver){
        by = By.linkText("Disable");
		WebElement element = Commonmethods.find_element(driver, by);
		return element;
       }
	public static WebElement confirm_Disable_autopay(WebDriver driver){
        by = By.xpath("//*[@id='oModalDisableAutoPay']/div[2]/a[2]");
		WebElement element = Commonmethods.find_element(driver, by);
		return element;
       }
	public static WebElement CC_radio_btn(WebDriver driver){
        by = By.id("paymentModeCreditAndDebit");
		WebElement element = Commonmethods.find_element(driver, by);
		return element;
       }
	public static WebElement CC_nickname(WebDriver driver){
       by = By.id("i_creditNickName");
		WebElement element = Commonmethods.find_element(driver, by);
		return element;
       }
	public static WebElement CC_number(WebDriver driver){
        by = By.id("maskedAccountNumber");
		WebElement element = Commonmethods.find_element(driver, by);
		return element;
       }
	public static WebElement CC_exp_date(WebDriver driver){
        by = By.id("i_acctExpDate");
		WebElement element = Commonmethods.find_element(driver, by);
		return element;
       }
	public static WebElement CC_Securitycode(WebDriver driver){
        by = By.id("maskedCustomerCode");
		WebElement element = Commonmethods.find_element(driver, by);
		return element;
       }
	public static WebElement CC_Zipcode(WebDriver driver){
        by = By.id("i_acctZipCode");
		WebElement element = Commonmethods.find_element(driver, by);
		return element;
       }
	public static WebElement payment_day_dropdown(WebDriver driver){
        by = By.id("autoPayDate");
		WebElement element = Commonmethods.find_element(driver, by);
		return element;
       }
	public static WebElement Autopay_Continue(WebDriver driver){
        by = By.xpath("//*[@id='desktopPaymentAutoPayReview']/div[1]/section/div[3]/a[1]");
		WebElement element = Commonmethods.find_element(driver, by);
		return element;
       }
	public static WebElement Autopay_Confirm_btn(WebDriver driver){
       by = By.xpath("//*[@id='desktopPaymentAutoPayReview']/div/section[2]/div[2]/a[1]");
		WebElement element = Commonmethods.find_element(driver, by);
		return element;
       }
	public static WebElement Autopay_Confirm_text(WebDriver driver){
        by = By.xpath("//*[@id='desktopPaymentAutoPayReview']/section/div[1]/div/div");
		WebElement element = Commonmethods.find_element(driver, by);
		return element;
       }
	
	public static WebElement Autopay_disable_text(WebDriver driver){
		by = By.xpath("//*[@id='desktopPaymentAutoPayReview']/section/div[2]/div/div");
        WebElement element = Commonmethods.find_element(driver, by);
		return element;
       }
	public static WebElement Alert_unabletoautopay(WebDriver driver){
		by = By.id("emptyOtherAmountError");
        WebElement element = Commonmethods.find_element(driver, by);
		return element;
       }
	
}







