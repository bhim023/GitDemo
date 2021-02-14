package functionaltesting_9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalanderHandling1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\v-bhipat\\Desktop\\Selen\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.cleartrip.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		driver.manage().deleteAllCookies();;
		
		driver.findElement(By.xpath("//input[@id='DepartDate']")).click();
		
		String flydate="10/July/2022";
		String [] temp=flydate.split("/");
		String dt=temp[0];
		String mt=temp[1];
		String yr=temp[2];
		System.out.println(dt);
		System.out.println(mt);
		System.out.println(yr);
		
		//year
		while(true)
		{			
		String calyear=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']//span[@class='ui-datepicker-year']")).getText();
		System.out.println(calyear);
				
		if(calyear.equals(yr))
		{
			break;
			
		}
		else
		{
			driver.findElement(By.xpath("//a[@class='nextMonth ']")).click();
		}
		}
		// month
		
		String calmonth=driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'])[2]")).getText();
		System.out.println(calmonth);
		
		while(!calmonth.equalsIgnoreCase(mt))
		{
			driver.findElement(By.xpath("//a[@class='nextMonth ']")).click();			
		}
		
		//date
		
		driver.findElement(By.xpath("(//a[@class='ui-state-default '])[2]")).click();
		
	
		
		

	}

}
