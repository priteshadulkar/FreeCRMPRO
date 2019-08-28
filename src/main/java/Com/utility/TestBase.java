package Com.utility;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestBase {

	static WebDriver driver ;
 
	@Test
	 public void Double() throws Exception
	 {
		 System.setProperty("webdriver.chrome.driver","/home/pritesh/Documents/chromedriver_linux64/chromedriver");;
			driver = new ChromeDriver();
		 driver.navigate().to("http://demo.guru99.com/test/simple_context_menu.html");
        System.out.println("SFKM");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        
        // right click
        
        WebElement el = driver.findElement(By.xpath("//*[text()='Double-Click Me To See Alert']"));
        Actions a = new Actions(driver);
        a.doubleClick(el).perform();
        Thread.sleep(2000);
        System.out.println("Double Clicked has clicked");
        
        
        Alert al =driver.switchTo().alert();
        al.getText();
        al.accept();
        System.out.println("performa double click");
        //=======> Right click
        
        WebElement elb =  driver.findElement(By.xpath("//*[text() ='right click me']"));
        Actions ac = new Actions(driver);
        ac.contextClick(elb).build().perform();
        System.out.println("right clicked");
        driver.findElement(By.xpath("//ul[contains(@class,'context-menu-list context-menu-root')]//following::li[@class='context-menu-item context-menu-icon context-menu-icon-paste']")).click();
        System.out.println("Edit clicked");
        
        
		 
		 
		 
	 }
 
}
