package Page_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import appModule.Commonmethods;

public class Productsnmagapp_page {
	private static By by = null;
	private static WebElement element = null;
	
	public static WebElement Free_products(WebDriver driver){
       by = By.id("free-link");
		WebElement element = Commonmethods.find_element(driver, by);
		return element;
       }
	public static WebElement Premium_products(WebDriver driver){
       by = By.id("premium-link");
		WebElement element = Commonmethods.find_element(driver, by);
		return element;
       }
	public static WebElement VZ_Navigator(WebDriver driver){
        by = By.xpath("//*[@id='highlight_product_sfo80078_75930']/div[2]/div[2]/div[2]/div[2]/a");
		WebElement element = Commonmethods.find_element(driver, by);
		return element;
       }
	public static WebElement Road_assistance(WebDriver driver){
        by = By.xpath("//*[@id='highlight_product_sfo120004_72188']/div[2]/div[2]/div[2]/div[2]/a");
		WebElement element = Commonmethods.find_element(driver, by);
		return element;
       }
	public static WebElement Family_Locator(WebDriver driver){
        by = By.xpath("//*[@id='highlight_product_sfo120004_77200']/div[2]/div[2]/div[2]/div[2]/a");
		WebElement element = Commonmethods.find_element(driver, by);
		return element;
       }
	
	public static WebElement product1(WebDriver driver){
       by = By.xpath("//*[@id='highlight_product_sfo1160002_81158']/div[2]/div[2]/div[2]/div[2]/span");
		WebElement element = Commonmethods.find_element(driver, by);
		return element;
       }
	public static WebElement product2(WebDriver driver){
        by = By.xpath("//*[@id='highlight_product_sfo120005_76600']/div[2]/div[2]/div[2]/div[2]/a");
		WebElement element = Commonmethods.find_element(driver, by);
		return element;
       }
	public static WebElement ckbox1(WebDriver driver){
        by = By.id("addLine9495361270");
		WebElement element = Commonmethods.find_element(driver, by);
		return element;
       }
	public static WebElement ckbox2(WebDriver driver){
      by = By.id("addLine9495361271");
		WebElement element = Commonmethods.find_element(driver, by);
		return element;
       }
	public static WebElement ckbox3(WebDriver driver){
       by = By.id("addLine9495361272");
		WebElement element = Commonmethods.find_element(driver, by);
		return element;
       }
	public static WebElement ckbox4(WebDriver driver){
       by = By.id("addLine9495361206");
		WebElement element = Commonmethods.find_element(driver, by);
		return element;
       }
	public static WebElement ckbox5(WebDriver driver){
      by = By.id("addLine9495361341");
		WebElement element = Commonmethods.find_element(driver, by);
		return element;
       }
	
	public static WebElement confirm_purchase(WebDriver driver){
       by = By.xpath("//*[@id='ui-id-1']/div/form/div[5]/input[4]");
		WebElement element = Commonmethods.find_element(driver, by);
		return element;
       }
	public static WebElement Ok_btn(WebDriver driver){
		by = By.xpath("//*[@id='ui-id-3']/div/form/div[2]/input");
		WebElement element = Commonmethods.find_element(driver, by);
		return element;
       }
	public static WebElement removeproducts_link(WebDriver driver){
       by = By.xpath("//*[@id='Options']/div[2]/div/div[1]/a");
		WebElement element = Commonmethods.find_element(driver, by);
		return element;
       }
	public static WebElement removeproducts_btn(WebDriver driver){
       by = By.xpath("//*[@id='remove_from_account_form']/div[4]/input[2]");
		WebElement element = Commonmethods.find_element(driver, by);
		return element;
       }
	public static WebElement remove_cnf_btn(WebDriver driver){
        by = By.xpath("//*[@id='remove_conformation_form']/div[2]/input[1]");
		WebElement element = Commonmethods.find_element(driver, by);
		return element;
		}
	public static WebElement product_name(WebDriver driver){
       by = By.xpath("//*[@id='ui-id-5']/div/form/div[1]/p[1]");
		WebElement element = Commonmethods.find_element(driver, by);
		return element;
		}
	public static WebElement product_info(WebDriver driver){
        by = By.xpath("//*[@id='ui-id-5']/div/form/div[1]/p[2]/strong");
		WebElement element = Commonmethods.find_element(driver, by);
		return element;
		}
	public static WebElement product_AddedMDN(WebDriver driver){
		by = By.xpath("//*[@id='ui-id-5']/div/form/div[1]/p[3]");
		WebElement element = Commonmethods.find_element(driver, by);
		return element;
		}
	
	
}








