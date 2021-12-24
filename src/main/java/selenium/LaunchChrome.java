package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// done
//ok
		System.setProperty("webdriver.chrome.driver",
				"D:\\Atomation\\Selenium jars and drivers\\Chrome 96\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.guru99.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

}
