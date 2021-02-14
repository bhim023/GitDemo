package functionaltesting_9;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArrayofProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\v-bhipat\\Desktop\\Selen\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		String[] Itemlist= {"Cucumber", "Brocolli", "Beetroot"};
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		List<WebElement> product = driver.findElements(By.xpath("//h4[@class='product-name']"));
		int j=0;
		for(int i=0; i<=product.size()-1; i++)
			
		{
			//formating of string
			String[] name = product.get(i).getText().split("-");
			String formatedname = name[0].trim();
			//convert array to arraylist
			List<String> Itemslist = Arrays.asList(Itemlist);
			
			
			if (Itemslist.contains(formatedname))
			{
				j++;
				driver.findElements(By.xpath("//button[@type='button']")).get(i).click();
				
				if(j==3)
				{
					break;
				}
			}
		}

	}

}
