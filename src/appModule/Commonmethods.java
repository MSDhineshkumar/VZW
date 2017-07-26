package appModule;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Commonmethods {


	public static void Locator_wait(WebDriverWait wait,By byelement){

		try {
			wait.until(ExpectedConditions.elementToBeClickable(byelement));
		} catch (StaleElementReferenceException e) {
			System.out.println("ELEMENT NOT CLICKABLE");
		}
	}
	
	public static void Element_wait(WebDriverWait wait,WebElement element){
		
		try {
			wait.until(ExpectedConditions.elementToBeClickable(element));
		} catch (StaleElementReferenceException e) {
			System.out.println("ELEMENT NOT CLICKABLE");
		}		
	}
	
	public static void Screenshot(WebDriver driver,String filename,String filedir) throws IOException{
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File(filedir+"\\"+filename+".jpg"));
	}

	public static void Open_in_Newtab(WebElement element){
		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN); 
		element.sendKeys(selectLinkOpeninNewTab);
	}

	public static WebElement find_element(WebDriver driver,By by){
		WebElement element = null;
		int attempts = 0;
		while(attempts <22){
			try{
			element = driver.findElement(by);
			break;
			}
			catch(StaleElementReferenceException e){
			System.out.println("stale exception");	
			}
			catch(InvalidSelectorException e){
			System.out.println("invalid selector exception");	
			}
			/*catch(TimeoutException e){
				PDP_Page.Nothanks(driver).click();
				System.out.println("No thanks pop");
			}*/
			/*catch(WebDriverException e){
				System.out.println("webdriver exception");
			}*/
			attempts ++;	
		}		
		return element;		
	}
	
	public static List<WebElement> find_elements(WebDriver driver,By by,WebElement element){
		List<WebElement> elements = null;
		int attempts = 0;
		while(attempts <22){
			try{
			elements = element.findElements(by);
			break;
			}
			catch(StaleElementReferenceException e){
				
			}
			attempts ++;	
		}		
		return elements;		
	}
	
	public static void makedir(String filename){
		
		File theDir = new File("D:\\"+filename);
		theDir.mkdir();
		
	}
	
	
	
}
