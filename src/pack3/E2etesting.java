package pack3;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class E2etesting {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\v-bhipat\\Desktop\\Selen\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@value='HBX'])[2]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active']")).click();
		
		System.out.println(driver.findElement(By.xpath("//div[@id='Div1']")).isEnabled());
		
		System.out.println(driver.findElement(By.xpath("//div[@id='Div1']")).getAttribute("style"));
		
		if((driver.findElement(By.xpath("//div[@id='Div1']")).getAttribute("style").contains("0.5")))
		{
			System.out.println("it is not enabled");
		}
		else
		{
			System.out.println("it is enabled");
		}
		
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		
		WebElement rv = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']"));
		
		Select s=new Select(rv);
		
		s.selectByIndex(3);
		
		WebElement rv1 = driver.findElement(By.xpath("//select[@name='ctl00$mainContent$ddl_Infant']"));
		
		Select s1=new Select(rv1);
		
		s1.selectByIndex(1);
		
		WebElement rv2 = driver.findElement(By.xpath("//select[@name='ctl00$mainContent$DropDownListCurrency']"));
		Select s2=new Select(rv2);
		s2.selectByVisibleText("INR");
		
		System.out.println(driver.findElement(By.xpath("//div[@id='familyandfriend']")).isSelected());
		
		driver.findElement(By.xpath("//div[@id='familyandfriend']")).click();
		
		System.out.println(driver.findElement(By.xpath("//div[@id='familyandfriend']")).isSelected());
		
		Assert.assertFalse(driver.findElement(By.xpath("//div[@id='familyandfriend']")).isSelected());		
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_btn_FindFlights']")).click();

	}

}
