//package appModule;
//
//import java.util.List;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//
//import Page_Objects.Smartphones_gw;
//
//public class Pageination {
//
//	
//	@SuppressWarnings("null")
//	public static void pageination_devices(WebDriver driver, String input){
//		List<WebElement> deviceelements = Smartphones_gw.Devices(driver).findElements(Smartphones_gw.Devicetagname(driver));
//				
//		List<WebElement> page_list = Smartphones_gw.pages(driver).findElements(Smartphones_gw.pagetag(driver));
//		for(int i=1; i<page_list.size()-2; i++){
//			
//			for(WebElement wb : deviceelements){
//				String name = wb.getText();
//				
//				if(name == input){
//					wb.click();
//				}
//				else{
//					System.out.println("Device is N/A in Page -"+i);
//				}
//						
//			}
//			
//			if(i==page_list.size()-1){
//			
//				break;
//				
//			}
//		}
//		
////		Smartphones_gw.next(driver).click();
//	}
//}
