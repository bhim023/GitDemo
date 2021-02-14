package functionaltesting_9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalanderRedBus {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\v-bhipat\\Desktop\\Selen\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		driver.manage().deleteAllCookies();;
		
		driver.findElement(By.xpath("//span[@class='fl icon-calendar_icon-new icon-onward-calendar icon']")).click();
		
		String yr="Feb 2022";
		String dt="8";
				
		//year
		while(true)
		{			
		String calyear=driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
		System.out.println(calyear);
				
		if(calyear.equals(yr))
		{
			break;
			
		}
		else
		{
			driver.findElement(By.xpath("//td[@class='next']")).click();
		}
		}
		
		//date
		
		List<WebElement> dates = driver.findElements(By.xpath("//div[@id='rb-calendar_onward_cal']//table[1]//td"));
		
		int size1 = dates.size();
		
		for(int i=0; i<=size1-1; i++ )
		{
			String dat = dates.get(i).getText();
			if(dat.equals(dt))
			{
				dates.get(i).click();
				break;
			}
		}
	
		
		

	}

}
