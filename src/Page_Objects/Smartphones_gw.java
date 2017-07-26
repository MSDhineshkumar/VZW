package Page_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Smartphones_gw {
	
	private static   WebElement element = null;
	private static  By by = null;
	
	public static WebElement Devices(WebDriver driver){
        element = driver.findElement(By.id("devices"));
		return element;
    }
	
	public static By Devicetagname(WebDriver driver){
         by = By.xpath(".//h6/a/span");
		return by;
	}
	
	public static WebElement pages(WebDriver driver){
        element = driver.findElement(By.xpath(".//div[@class='pagination center margin36 onlyTopMargin clearfix']"));
		return element;
    }
	
	public static By pagetag(WebDriver driver){
        by = By.tagName("li");
		return by;
	}
	public static WebElement next(WebDriver driver){
        element = driver.findElement(By.linkText("Next"));
		return element;
    }
	
}
