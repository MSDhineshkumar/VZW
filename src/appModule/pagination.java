package appModule;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Page_Objects.Smartphones_gw;

public class pagination {

	public static void pageination_devices(WebDriver driver, String input){
				
		List<WebElement> page_list = Smartphones_gw.pages(driver).findElements(Smartphones_gw.pagetag(driver));
		for(int i=1; i<page_list.size()-1; i++){
			
			List<WebElement> deviceelements = Smartphones_gw.Devices(driver).findElements(Smartphones_gw.Devicetagname(driver));

			for(WebElement wb : deviceelements){
				String name = wb.getText();
				
				if(name.equalsIgnoreCase(input)){
					wb.click();
				}
				else{
					System.out.println("Device is N/A in Page -"+i);
				}
						
			}
			
			if(i==page_list.size()-1){
				break;
			}
			try {
				Smartphones_gw.next(driver).click();
			} catch (Exception e) {
				driver.findElement(By.linkText("No, thanks")).click();
				Smartphones_gw.next(driver).click();
			}
			
	
		}	
	}
}



