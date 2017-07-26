package Page_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import appModule.Commonmethods;

public class planpage_nse {
	private static By by = null;
	private static WebElement element = null;
	
	
	public static  WebElement Addtocartandselplan(WebDriver driver){
        by = By.xpath("//*[@id='sidebar-container']/div/section/div[5]/div/div[1]/a");
		WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
}



