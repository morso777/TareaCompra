package compraAllianz;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestCreditCard {
	
	    @Test
		public static void main(String[] args) throws InterruptedException {
		
		// Create a new instance of the Internet Explorer driver
		String service = "D:\\PROGRAMAS\\Browser driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", service);
		ChromeDriver driver = new ChromeDriver();	 	
		
		 
		// size = driver.findElements(By.tagName("iframe")).size();
		driver.get("https://b2c-es.uat.booking.allianz-assistance.com/iframe.html?angularparams=/TRAVEL/B2C/ES/es_ES/step-1");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		int size =driver.findElements(By.tagName("iframe")).size();
		System.out.println("Total frames in page= "+size );
		 
		driver.switchTo().frame("booking-iframe-id");
		
		//WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[3]/div/div/div/div/form/div[1]/div[2]/button"));
		//Select dropdown = new Select (element);
		
		//Select dropdown = new Select(driver.findElement(By.id("typeOfCover")));
		//Select dropdown = new Select(driver.findElement(By.className("btn dropdown-toggle btn-default")));
		
	
		//(driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[3]/div/div/div/div/form/div[1]/div[2]/button")));
		//Select dropdown = new Select(driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[3]/div/div/div/div/form/div[1]/div[2]")));
		
		//driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[3]/div/div/div/div/form/div[1]/div[2]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[3]/div/div/div/div/form/div[1]/div[2]/button")).click();
		
		//dropdown.selectByVisibleText("Vacaciones");
		//dropdown.selectByIndex(3);
		// driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		//driver.findElement(By.id("submit")).click();
}
}