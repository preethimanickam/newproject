package gmail;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErrorPic {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		//to set the path for chrome
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sridvajj\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//opening a new browser
		WebDriver driver=new ChromeDriver();
		//hit the url
		driver.get("https://www.google.com/");
		//maximizing the window
		driver.manage().window().maximize();
		//implicitly wait comment
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		//finding and clicking gmail option
		driver.findElement(By.xpath("//*[@id=\'gbw\']/div/div/div[1]/div[1]/a")).click();
		//finding and clicking the sign_in option
		driver.findElement(By.xpath("/html/body/nav/div/a[2]")).click();
		//finding username box and passing the keys
		driver.findElement(By.id("identifierId")).sendKeys("preethi06134");
		//finding and clicking the next button
		driver.findElement(By.xpath("//*[@id=\'identifierNext\']/content/span")).click();
		//Thread.sleep(2000);
		//finding the password box and passing the keys
		driver.findElement(By.xpath("//*[@id=\'password\']/div[1]/div/div[1]/input")).sendKeys("lalithamanickam");
		Thread.sleep(5000);
		//finding and clicking the next button
		driver.findElement(By.xpath("//*[@id=\'passwordNext\']/content/span")).click();
		Thread.sleep(5000);
		//finding and clicking the compose button
		driver.findElement(By.xpath("//*[@id=\':5p\']/div/div")).click();
		//driver.findElements(By.xpath("//a[@class='rwPopupButton']/span/span[contains(text(), 'COMPOSE')]"));
		//driver.findElement(By.cssSelector("input[name=COMPOSE]"));
		//driver.findElement(By.xpath("//a[text()='COMPOSE']"));
		//driver.findElement(By.xpath("//button[contains(text(),'COMPOSE')]")).click();
		//driver.findElement(By.partialLinkText(" COMPOSE ")).click();
		Thread.sleep(5000);

		//handling the new window
		String winHandleBefore = driver.getWindowHandle();

		// Perform the click operation that opens new window

		// Switch to new window opened
		for(String winHandle : driver.getWindowHandles()){
			driver.switchTo().window(winHandle);
		}
		//finding the receipients and passing the keys
		driver.findElement(By.xpath("//*[@id=\':au\']")).sendKeys("devibala246@gmail.com");
		Thread.sleep(5000);
		//finding and clicking the attach files option
		driver.findElement(By.xpath("//*[@id=\':c0\']")).click();
		Thread.sleep(2000);
		//finding the saved pic in pc
		String filelocation="C:\\intern\\FLEX.jpg";
		StringSelection string =new StringSelection(filelocation);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(string,null);
		//to copy and paste the pic path
		Robot robot= new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(6000);
		//adding the subject
		driver.findElement(By.xpath("//*[@id=\':ad\']")).sendKeys("IAM SHARING ISSUE SCREENSHOT WITH YOU");
		Thread.sleep(6000);
		//finding and clicking the send button
		driver.findElement(By.xpath("//*[@id=\':a3\']")).click();
		System.out.println("picture is successfully uploaded");
	}
}












































