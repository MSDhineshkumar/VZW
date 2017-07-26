package Page_Objects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import appModule.Commonmethods;

public class Vzw_Homepage {
	public static  WebDriver driver;
	private static By by = null;
	private static WebElement element = null;
	
	
	public static  WebElement Suspend_reconnect_service(WebDriver driver){
        by = By.xpath("//*[@id='suspendResumeDevice-9495361270']/div/div[6]/a/span");
		WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }

	public static  WebElement Global_nav_Shop(WebDriver driver){
		by = By.xpath("//*[@id='onavmenu1']");
	WebElement element = Commonmethods.find_element(driver, by);
		return element;
         }
 
	 public static WebElement EnterMDN(WebDriver driver){
         by = By.id("IDToken1");
		 WebElement element = Commonmethods.find_element(driver, by);		
         return element;
        }

	 public static WebElement MDN_go(WebDriver driver){
         by = By.xpath("//*[@id='ribbon-sign-in-form']/button");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	 public static WebElement MDN2_go(WebDriver driver){
         by = By.id("login-submit");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }

	 	 
	 
	 public static WebElement SQ_go(WebDriver driver){
        by = By.id("otherButton");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	 public static WebElement Passowrd_go(WebDriver driver){
         by = By.xpath("//*[@id='loginForm']/fieldset/button");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	 
	 public static WebElement EnterSQ(WebDriver driver){
        by = By.id("IDToken1");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	
	 public static WebElement EnterPassword(WebDriver driver){
        by = By.id("IDToken2");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }
	
	
	 public static WebElement HPsamrtphones(WebDriver driver){
        by = By.xpath("//*[@id='pageWrapper']/div[3]/div/nav/ul/li[1]/div");
		 WebElement element = Commonmethods.find_element(driver, by);
		return element;
        }


	 public static WebElement Nav_1(WebDriver driver){
	        by = By.xpath("//*[@id='pageWrapper']/div[3]/div/nav/ul/li[1]/div");
			 WebElement element = Commonmethods.find_element(driver, by);
			return element;
	        }
	 public static WebElement Devices(WebDriver driver){
	    element = driver.findElement(By.id("onavmenu1"));
		return element;
	 }
	 public static WebElement Shop(WebDriver driver){
		    element = driver.findElement(By.id("onavmenu1"));
			return element;
		 }
	 public static WebElement Support(WebDriver driver){
		    element = driver.findElement(By.id("onavmenu2"));
			return element;
		 }
	 public static WebElement MyVerizon(WebDriver driver){
		    element = driver.findElement(By.id("onavmenu3"));
			return element;
		 }
	 public static WebElement Phones_Devices(WebDriver driver){
		    element = driver.findElement(By.xpath("//*[@id='desktopOmniNav']/div[3]/ul/li[1]/div[2]/div/ul/li[1]/a/span"));
			return element;
		 }
	 public static WebElement Hum(WebDriver driver){
		    element = driver.findElement(By.xpath("//*[@id='desktopOmniNav']/div[3]/ul/li[1]/div[2]/div/ul/li[2]/a/span"));
			return element;
		 }
	 public static WebElement Plans_Services(WebDriver driver){
		    element = driver.findElement(By.xpath("//*[@id='desktopOmniNav']/div[3]/ul/li[1]/div[2]/div/ul/li[3]/a/span"));
			return element;
		 }
	 public static WebElement Accessories(WebDriver driver){
		    element = driver.findElement(By.xpath("//*[@id='desktopOmniNav']/div[3]/ul/li[1]/div[2]/div/ul/li[4]/a/span"));
			return element;
		 }
	 public static WebElement Deals(WebDriver driver){
		    element = driver.findElement(By.xpath("//*[@id='desktopOmniNav']/div[3]/ul/li[1]/div[2]/div/ul/li[5]/a/span"));
			return element;
		 }
	 public static WebElement WhyVerizon(WebDriver driver){
		    element = driver.findElement(By.xpath("//*[@id='desktopOmniNav']/div[3]/ul/li[1]/div[2]/div/ul/li[6]/a/span"));
			return element;
		 }
	 public static WebElement Brands(WebDriver driver){
		    element = driver.findElement(By.xpath("//*[@id='desktopOmniNav']/div[3]/ul/li[1]/div[2]/div/ul/li[7]/a/span"));
			return element;
		 }
	 public static WebElement Kids(WebDriver driver){
		    element = driver.findElement(By.xpath("//*[@id='desktopOmniNav']/div[3]/ul/li[1]/div[2]/div/ul/li[8]/a/span"));
			return element;
		 }
	 public static WebElement Smartphones(WebDriver driver){
		    element = driver.findElement(By.xpath("//*[@id='desktopOmniNav']/div[3]/ul/li[1]/div[2]/div/ul/li[1]/div[2]/div/table/tbody/tr[1]/td[1]/span[2]/a"));
			return element;
		 }
	 public static WebElement Basicphones(WebDriver driver){
		    element = driver.findElement(By.xpath("//*[@id='desktopOmniNav']/div[3]/ul/li[1]/div[2]/div/ul/li[1]/div[2]/div/table/tbody/tr[1]/td[2]/span[2]/a"));
			return element;
		 }
	 public static WebElement Tablets(WebDriver driver){
		    element = driver.findElement(By.xpath("//*[@id='desktopOmniNav']/div[3]/ul/li[1]/div[2]/div/ul/li[1]/div[2]/div/table/tbody/tr[1]/td[3]/span[2]/a"));
			return element;
		 }
	 public static WebElement Prepaiddevices(WebDriver driver){
		    element = driver.findElement(By.xpath("//*[@id='desktopOmniNav']/div[3]/ul/li[1]/div[2]/div/ul/li[1]/div[2]/div/table/tbody/tr[1]/td[4]/span[2]/a"));
			return element;
		 }
	 public static WebElement Mobile_hotspots(WebDriver driver){
		    element = driver.findElement(By.xpath("//*[@id='desktopOmniNav']/div[3]/ul/li[1]/div[2]/div/ul/li[1]/div[2]/div/table/tbody/tr[2]/td[1]/span[2]/a"));
			return element;
		 }
	 public static WebElement HomenOffice_solutions(WebDriver driver){
		    element = driver.findElement(By.xpath("//*[@id='desktopOmniNav']/div[3]/ul/li[1]/div[2]/div/ul/li[1]/div[2]/div/table/tbody/tr[2]/td[2]/span[2]/a"));
			return element;
		 }
	 public static WebElement Wearable_Tech(WebDriver driver){
		    element = driver.findElement(By.xpath("//*[@id='desktopOmniNav']/div[3]/ul/li[1]/div[2]/div/ul/li[1]/div[2]/div/table/tbody/tr[2]/td[3]/span[2]/a"));
			return element;
		 }
	 public static WebElement BYOD(WebDriver driver){
		    element = driver.findElement(By.xpath("//*[@id='desktopOmniNav']/div[3]/ul/li[1]/div[2]/div/ul/li[1]/div[2]/div/table/tbody/tr[2]/td[4]/span[2]/a"));
			return element;
		 }
	 public static WebElement iPhone7(WebDriver driver){
		    element = driver.findElement(By.xpath("//*[@id='desktopOmniNav']/div[3]/ul/li[1]/div[2]/div/ul/li[1]/div[2]/div/table/tbody/tr[3]/td[1]/span[2]/a"));
			return element;
		 }
	 public static WebElement iPhone7plus(WebDriver driver){
		    element = driver.findElement(By.xpath("//*[@id='desktopOmniNav']/div[3]/ul/li[1]/div[2]/div/ul/li[1]/div[2]/div/table/tbody/tr[3]/td[2]/span[2]/a"));
			return element;
		 }
	 public static WebElement What_is_Hum(WebDriver driver){
		    element = driver.findElement(By.xpath("//*[@id='desktopOmniNav']/div[3]/ul/li[1]/div[2]/div/ul/li[2]/div[2]/div/table/tbody/tr/td[1]/span[2]/a"));
			return element;
		 }
	 public static WebElement Shop_Hum(WebDriver driver){
		    element = driver.findElement(By.xpath("//*[@id='desktopOmniNav']/div[3]/ul/li[1]/div[2]/div/ul/li[2]/div[2]/div/table/tbody/tr/td[2]/span[2]/a"));
			return element;
		 }
	 public static WebElement New_vz_plan(WebDriver driver){
		    element = driver.findElement(By.xpath("//*[@id='desktopOmniNav']/div[3]/ul/li[1]/div[2]/div/ul/li[3]/div[2]/div/table/tbody/tr[1]/td[1]/span[2]/a"));
			return element;
		 }
	 public static WebElement prepaidplans(WebDriver driver){
		    element = driver.findElement(By.xpath("//*[@id='desktopOmniNav']/div[3]/ul/li[1]/div[2]/div/ul/li[3]/div[2]/div/table/tbody/tr[1]/td[2]/span[2]/a"));
			return element;
		 }
	 public static WebElement Businessplans(WebDriver driver){
		    element = driver.findElement(By.xpath("//*[@id='desktopOmniNav']/div[3]/ul/li[1]/div[2]/div/ul/li[3]/div[2]/div/table/tbody/tr[1]/td[3]/span[2]/a"));
			return element;
		 }
	 public static WebElement intlservices(WebDriver driver){
		    element = driver.findElement(By.xpath("//*[@id='desktopOmniNav']/div[3]/ul/li[1]/div[2]/div/ul/li[3]/div[2]/div/table/tbody/tr[2]/td[1]/span[2]/a"));
			return element;
		 }
	 public static WebElement Dataonly(WebDriver driver){
		    element = driver.findElement(By.xpath("//*[@id='desktopOmniNav']/div[3]/ul/li[1]/div[2]/div/ul/li[3]/div[2]/div/table/tbody/tr[2]/td[2]/span[2]/a"));
			return element;
		 }
	 public static WebElement Exclusive_apps(WebDriver driver){
		    element = driver.findElement(By.xpath("//*[@id='desktopOmniNav']/div[3]/ul/li[1]/div[2]/div/ul/li[3]/div[2]/div/table/tbody/tr[2]/td[3]/span[2]/a"));
			return element;
		 }
	 public static WebElement Content_transfer(WebDriver driver){
		    element = driver.findElement(By.xpath("//*[@id='desktopOmniNav']/div[3]/ul/li[1]/div[2]/div/ul/li[3]/div[2]/div/table/tbody/tr[3]/td[1]/span[2]/a"));
			return element;
		 }
	 public static WebElement Total_mobile_protection(WebDriver driver){
		    element = driver.findElement(By.xpath("//*[@id='desktopOmniNav']/div[3]/ul/li[1]/div[2]/div/ul/li[3]/div[2]/div/table/tbody/tr[3]/td[2]/span[2]/a"));
			return element;
		 }
	 public static WebElement Casesnprotection(WebDriver driver){
		    element = driver.findElement(By.xpath("//*[@id='desktopOmniNav']/div[3]/ul/li[1]/div[2]/div/ul/li[4]/div[2]/div/table/tbody/tr[1]/td[1]/span[2]/a"));
			return element;
		 }
	 public static WebElement Batterieschargers(WebDriver driver){
		    element = driver.findElement(By.xpath("//*[@id='desktopOmniNav']/div[3]/ul/li[1]/div[2]/div/ul/li[4]/div[2]/div/table/tbody/tr[1]/td[2]/span[2]/a"));
			return element;
		 }
	 public static WebElement Audio(WebDriver driver){
		    element = driver.findElement(By.xpath("//*[@id='desktopOmniNav']/div[3]/ul/li[1]/div[2]/div/ul/li[4]/div[2]/div/table/tbody/tr[1]/td[3]/span[2]/a"));
			return element;
		 }
	 public static WebElement Cartravel(WebDriver driver){
		    element = driver.findElement(By.xpath("//*[@id='desktopOmniNav']/div[3]/ul/li[1]/div[2]/div/ul/li[4]/div[2]/div/table/tbody/tr[1]/td[4]/span[2]/a"));
			return element;
		 }
	 public static WebElement Smarthome(WebDriver driver){
		    element = driver.findElement(By.xpath("//*[@id='desktopOmniNav']/div[3]/ul/li[1]/div[2]/div/ul/li[4]/div[2]/div/table/tbody/tr[2]/td[1]/span[2]/a"));
			return element;
		 }
	 public static WebElement Smartwatches(WebDriver driver){
		    element = driver.findElement(By.xpath("//*[@id='desktopOmniNav']/div[3]/ul/li[1]/div[2]/div/ul/li[4]/div[2]/div/table/tbody/tr[2]/td[2]/span[2]/a"));
			return element;
		 }
	 public static WebElement Sportnfitness(WebDriver driver){
		    element = driver.findElement(By.xpath("//*[@id='desktopOmniNav']/div[3]/ul/li[1]/div[2]/div/ul/li[4]/div[2]/div/table/tbody/tr[2]/td[3]/span[2]/a"));
			return element;
		 }
	 public static WebElement Photography(WebDriver driver){
		    element = driver.findElement(By.xpath("//*[@id='desktopOmniNav']/div[3]/ul/li[1]/div[2]/div/ul/li[4]/div[2]/div/table/tbody/tr[2]/td[4]/span[2]/a"));
			return element;
		 }
	 public static WebElement Gamesntoys(WebDriver driver){
		    element = driver.findElement(By.xpath("//*[@id='desktopOmniNav']/div[3]/ul/li[1]/div[2]/div/ul/li[4]/div[2]/div/table/tbody/tr[3]/td[1]/span[2]/a"));
			return element;
		 }
	 public static WebElement Everyday_essentials(WebDriver driver){
		    element = driver.findElement(By.xpath("//*[@id='desktopOmniNav']/div[3]/ul/li[1]/div[2]/div/ul/li[4]/div[2]/div/table/tbody/tr[3]/td[2]/span[2]/a"));
			return element;
		 }
	 public static WebElement Signal_bosters(WebDriver driver){
		    element = driver.findElement(By.xpath("//*[@id='desktopOmniNav']/div[3]/ul/li[1]/div[2]/div/ul/li[4]/div[2]/div/table/tbody/tr[3]/td[3]/span[2]/a"));
			return element;
		 }
	 public static WebElement Giftcards(WebDriver driver){
		    element = driver.findElement(By.xpath("//*[@id='desktopOmniNav']/div[3]/ul/li[1]/div[2]/div/ul/li[4]/div[2]/div/table/tbody/tr[3]/td[4]/span[2]/a"));
			return element;
		 }
	 public static WebElement Shopdeals(WebDriver driver){
		    element = driver.findElement(By.xpath("//*[@id='desktopOmniNav']/div[3]/ul/li[1]/div[2]/div/ul/li[5]/div[2]/div/table/tbody/tr[1]/td[1]/span[2]/a"));
			return element;
		 }
	 public static WebElement Receive1gb(WebDriver driver){
		    element = driver.findElement(By.xpath("//*[@id='desktopOmniNav']/div[3]/ul/li[1]/div[2]/div/ul/li[5]/div[2]/div/table/tbody/tr[1]/td[2]/span[2]/a"));
			return element;
		 }
	 public static WebElement Stuck(WebDriver driver){
		    element = driver.findElement(By.xpath("//*[@id='desktopOmniNav']/div[3]/ul/li[1]/div[2]/div/ul/li[5]/div[2]/div/table/tbody/tr[1]/td[3]/span[2]/a"));
			return element;
		 }
	 public static WebElement Certifiedpreowned(WebDriver driver){
		    element = driver.findElement(By.xpath("//*[@id='desktopOmniNav']/div[3]/ul/li[1]/div[2]/div/ul/li[5]/div[2]/div/table/tbody/tr[2]/td[1]/span[2]/a"));
			return element;
		 }
	 public static WebElement Emp_discounts(WebDriver driver){
		    element = driver.findElement(By.xpath("//*[@id='desktopOmniNav']/div[3]/ul/li[1]/div[2]/div/ul/li[5]/div[2]/div/table/tbody/tr[2]/td[2]/span[2]/a"));
			return element;
		 }
	 public static WebElement Accessory_bundels(WebDriver driver){
		    element = driver.findElement(By.xpath("//*[@id='desktopOmniNav']/div[3]/ul/li[1]/div[2]/div/ul/li[5]/div[2]/div/table/tbody/tr[2]/td[3]/span[2]/a"));
			return element;
		 }
	 public static WebElement Tv_home_internet(WebDriver driver){
		    element = driver.findElement(By.xpath("//*[@id='desktopOmniNav']/div[3]/ul/li[1]/div[2]/div/ul/li[5]/div[2]/div/table/tbody/tr[3]/td/span[2]/a"));
			return element;
		 }
	 public static WebElement LTEadv(WebDriver driver){
		    element = driver.findElement(By.xpath("//*[@id='desktopOmniNav']/div[3]/ul/li[1]/div[2]/div/ul/li[6]/div[2]/div/table/tbody/tr[1]/td[1]/span[2]/a"));
			return element;
		 }
	 public static WebElement Better_matters(WebDriver driver){
		    element = driver.findElement(By.xpath("//*[@id='desktopOmniNav']/div[3]/ul/li[1]/div[2]/div/ul/li[6]/div[2]/div/table/tbody/tr[1]/td[2]/span[2]/a"));
			return element;
		 }
	 public static WebElement Coveragemap(WebDriver driver){
		    element = driver.findElement(By.xpath("//*[@id='desktopOmniNav']/div[3]/ul/li[1]/div[2]/div/ul/li[6]/div[2]/div/table/tbody/tr[1]/td[3]/span[2]/a"));
			return element;
		 }
	 public static WebElement Smartrewards(WebDriver driver){
		    element = driver.findElement(By.xpath("//*[@id='desktopOmniNav']/div[3]/ul/li[1]/div[2]/div/ul/li[6]/div[2]/div/table/tbody/tr[2]/td[1]/span[2]/a"));
			return element;
		 }
	 public static WebElement Ispu(WebDriver driver){
		    element = driver.findElement(By.xpath("//*[@id='desktopOmniNav']/div[3]/ul/li[1]/div[2]/div/ul/li[6]/div[2]/div/table/tbody/tr[2]/td[2]/span[2]/a"));
			return element;
		 }
	 public static WebElement Referafriend(WebDriver driver){
		    element = driver.findElement(By.xpath("//*[@id='desktopOmniNav']/div[3]/ul/li[1]/div[2]/div/ul/li[6]/div[2]/div/table/tbody/tr[2]/td[3]/span[2]/a"));
			return element;
		 }
	 public static WebElement Apple(WebDriver driver){
		    element = driver.findElement(By.xpath("//*[@id='desktopOmniNav']/div[3]/ul/li[1]/div[2]/div/ul/li[7]/div[2]/div/table/tbody/tr[1]/td[1]/a/img"));
			return element;
		 }
	 public static WebElement Droid(WebDriver driver){
		    element = driver.findElement(By.xpath("//*[@id='desktopOmniNav']/div[3]/ul/li[1]/div[2]/div/ul/li[7]/div[2]/div/table/tbody/tr[1]/td[2]/a/img"));
			return element;
		 }
	 public static WebElement Google(WebDriver driver){
		    element = driver.findElement(By.xpath("//*[@id='desktopOmniNav']/div[3]/ul/li[1]/div[2]/div/ul/li[7]/div[2]/div/table/tbody/tr[1]/td[3]/a/img"));
			return element;
		 }
	 public static WebElement LG(WebDriver driver){
		    element = driver.findElement(By.xpath("//*[@id='desktopOmniNav']/div[3]/ul/li[1]/div[2]/div/ul/li[7]/div[2]/div/table/tbody/tr[2]/td[1]/a/img"));
			return element;
		 }
	 public static WebElement Motorola(WebDriver driver){
		    element = driver.findElement(By.xpath("//*[@id='desktopOmniNav']/div[3]/ul/li[1]/div[2]/div/ul/li[7]/div[2]/div/table/tbody/tr[2]/td[2]/a/img"));
			return element;
		 }
	 public static WebElement Samsung(WebDriver driver){
		    element = driver.findElement(By.xpath("//*[@id='desktopOmniNav']/div[3]/ul/li[1]/div[2]/div/ul/li[7]/div[2]/div/table/tbody/tr[2]/td[3]/a/img"));
			return element;
		 }
	 public static WebElement Gethelpwithyour(WebDriver driver){
		    element = driver.findElement(By.xpath("//*[@id='desktopOmniNav']/div[3]/ul/li[2]/div[2]/div/ul/li[1]/a/span"));
			return element;
		 }
	 public static WebElement Trendingsupporttopics(WebDriver driver){
		    element = driver.findElement(By.xpath("//*[@id='desktopOmniNav']/div[3]/ul/li[2]/div[2]/div/ul/li[2]/a"));
			return element;
		 }
	 public static WebElement Communityforms(WebDriver driver){
		    element = driver.findElement(By.xpath("//*[@id='desktopOmniNav']/div[3]/ul/li[2]/div[2]/div/ul/li[3]/a"));
			return element;
		 }
	 public static WebElement Orderstatus(WebDriver driver){
		    element = driver.findElement(By.xpath("//*[@id='desktopOmniNav']/div[3]/ul/li[2]/div[2]/div/ul/li[4]/a"));
			return element;
		 }
	 public static WebElement Device(WebDriver driver){
		    element = driver.findElement(By.xpath("//*[@id='desktopOmniNav']/div[3]/ul/li[2]/div[2]/div/ul/li[1]/div[2]/div/table/tbody/tr[1]/td[1]/span[2]/a"));
			return element;
		 }
	 public static WebElement Billing_payments(WebDriver driver){
		    element = driver.findElement(By.xpath("//*[@id='desktopOmniNav']/div[3]/ul/li[2]/div[2]/div/ul/li[1]/div[2]/div/table/tbody/tr[1]/td[2]/span[2]/a"));
			return element;
		 }
	 public static WebElement Planaccounts(WebDriver driver){
		    element = driver.findElement(By.xpath("//*[@id='desktopOmniNav']/div[3]/ul/li[2]/div[2]/div/ul/li[1]/div[2]/div/table/tbody/tr[1]/td[3]/span[2]/a"));
			return element;
		 }
	 public static WebElement Serivesnapps(WebDriver driver){
		    element = driver.findElement(By.xpath("//*[@id='desktopOmniNav']/div[3]/ul/li[2]/div[2]/div/ul/li[1]/div[2]/div/table/tbody/tr[2]/td[1]/span[2]/a"));
			return element;
		 }
	 public static WebElement intlservices_support(WebDriver driver){
		    element = driver.findElement(By.xpath("//*[@id='desktopOmniNav']/div[3]/ul/li[2]/div[2]/div/ul/li[1]/div[2]/div/table/tbody/tr[2]/td[2]/span[2]/a"));
			return element;
		 }
	 public static WebElement Troubleshooting(WebDriver driver){
		    element = driver.findElement(By.xpath("//*[@id='desktopOmniNav']/div[3]/ul/li[2]/div[2]/div/ul/li[1]/div[2]/div/table/tbody/tr[2]/td[3]/span[2]/a"));
			return element;
		 }
	 public static WebElement Signin(WebDriver driver){
		    element = driver.findElement(By.xpath("//*[@id='desktopOmniNav']/div[3]/ul/li[3]/div[2]/div/ul/li[1]/a"));
			return element;
		 }
	 public static WebElement Register(WebDriver driver){
		    element = driver.findElement(By.xpath("//*[@id='desktopOmniNav']/div[3]/ul/li[3]/div[2]/div/ul/li[2]/a"));
			return element;
		 }
	 public static WebElement Learnmore(WebDriver driver){
		    element = driver.findElement(By.xpath("//*[@id='desktopOmniNav']/div[3]/ul/li[3]/div[2]/div/ul/li[3]/a"));
			return element;
		 }
	 public static WebElement Smartphones_Hp(WebDriver driver){
		    element = driver.findElement(By.xpath("//*[@id='pageWrapper']/div[3]/div/nav/ul/li[1]/div/a"));
			return element;
		 }
//	 public static By Hptag(WebDriver driver){
//		    element = driver.findElement(By.xpath("li/div/a"));
//			return by;
//		 }
	 public static WebElement Hpself(WebDriver driver){
		    element = driver.findElement(By.className("shelf_list plainList"));
			return element;
		 }
	 public static By Hpselfsingle(WebDriver driver){
		    by = By.className("shelf_item c-shelfItemLI textAlignCenter");
			return by;
		 }
	 public static WebElement signoutCTA(WebDriver driver){
		    element = driver.findElement(By.xpath("//*[@id='vzwsignout']/span"));
			return element;
		 }
	 
}





//public static WebElement Devices(WebDriver driver){
//    element = driver.findElement(By.id("devices"));
//	return element;
//}
//
//public static By Devicetagname(WebDriver driver){
//     by = By.xpath(".//h6/a/span");
//	return by;
//}

//*[@id='pageWrapper']/div[3]/div/nav/ul/li[1]/div/a








//*[@id='pageWrapper']/div[3]/div/nav/ul/li[1]/div/a

//*[@id="pageWrapper"]/div[3]/div/nav/ul/li[2]/div/a




//*[@id="pageWrapper"]/div[3]/div/nav/ul/li[6]/div/a

//*[@id='desktopOmniNav']/div[3]/ul/li[3]/div[2]/div/ul/li[1]/a


//private static   WebElement element = null;
//private static  By by = null;
//
//public static WebElement Devices(WebDriver driver){
//    element = driver.findElement(By.id("devices"));
//	return element;
//}
//
//public static By Devicetagname(WebDriver driver){
//     by = By.xpath(".//h6/a/span");
//	return by;
//}
//
//public static WebElement pages(WebDriver driver){
//    element = driver.findElement(By.xpath(".//div[@class='pagination center margin36 onlyTopMargin clearfix']"));
//	return element;
//}
//
//public static By pagetag(WebDriver driver){
//    by = By.tagName("li");
//	return by;
//}
//public static WebElement next(WebDriver driver){
//    element = driver.findElement(By.linkText("Next"));
//	return element;
//}


