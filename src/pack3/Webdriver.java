package pack3;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\v-bhipat\\Desktop\\Selen\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		String exp="Facebook";
		
		if (exp.equalsIgnoreCase(title))
		{
			System.out.println("pass");
		}
		else			
		{
			System.out.println("fail");
		}
		
		String url = driver.getCurrentUrl();
		
		System.out.println(url);
		
		Dimension d=new Dimension(400, 500);
		
		driver.manage().window().setSize(d);
		
		Thread.sleep(3000);
		
		Point p=new Point(500, 600);
		
		driver.manage().window().setPosition(p);
		
		

	}

}
