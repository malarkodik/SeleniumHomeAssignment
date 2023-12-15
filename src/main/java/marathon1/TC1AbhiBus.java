package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1AbhiBus {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.abhibus.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys("Chennai");
		Thread.sleep(2000);		
		driver.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("Bangalore");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//a[text()='Tomorrow']")).click();
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		
		driver.findElement(By.xpath("//span[text()='Sleeper']")).click();
		Thread.sleep(2000);

		if (driver.findElement(By.xpath("//span[text()='Sleeper']")).isEnabled()) {
			System.out.println("Sleeper option is selected");
		}else {
			System.out.println("Sleeper option not selected");
		}
		
		String firstTravelName = driver.findElement(By.xpath("(//h5[@class='title'])[1]")).getText();
		System.out.println("First displayed Travel name: "+firstTravelName);
		String noOfSeat = driver.findElement(By.xpath("(//div[contains(@id,'service-operator-select-seat')])[1]/div/small")).getText();
		System.out.println(noOfSeat);
		driver.findElement(By.xpath("(//div[contains(@id,'service-operator-select-seat')])[1]/button")).click();
		Thread.sleep(2000);
				
		if(driver.findElement(By.xpath("(//table[@id='seat-layout-details'])[1]//tr[1]/td[1]")).isEnabled()) {
			//System.out.println(driver.findElement(By.xpath("(//table[@id='seat-layout-details'])[1]//tr[1]/td[1]")).isEnabled());
			driver.findElement(By.xpath("(//table[@id='seat-layout-details'])[1]//tr[1]/td[1]")).click();
		}		
		
		String seatNo = driver.findElement(By.xpath("//div[@id='seating-selected-seat-details']/span[1]")).getText();
		String fare = driver.findElement(By.xpath("//div[@id='seating-selected-seat-details']/span[2]")).getText();
		System.out.println(seatNo);
		System.out.println(fare);
		System.out.println("Browser title: "+driver.getTitle());
			
	}

}


/*
WebElement table = driver.findElement(By.xpath("(//table[@id='seat-layout-details'])[1]"));
		
		List<WebElement> rowCount = table.findElements(By.tagName("tr"));
		List<WebElement> colCount = table.findElements(By.tagName("td"));

for (int i=1; i<=rowCount.size(); i++) {
	for (int j=1; j<=colCount.size(); j++) {
		if(driver.findElement(By.xpath("(//table[@id='seat-layout-details'])[1]//tr["+i+"]/td["+j+"]")).isEnabled()) {
			System.out.println(driver.findElement(By.xpath("(//table[@id='seat-layout-details'])[1]//tr[\"+i+\"]/td[\"+j+\"]")).isEnabled());
			driver.findElement(By.xpath("(//table[@id='seat-layout-details'])[1]//tr[\"+i+\"]/td[\"+j+\"]")).click();
			String seatNo = driver.findElement(By.xpath("(//table[@id='seat-layout-details'])[1]//tr[\"+i+\"]/td[\"+j+\"]")).getText();
			break;
		}
	}			
}*/