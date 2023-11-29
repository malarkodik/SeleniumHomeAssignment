package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLeafPg {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		if (driver.findElement(By.id("logo")).isDisplayed()) {		
			driver.findElement(By.id("username")).sendKeys("demosalesmanager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			
			if(driver.findElement(By.linkText("CRM/SFA")).isDisplayed()) {
				driver.findElement(By.linkText("CRM/SFA")).click();
				if(driver.findElement(By.linkText("My Home")).isDisplayed()) {
					driver.findElement(By.linkText("Leads")).click();
					if(driver.findElement(By.linkText("My Leads")).isDisplayed()) {
						driver.findElement(By.linkText("Create Lead")).click();
						if(driver.findElement(By.linkText("Create Lead")).isDisplayed()) {
							driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
							driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Malarkod");
							driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Karthic");							
						}
					}
				}
			}
		}		

	}

}