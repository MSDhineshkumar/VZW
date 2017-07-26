package Page_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import appModule.Commonmethods;

public class paybill_page {
	
	private static By by = null;
	private static WebElement element = null;
	
	public static WebElement otheramount(WebDriver driver){
       by = By.id("otherAmt");
		WebElement element = Commonmethods.find_element(driver, by);
		return element;
       }
	public static WebElement morepayment_options(WebDriver driver){
       by = By.id("oMorePaymentOptions");
		WebElement element = Commonmethods.find_element(driver, by);
		return element;
       }
	public static WebElement CC_radiobtn(WebDriver driver){
        by = By.id("cardAccount2");
		WebElement element = Commonmethods.find_element(driver, by);
		return element;
       }
	public static WebElement CC_number(WebDriver driver){
        by = By.id("accountNumberMasked");
		WebElement element = Commonmethods.find_element(driver, by);
		return element;
       }
	public static WebElement usethiscard_btn(WebDriver driver){
        by = By.id("o-use-card");
		WebElement element = Commonmethods.find_element(driver, by);
		return element;
       }
	public static WebElement exp_date(WebDriver driver){
        by = By.id("cardExpDate");
		WebElement element = Commonmethods.find_element(driver, by);
		return element;
       }
	public static WebElement SecurityCode(WebDriver driver){
       by = By.id("cardSecurityCode");
		WebElement element = Commonmethods.find_element(driver, by);
		return element;
       }
	public static WebElement ZipCode(WebDriver driver){
        by = By.id("zip");
		WebElement element = Commonmethods.find_element(driver, by);
		return element;
       }
	public static WebElement continue_btn(WebDriver driver){
        by = By.xpath("//*[@id='paymentMethod']/section[3]/div[2]/button");
		WebElement element = Commonmethods.find_element(driver, by);
		return element;
       }
	public static WebElement paybill_cnf_btn(WebDriver driver){
       by = By.xpath("//*[@id='desktopPaymentStep2']/div[2]/section[2]/div[2]/button");
		WebElement element = Commonmethods.find_element(driver, by);
		return element;
       }
}





