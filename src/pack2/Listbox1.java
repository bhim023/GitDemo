package pack2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\v-bhipat\\Desktop\\Selen\\chromedriver_win32 (2)\\chromedriver.exe");
				
		WebDriver driver=new ChromeDriver();
				
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[@id='u_0_2']")).click();
		
		Thread.sleep(5000);
		
		WebElement rv = driver.findElement(By.xpath("//*[@id='day']"));
		
		Thread.sleep(2000);
		
		Select s=new Select(rv);
		
		List<WebElement> elem = s.getOptions();
		
		int number = elem.size();
		
		System.out.println(number);
		
		for(int i=0; i>=elem.size()-1; i++)
		{
			String result = elem.get(i).getText();
			
			System.out.println(result);
		}
		
		
		

	}

}
