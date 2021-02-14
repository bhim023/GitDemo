package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\v-bhipat\\Desktop\\Selen\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://en.wikipedia.org/wiki/Table_of_specific_heat_capacities");
		
		int row = driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter'][1]//tr")).size();
		
		System.out.println("No. of row:"+ row);
		
		int col = driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter'][1]//td[2]")).size();
		
		System.out.println("No. of coloumn"+ col);
		
		

		
	}

}
