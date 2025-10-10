package _04_Parameter_Invocation_Count_TimeOut;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class _01_Invocation_Count {
	
		@Test(invocationCount = 3)
		public void InvocationCounts() throws InterruptedException {
			ChromeDriver driver =  new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.navigate().to("https://www.bing.com/");
			
			WebElement Search = driver.findElement(By.xpath("//*[@id=\"sb_form_q\"]"));
			Thread.sleep(2000);
			Search.sendKeys("cricket", Keys.ENTER);
			
		
			List<WebElement> crickets = driver.findElements(By.xpath("//*[contains(text(),'cricket') or contains(text(),'Cricket')]"));
			System.out.println(crickets.size());
			
		}
}
