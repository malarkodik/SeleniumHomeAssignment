package week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class AjioBags {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
				
		String search = "//input[@name=\"searchVal\"]";
		String men = "//label[contains(text(),\"Men\")]";
		String fashionBags = "//label[contains(text(),\"Utility Bags\")]";
		String bagsCnt = "//span[contains(@class,\"price\")]";
		
		driver.findElement(By.xpath(search)).sendKeys("BAGS",Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath(men)).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath(fashionBags)).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		List<WebElement> bagsNo = driver.findElements(By.xpath(bagsCnt));
		
		System.out.println("No.of BAGS: "+bagsNo.size());
		

		
		

	}

}
