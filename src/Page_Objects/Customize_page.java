package Page_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import appModule.Commonmethods;

public class Customize_page {
	private static By by = null;
	private static WebElement element = null;
	
	
	public static  WebElement Addtocartandselplan(WebDriver driver){
        by = By.id("submit-btn");
		WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
}



