import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Eclipse\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//XPATH
		/*
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("josuecn@hotmail.com");
		driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("password");
		driver.findElement(By.xpath("//input[@value=\"Log In\"]")).click();
		*/
		
		//CSS
		driver.findElement(By.cssSelector("input[type=\"email\"]")).sendKeys("josuecn@hotmail.com");
		driver.findElement(By.cssSelector("input[id=\"pass\"]")).sendKeys("password");
		driver.findElement(By.cssSelector("input[value=\"Log In\"]")).click();
	
		
	}

}
