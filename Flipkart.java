package Flipkart;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Flipkart {
	public WebDriver driver;

	String parentWindow;
	
@BeforeMethod(groups= {"Add", "Remove"})
public void Open() {
	System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\Selenium\\Chrome - Required things\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.flipkart.com/");
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	String username = FlipkartCredentials.username();
	String password = FlipkartCredentials.password();

	WebElement userid = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
	userid.sendKeys(username);
	WebElement pass =driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
	pass.sendKeys(password);
	WebElement Login = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
	Login.click();
	System.out.println("Login Successful");
}

@Test(groups = "Add")
public void AddToCart() throws InterruptedException {
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	WebElement searchbox = driver.findElement(By.xpath("//input[@class = '_3704LK']"));
	searchbox.sendKeys("POCO X3 (Shadow Gray, 64 GB)  (6 GB RAM)");

	WebElement searchbtn = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
	searchbtn.click();
	
	parentWindow = driver.getWindowHandle();// stores parent window
	
	WebElement searchelement = driver.findElement(By.xpath("//div[@class='_4rR01T' and contains(text(),'POCO X3 (Shadow Gray, 64 GB)')]"));
	searchelement.click();
	System.out.println("Search Successful");
	Set<String> allwindows = driver.getWindowHandles(); // will make set of all windows
	//System.out.println(allwindows.size());
	allwindows.remove(parentWindow);
	
	Iterator<String> it = allwindows.iterator(); // to iterate through all the windows 
	//it.next(); //on parent window
	driver.switchTo().window(it.next()); // moving to child window

	WebElement gb =driver.findElement(By.xpath("//a[@class='_1fGeJ5']"));
	gb.click();
		
	WebElement pincode = driver.findElement(By.xpath("//input[@class='_36yFo0']"));
	WebElement changepincode = driver.findElement(By.xpath("//span[@class='_2P_LDn']"));
	
	Actions action = new Actions(driver);
	action.click(pincode)
	.keyDown(Keys.CONTROL)
	.sendKeys("a")
	.keyUp(Keys.CONTROL)
	.sendKeys(Keys.BACK_SPACE)
	.sendKeys("431001")
	.build()
	.perform();
	
	changepincode.click();
	
	WebElement cart1 = driver.findElement(By.xpath("//div[@id ='container']//following::button[@class ='_2KpZ6l _2U9uOA _3v1-ww']"));
//	JavascriptExecutor js = (JavascriptExecutor)driver;
//	js.executeScript("arguments[0].click();", cart1);
	cart1.click();
	System.out.println("Add to cart Successful");

}

@Test (groups= {"Remove"})
public void RemoveFromCart() throws InterruptedException {
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	WebElement cart = driver.findElement(By.xpath("//span[contains(text(),'Cart')]"));
	cart.click();
	WebElement remove = driver.findElement(By.xpath("//div[contains(text(),'Remove')]"));
	remove.click();
	WebElement remove1 = driver.findElement(By.xpath("//div[@class='_3dsJAO _24d-qY FhkMJZ' and contains(text(),'Remove')]"));
	remove1.click();
	System.out.println("Product removal Successful");
}

@AfterMethod(groups= {"Add", "Remove"})
public void Close() throws InterruptedException {
	
	System.out.println("Driver closed");
	
	driver.quit();
	
}
}
