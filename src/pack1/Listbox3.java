package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\v-bhipat\\Desktop\\Selen\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://touch.facebook.com/");
		
		driver.findElement(By.xpath("//a[@id='signup-button']")).click();
		
		driver.findElement(By.xpath("//input[@id='firstname_input']")).sendKeys("bhim");
		
		driver.findElement(By.xpath("//input[@id='lastname_input']")).sendKeys("patil");
		
		driver.findElement(By.xpath("//button[@class='_54k8 _8x0i _8x0j _9adg _723k']")).click();
		
		WebElement rv = driver.findElement(By.xpath("//select[@id='day']"));
		 
		Select s=new Select(rv);
		
		//List<WebElement> ele = s.getOptions();
		
		//for(int i=0; i<=ele.size()-1; i++)
		//{
		//	String option=ele.get(i).getText();
			
		//	System.out.println(option);
		//}
		
		//boolean result = s.isMultiple();
		
		//System.out.println(result);
		
		//if (result==true)
		//{
		//	System.out.println("multiple selectable");
		//}
		//else
		//{
		//	System.out.println("single selectable");
		//}
		s.selectByIndex(6);
		List<WebElement> option = s.getAllSelectedOptions();
		String res = option.get(0).getText();
		System.out.println(res);
		

	}

}
