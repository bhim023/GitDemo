package pack3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\v-bhipat\\Desktop\\Selen\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		WebElement rv = driver.findElement(By.xpath("//a[contains(text(), 'Gmail')]"));
		
		String title = rv.getText();
		
		System.out.println(title);
		
		rv.click();
		
		//is Displayed//
		WebElement rv1 = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[4]/ul[1]/li[3]/a"));
		
		boolean result = rv1.isDisplayed();
		
		System.out.println(result);
		
		if (result==true)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		 
		rv1.click();
		
		//is Selected//
		Thread.sleep(4000);
		
		boolean result1 = driver.findElement(By.xpath("//input[@class='VfPpkd-muHVFf-bMcfAe']")).isSelected();
		
		System.out.println(result1);
		
		if(result1==true)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		// is enable//
		
		boolean result2 = driver.findElement(By.xpath("//*[@id='headingSubtext']/span")).isEnabled();
	
		System.out.println(result2);
		
		if(result2==true)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		

	}

}
