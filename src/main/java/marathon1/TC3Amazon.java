package marathon1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC3Amazon {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bags for b");
		Thread.sleep(1000);
		List<WebElement> searchList = driver.findElements(By.xpath("//div[@class='left-pane-results-container']/div"));
		String listVal;
		for (int i=1;i<=searchList.size();i++) {			
			listVal = driver.findElement(By.xpath("//div[@class='left-pane-results-container']/div["+i+"]")).getText();
			if(listVal.equals("bags for boys")) {
				driver.findElement(By.xpath("//div[@class='left-pane-results-container']/div["+i+"]")).click();
				break;
			}			
		}
		String cnt = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText();
		System.out.println(cnt);
		driver.findElement(By.xpath("(//div[@id='brandsRefinements']//ul[@data-csa-c-slot-id='nav-ref']//a)[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@id='brandsRefinements']//ul[@data-csa-c-slot-id='nav-ref']//a)[2]")).click();
		
		driver.findElement(By.xpath("//span[@class='a-button a-button-dropdown a-button-small']")).click();
		List<WebElement> sortItem = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		
		for(int j=1; j<=sortItem.size(); j++) {
			if(driver.findElement(By.xpath("//ul[@role='listbox']/li["+j+"]")).getText().equals("Newest Arrivals")){
				driver.findElement(By.xpath("//ul[@role='listbox']/li["+j+"]")).click();
			}
		}
		Thread.sleep(2000);
		String detail1 = driver.findElement(By.xpath("((//div[@data-index='3'][contains(@class,'-result-')])//span)[3]")).getText();
//		String detail2 = driver.findElement(By.xpath("((//div[@data-index='3'])[1]//span)[4]")).getText();
		
		String detail2 = driver.findElement(By.xpath("((//div[@data-index='3'][contains(@class,'-result-')])//span)[8]")).getText();
		if(detail2.equals("Deal of the Day")) {
			detail2 = driver.findElement(By.xpath("((//div[@data-index='3'][contains(@class,'-result-')])//span)[9]")).getText();
		}
		
		System.out.println("Product Name: "+detail1);
//		System.out.println("Product Description: "+detail2);
		System.out.println("Product Price: "+detail2);
		System.out.println("Browser Title: "+driver.getTitle());
		
	}
}

//((//div[@data-index='3'][contains(@class,'-result-')])//span)[3]
		
	//	String detail1 = driver.findElement(By.xpath("((//div[@data-index='3'])[1]//span)[3]")).getText();
	//	String detail2 = driver.findElement(By.xpath("((//div[@data-index='3'])[1]//span)[4]")).getText();
	//	String detail3 = driver.findElement(By.xpath("((//div[@data-index='3'])[1]//span)[9]")).getText();