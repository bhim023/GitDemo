package pack3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\v-bhipat\\Desktop\\Selen\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://twitter.com/?lang=en");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div/main/div/div/div/div[1]/div/div[3]/a[1]/div")).click();
        
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='name']")).sendKeys("bhim");
		
		driver.findElement(By.xpath("//*[@name='phone_number']")).sendKeys("8900034000");
		
		WebElement rv = driver.findElement(By.xpath("//*[@id='Month']"));
		
		Select s=new Select(rv);
		
		s.selectByIndex(2);
		
		List<WebElement> ele = s.getOptions();
		
		for(int i=0; i<=ele.size()-1; i++)
		{
			String result = ele.get(i).getText();
			
			System.out.println(result);
		}
		
		boolean rv1 = s.isMultiple();
		
		if(rv1==true)
		{
			System.out.println("option is multiselectable");
		}
		else
		{
			System.out.println("option is not multiselectable");
		}
		
		WebElement ele1 = s.getFirstSelectedOption();
		
		String result1 = ele1.getText();
		
		System.out.println(result1);
	}

}
