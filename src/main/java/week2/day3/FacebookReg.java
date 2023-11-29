package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookReg {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Create new account")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Dragon");
		driver.findElement(By.name("lastname")).sendKeys("Hunter");
		driver.findElement(By.name("reg_email__")).sendKeys("Hunter@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Black");
		Select day = new Select(driver.findElement(By.id("day")));
		day.selectByVisibleText("10");
		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText("Jan");
		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByVisibleText("1991");
		
		//WebElement gender = driver.findElement(By.name("_8esa"));
		

	}

}
