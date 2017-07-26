package automation_TC;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Page_Objects.Smartphones_gw;
import appModule.NSEflow;
import appModule.Signin_action;

public class test {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://verizonwireless.com/?mboxDisable=1");
//		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN); 
		WebElement apple = driver.findElement(By.xpath("//*[@id='category1']/div[1]/ul/li[1]/div/h5/a/span[2]"));
//		apple.sendKeys(selectLinkOpeninNewTab);
		
		Actions action= new Actions(driver);
		action.contextClick(apple).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
//		List<WebElement> alldevices = driver.findElements(By.xpath("//*[@id='category1']/div[1]"));
//
//		Iterator<WebElement> itr = alldevices.iterator();
//		while(itr.hasNext()) {
////		    System.out.println(itr.next());
////		}
//		List<WebElement> linkElements = driver.findElements(By.xpath("//*[@id='category1']/div[1]/ul"));
//		System.out.println("The number of links under URL is: "+linkElements.size());
//		
		
		//driver.findElement(By.linkText("Smartphones")).click();
		//driver.findElement(By.xpath(".//div[3]/ul")).getText();
		
		
//		WebElement gnav11 = driver.findElement(By.id("//*[@id='desktopOmniNav']/div[3]/ul"));
//		
//		if (i=1;i=gnav11.size())
//		
//		
//		WebElement gnav2 = driver.findElement(By.xpath(".//div[3]/ul/li[1]"));
//		List<WebElement> gnav1 = gnav11
		
//		NSEflow.Execute(driver);
		
		
		//*[@id="category1"]/div[1]/ul/li[1]/div/p/img
	}

}


//*[@id="category1"]/div[1]/ul/li[1]/div/h5/a/span[2]

//*[@id="category2"]/div[1]/ul/li[1]/div/h5/a/span[2] 13

//*[@id="category1"]/div[1]/ul/li[1]/div/h5/a/span[2]
