package grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestStandalone {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {


		//WebDriverManager.edgedriver().setup();
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\WAY2AUTOMATION\\Downloads\\Compressed\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444"),new FirefoxOptions());
		//WebDriver driver = new EdgeDriver();
		driver.get("http://google.com");
		Thread.sleep(10000);
		driver.quit();
		
	}

}
