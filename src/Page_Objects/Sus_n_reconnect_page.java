package Page_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import appModule.Commonmethods;

public class Sus_n_reconnect_page {
	
	private static By by = null;
	private static WebElement element = null;
	
	
	public static  WebElement Suspend_reconnect_service(WebDriver driver){
        by = By.xpath("//*[@id='suspendResumeDevice-9495361270']/div/div[6]/a/span");
		WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	public static  WebElement lost_stolen(WebDriver driver){
      by = By.id("reasonDropdown21");
		WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	public static  WebElement Military_deployment(WebDriver driver){
      by = By.id("reasonDropdownMilitary");
		WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	public static  WebElement Others(WebDriver driver){
        by = By.id("reasonDropdownSV");
		WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	public static  WebElement Keep_billing(WebDriver driver){
       by = By.id("withBilling");
		WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	public static  WebElement suspend_sel_line(WebDriver driver){
        by = By.id("suspendButton");
		WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	public static  WebElement Close_window_suspend(WebDriver driver){
       by = By.xpath("//*[@id='processSuspendServiceOnly']/div[11]/div[3]/div/a/span");
		WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	public static  WebElement Resume_line(WebDriver driver){
       by = By.id("submitResume");
		WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	public static  WebElement Close_window_reconnect(WebDriver driver){
      by = By.xpath("//*[@id='processResumeService']/div[7]/div/a/span");
		WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	public static  WebElement Suspend_reconnect_text(WebDriver driver){
	  by = By.xpath("//*[@id='fstepCtr']/h3");
		WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
}


























