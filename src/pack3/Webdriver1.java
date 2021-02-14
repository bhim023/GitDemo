package pack3;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver1 {

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
		
		Dimension d=new Dimension(400, 500);
		
		driver.manage().window().setSize(d);
		
		Thread.sleep(2000);
		Point p=new Point(300, 200);
		
		driver.manage().window().setPosition(p);
		
		String rv = driver.getTitle();
		
		System.out.println(rv);
		
		String rv1 = driver.getCurrentUrl();
		
		System.out.println(rv1);
		
		Thread.sleep(2000);
		
		driver.close();
		
		
		

	}

}
