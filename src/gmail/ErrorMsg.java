package gmail;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErrorMsg {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sridvajj\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\'gbw\']/div/div/div[1]/div[1]/a")).click();
		driver.findElement(By.xpath("/html/body/nav/div/a[2]")).click();
		driver.findElement(By.id("identifierId")).sendKeys("preethi06134");
		driver.findElement(By.xpath("//*[@id=\'identifierNext\']/content/span")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\'password\']/div[1]/div/div[1]/input")).sendKeys("lalithamanickam");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\'passwordNext\']/content/span")).click();
		driver.findElement(By.xpath("//*[@id=\':5p\']/div/div")).click();


		String winHandleBefore = driver.getWindowHandle();

		// Perform the click operation that opens new window

		// Switch to new window opened
		for(String winHandle : driver.getWindowHandles()){
			driver.switchTo().window(winHandle);
		}


		driver.findElement(By.xpath("//*[@id=\':au\']")).sendKeys("sadhanaramajeyam@gmail.com");
		driver.findElement(By.xpath("//*[@id=\':be\']")).sendKeys("hello mam........................");
		driver.findElement(By.xpath("//*[@id=\':a3\']")).click();
		System.out.println("message is successfully send");






	}

}
