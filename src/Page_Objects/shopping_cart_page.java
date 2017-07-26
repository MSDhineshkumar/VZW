package Page_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import appModule.Commonmethods;

public class shopping_cart_page {
	private static By by = null;
	private static WebElement element = null;
	
	public static  WebElement monthly_price(WebDriver driver){
        by = By.xpath("//*[@id='orderDetails']/table[1]/tbody/tr[2]/td[3]");
		WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	public static  WebElement retail_price(WebDriver driver){
        by = By.xpath("//*[@id='orderDetails']/table[1]/tbody/tr[2]/td[4]");
		WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	public static  WebElement offer_text(WebDriver driver){
        by = By.xpath("//*[@id='orderDetails']/table[1]/tbody/tr[1]/td[2]/div/div/b");
		WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
}





