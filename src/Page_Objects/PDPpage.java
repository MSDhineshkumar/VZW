package Page_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import appModule.Commonmethods;

public class PDPpage {
	private static By by = null;
	private static WebElement element = null;
	
	
	public static  WebElement Monthly_price(WebDriver driver){
        by = By.xpath("//*[@id='device-contracts-wrapper']/div/section[1]/label/span/h4");
		WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	public static  WebElement Retail_price(WebDriver driver){
        by = By.xpath("//*[@id='device-contracts-wrapper']/div/section[2]/label/span/h4");
		WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	
	public static  WebElement nextstep(WebDriver driver){
        by = By.id("myBtn");
		WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	public static  WebElement Zipcode(WebDriver driver){
        by = By.xpath("(//*[@id='zipCodeConfirm']/input[1])[2]");
		WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	public static  WebElement Confirm_location(WebDriver driver){
        by = By.xpath("(//*[@id='zipCodeConfirm']/input[2])[2]");
		WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	public static  WebElement new_customer(WebDriver driver){
        by = By.xpath("//*[@id='preIntent']/div/input[1]");
		WebElement element = Commonmethods.find_element(driver, by);
		return element;
		}
	public static  WebElement existing_customer(WebDriver driver){
        by = By.xpath("//*[@id='preIntent']/div/input[2]");
		WebElement element = Commonmethods.find_element(driver, by);
		return element;
		}
}



