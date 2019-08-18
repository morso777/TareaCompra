package compraAllianz;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestCreditCard {

	public static void main(String[] args) throws InterruptedException {
		
		// Create a new instance of the Internet Explorer driver
		String service = "D:\\PROGRAMAS\\Browser driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", service);
		ChromeDriver driver = new ChromeDriver();
	 
		// Put an Implicit wait, 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
		// Launch the URL
		driver.get("https://b2c-es.uat.booking.allianz-assistance.com/iframe.html?angularparams=/TRAVEL/B2C/ES/es_ES/step-1");
}
}