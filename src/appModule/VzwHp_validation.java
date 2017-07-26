package appModule;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class VzwHp_validation {
	static DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy ");
	static Date date = new Date();
	static String today= dateFormat.format(date);
	public static void Execute(WebDriver driver) throws IOException{
		
//		Hp(driver);
//		madlibs(driver);
		Superfooterlink(driver);
		footerlink(driver);
	}
	
	public static void Hp(WebDriver driver) throws IOException{
		
		List<WebElement> hpsize = driver.findElements(By.xpath("//ul[@class='shelf_list plainList']/li"));
		System.out.println(hpsize.size());
		for(int i=1; i<=hpsize.size()-3; i++){
			
			WebElement Hpint = driver.findElement(By.xpath("//*[@id='pageWrapper']/div[4]/div/nav/ul/li["+i+"]/div/a"));
			Hpint.click();
			File Hpint1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(Hpint1, new File("D:\\MSD\\Execution\\Automation\\VZWhp\\"+today+"Hp_self"+i+".jpg"));
			driver.navigate().back();
			}
	}
	public static void madlibs(WebDriver driver) throws IOException{
		for(int i=1; i<=16; i++){
			if (i>4){
				driver.findElement(By.xpath("//*[@id='category1']/div[4]")).click();
				
			}
			WebElement madliblinks = driver.findElement(By.xpath("//*[@id='category1']/div[1]/ul/li["+i+"]/div/h5/a/span[2]"));
			madliblinks.click();
			File madliblinks1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(madliblinks1, new File("D:\\MSD\\Execution\\Automation\\VZWhp\\"+today+"madlibs"+i+".jpg"));
			driver.navigate().back();
			}
	}

	public static void Superfooterlink(WebDriver driver) throws IOException{
		
		List<WebElement> footera = driver.findElements(By.xpath("//*[@id='footerLinks']/div[2]/div/div[1]/ul/li"));
		System.out.println(footera.size());
		 for(int i=1; i<=footera.size()-1; i++){
			
			WebElement footer1 = driver.findElement(By.xpath("//*[@id='footerLinks']/div[2]/div/div[1]/ul/li["+i+"]/a"));
			footer1.click();
			File footer = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(footer, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\VZWhp\\superfooter"+1+""+i+".jpg"));
					
			driver.navigate().back();
		 }
			
		
		List<WebElement> footerb = driver.findElements(By.xpath("//*[@id='footerLinks']/div[2]/div/div[2]/ul/li"));
		System.out.println(footerb.size());
		 for(int j=1; j<=footerb.size()-1; j++){
				
			WebElement footer2 = driver.findElement(By.xpath("//*[@id='footerLinks']/div[2]/div/div[2]/ul/li["+j+"]/a"));
			footer2.click();
			File footer = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(footer, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\VZWhp\\superfooter"+2+""+j+".jpg"));
			driver.navigate().back();
		 }

		List<WebElement> footerc = driver.findElements(By.xpath("//*[@id='footerLinks']/div[2]/div/div[3]/ul/li"));
		System.out.println(footerc.size());
		 for(int k=1; k<=footerc.size(); k++){
					
			WebElement footer3 = driver.findElement(By.xpath("//*[@id='footerLinks']/div[2]/div/div[3]/ul/li["+k+"]/a"));
			footer3.click();
			File footer = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(footer, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\VZWhp\\superfooter"+3+""+k+".jpg"));
			driver.navigate().back();
		 }
		 
		 List<WebElement> footerd = driver.findElements(By.xpath("//*[@id='footerLinks']/div[2]/div/div[4]/ul/li"));
			System.out.println(footerd.size());
			 for(int l=1; l<=footerd.size(); l++){
						
				WebElement footer4 = driver.findElement(By.xpath("//*[@id='footerLinks']/div[2]/div/div[4]/ul/li["+l+"]/a"));
				footer4.click();
				File footer = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(footer, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\VZWhp\\superfooter"+4+""+l+".jpg"));
				driver.navigate().back();
			 }
		}
		
	
	
public static void footerlink(WebDriver driver) throws IOException{
		
		List<WebElement> footera = driver.findElements(By.xpath("//*[@id='footerLinks']/div[3]/div[1]/div[1]/a"));
		System.out.println(footera.size());
		 for(int i=1; i<=footera.size(); i++){
			
			WebElement footer1 = driver.findElement(By.xpath("//*[@id='footerLinks']/div[3]/div[1]/div[1]/a["+i+"]"));
			footer1.click();
			File footer = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(footer, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\VZWhp\\footerlink"+1+""+i+".jpg"));
			driver.navigate().back();
		 	}
		 
		 
		 List<WebElement> footerb = driver.findElements(By.xpath("//*[@id='footerLinks']/div[3]/div[1]/div[2]/a"));
			System.out.println(footerb.size());
			 for(int j=1; j<=footerb.size(); j++){
				
				WebElement footer2 = driver.findElement(By.xpath("//*[@id='footerLinks']/div[3]/div[1]/div[2]/a["+j+"]"));
				footer2.click();
				File footer = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(footer, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\VZWhp\\footerlink"+2+""+j+".jpg"));
				driver.navigate().back();
			 	}
			 
		 List<WebElement> footerc = driver.findElements(By.xpath("//*[@id='footerLinks']/div[3]/div[1]/div[3]/a"));
			System.out.println(footerc.size());
			 for(int l=1; l<=footerc.size(); l++){
					
				WebElement footer3 = driver.findElement(By.xpath("//*[@id='footerLinks']/div[3]/div[1]/div[3]/a["+l+"]"));
				footer3.click();								 
				File footer = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(footer, new File("D:\\MSD\\Execution\\Automation\\"+today+"\\VZWhp\\footerlink"+3+""+l+".jpg"));
				driver.navigate().back();
				 }
		
	}


public static void footericons(WebDriver driver) throws IOException{
	
	List<WebElement> footericons = driver.findElements(By.xpath("//*[@id='footerIcons']/a"));
	System.out.println(footericons.size());
	 for(int i=1; i<=footericons.size(); i++){
		
		WebElement footericon = driver.findElement(By.xpath("//*[@id='footerIcons']/a["+i+"]"));
		footericon.click();
		File footericons1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(footericons1, new File("C:\\MSD\\Execution\\Automation\\"+today+"\\VZWhp\\footericons\\"+i+".jpg"));
		driver.navigate().back();
	 	}
}



	
}



//*[@id="footerLinks"]/div[3]/div[1]/div[1]/a[1]
//*[@id="footerLinks"]/div[3]/div[1]/div[1]/a[2]
//*[@id="footerLinks"]/div[3]/div[1]/div[2]/a[1]
//*[@id="footerLinks"]/div[3]/div[1]/div[3]/a[1]
//*[@id="footerLinks"]/div[3]/div[1]/div[3]/a[3]
//*[@id="footerLinks"]/div[3]/div[1]/div[3]/a[6]

//*[@id="footerIcons"]/a[1]































