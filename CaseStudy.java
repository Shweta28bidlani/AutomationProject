package mavenDemo;

import java.util.NoSuchElementException;

import org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaseStudy {

	public static void main(String[] args) throws InterruptedException {
      
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.saucedemo.com/");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			
			
		
			driver.findElement(By.id("user-name")).sendKeys("standard_user");
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			driver.findElement(By.id("login-button")).click();
			
			try {
				driver.findElement(By.id("react-burger-menu-btn"));
				System.out.println("login successfull...");
				
			}catch(NoSuchElementException e){
				System.out.println("Login failed....");
			}
			

			Thread.sleep(3000);

			driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

						Thread.sleep(2000);

			driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
			Thread.sleep(5000);
				
			driver.findElement(By.id("checkout")).click();
		     Thread.sleep(3000);
		     
		     driver.findElement(By.id("first-name")).sendKeys("Shweta");
		     driver.findElement(By.id("last-name")).sendKeys("Bidlani");
		     driver.findElement(By.id("postal-code")).sendKeys("412101");
		     Thread.sleep(3000);
		     
		     
		     driver.findElement(By.id("continue")).click();
		     Thread.sleep(3000);
		     
		     driver.findElement(By.id("finish")).click();
		     Thread.sleep(3000);
		     
		     try {
		    	 driver.findElement(By.xpath("//h2[@class='complete-header']"));
		    	 System.out.println("Your order placed successfully thank you for shopping");
		    	 
		     }catch (NoSuchElementException e) {
		    	 System.out.println("pleace try againg");
		     }
		     Thread.sleep(3000);
		     driver.quit();
			
	}

}
