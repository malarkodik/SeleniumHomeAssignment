package marathon1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC2PVRCinemas {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//img[@alt='Chennai']")).click();
		driver.findElement(By.xpath("//div[@class='nav-icon']")).click();
		driver.findElement(By.xpath("//a[text() = 'Movie Library']")).click();
		Thread.sleep(3000);
		Select city = new Select(driver.findElement(By.xpath("//select[@name='city']")));
		city.selectByVisibleText("Chennai");
		Select genre = new Select(driver.findElement(By.xpath("//select[@name='genre']")));
		genre.selectByVisibleText("ANIMATION");
		Select lang = new Select(driver.findElement(By.xpath("//select[@name='lang']")));
		lang.selectByVisibleText("ENGLISH");
		
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		Thread.sleep(4000);
		String movieName = driver.findElement(By.xpath("//div[@class='movie-list']/div[1]")).getText();
		System.out.println("Selected Movie name: "+movieName);
		driver.findElement(By.xpath("//div[@class='movie-list']/div[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();
		
		Select cinemaName = new Select(driver.findElement(By.xpath("//select[@name='cinemaName']")));
		cinemaName.selectByVisibleText("PVR Heritage RSL ECR Chennai");
		
		driver.findElement(By.xpath("//div[@class='datepicker-container datepicker-default']")).click();
		
		List<WebElement> spanElement = driver.findElements(By.xpath("//div[@class='main-calendar-days']/span"));
		
		for (int i=1; i<=spanElement.size(); i++) {
			String classVal = driver.findElement(By.xpath("//div[@class='main-calendar-days']/span["+i+"]")).getAttribute("class");
			if(!classVal.contains("disabled")) {
				driver.findElement(By.xpath("//div[@class='main-calendar-days']/span["+i+"]")).click();
				break;
			}
		}		
		
		driver.findElement(By.xpath("//input[@name='noOfTickets']")).sendKeys("4");
		Select timings = new Select(driver.findElement(By.xpath("//select[@name='timings']")));
		timings.selectByVisibleText("09:00 AM - 12:00 PM");
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Malarkodi");
		driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("9990099909");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("malarkodi.k@gmail.com");
		Select food = new Select(driver.findElement(By.xpath("//select[@name='food']")));
		food.selectByVisibleText("No");
		driver.findElement(By.xpath("//input[@name='comment']")).sendKeys("NA");
		driver.findElement(By.xpath("//label[@class='custom-control custom-radio']")).click();
		driver.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();
		
		WebElement alert1 = driver.findElement(By.xpath("//bs-modal[@class='otp-modal animated fadeInUp modal in'][contains(@style,'display:')]"));
		
		if (alert1.isEnabled()) {
			driver.findElement(By.xpath("(//button[text()='CANCEL'])[2]")).click();
			System.out.println("OTP Dialog is closed");
		}
		
		System.out.println("Browser Title: "+driver.getTitle());		
	}
}
