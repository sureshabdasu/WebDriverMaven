package testcases;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestTabsandPopups {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		System.out.println("First window : "+driver.getTitle());

		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("http://gmail.com");
		
		System.out.println("Second window : "+driver.getTitle());

		driver.findElement(By.linkText("Sign in")).click();
		
		Set<String> winids = driver.getWindowHandles();
		Iterator<String> iterate = winids.iterator();
		
		iterate.next();
		iterate.next();
		String third_window = iterate.next();
		
		driver.switchTo().window(third_window);
		
		System.out.println("Third window : "+driver.getTitle());

		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("http://way2automation.com");
		
		System.out.println("Fourth window : "+driver.getTitle());

		
		driver.close();
		
		driver.switchTo().window(third_window);
		
		driver.close();
		
		
		
	}

}
