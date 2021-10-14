package testcases;

import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestRelativeLocators {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://way2automation.com/way2auto_jquery/index.php");
		driver.manage().window().maximize();

		driver.findElement(By.name("email")).sendKeys("trainer@way2automation.com");
		// driver.findElement(By.xpath("//*[@id=\"load_form\"]/div/div[2]/input")).click();

		// driver.findElement(RelativeLocator.withTagName("input").toRightOf(By.linkText("Signin"))).click();

		driver.findElement(withTagName("input").below(By.xpath("//*[@id='load_form']/fieldset[7]/input"))).click();

		File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scr, new File("./screenshot/element1.jpg"));
		} catch (IOException e) {

	
			e.printStackTrace();
		}

	}

}
