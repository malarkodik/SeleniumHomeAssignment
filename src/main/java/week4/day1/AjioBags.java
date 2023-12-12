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
		driver.manage().window().maximize();

		driver.get("https://www.ajio.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		String search = "//input[@name=\"searchVal\"]";
		String men = "//label[contains(text(),\"Men\")]";
		String fashionBags = "//label[contains(text(),\"Fashion Bags\")]";
		String bagsCnt = "//span[contains(@class,\"price\")]";
		
		driver.findElement(By.xpath(search)).sendKeys("BAGS",Keys.ENTER);
		driver.findElement(By.xpath(men)).click();
		driver.findElement(By.xpath(fashionBags)).click();
		
		List<WebElement> bagsNo = driver.findElements(By.xpath(bagsCnt));
		
		System.out.println("No.of BAGS: "+bagsNo.size());
		

		
		

	}

}
