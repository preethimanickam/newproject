package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trial {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sridvajj\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://filehosting.org/");
		driver.manage().window().maximize();
		
		WebElement choosefile=driver.findElement(By.name("upload_file"));
		choosefile.click();
		
		Thread.sleep(2000);
		String filelocation="C:\\intern\\FLEX.jpg";
		StringSelection string =new StringSelection(filelocation);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(string,null);
		
		
		Robot robot= new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		WebElement choosefile1=driver.findElement(By.name("uploader_email"));
	    choosefile1.sendKeys("devibala246@gmail.com");
	    
	    WebElement choosefile2=driver.findElement(By.name("accept_tos"));
		choosefile2.click();
		
		
		WebElement choosefile3=driver.findElement(By.name("submit"));
		choosefile3.click();}}