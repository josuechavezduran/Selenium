import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Hotmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Eclipse\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://outlook.live.com/owa/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
		System.out.println("The page title is: " + driver.getTitle());
		
		//driver.findElement(By.cssSelector("body > header > div > aside > div > nav > ul > li:nth-child(2) > a")).click(); AUTOMATIC GENERATED
		driver.findElement(By.cssSelector("a[data-m*= 'SIGNIN']")).click(); //Created manually
		System.out.println("The page title is: " + driver.getTitle());
		
		//Verify the field to enter username is present
		boolean username=driver.findElement(By.id("i0116")).isEnabled();
		System.out.println("The object username is: " +username);
		if (username==true){
			System.out.println("The id(\"i0116\") field is present: entering data");
			driver.findElement(By.id("i0116")).sendKeys("autoperf@outlook.com");
		}
		else
		{
			System.out.println("The id(\"i0116\") field is not present: terminating execution");
			//driver.quit();
		}
		
		
		//Verify the Next link is present
		boolean Next=driver.findElement(By.id("idSIButton9")).isEnabled();
		System.out.println("The object Next is: " +Next);
		if (Next==true){
			System.out.println("The id(\"idSIButton9\") field is present: entering data");
			driver.findElement(By.id("idSIButton9")).click();
		}
		else
		{
			System.out.println("The id(\"idSIButton9\") field is not present: terminating execution");
			//driver.quit();
		}
		
		
		//Verify the script reached the HOME PAGE				
		boolean Home=driver.findElement(By.id("id__3")).isEnabled();
		System.out.println("The object Home is: " +Home);
		if (Home==true) {
			System.out.println("The id(\"id__3\") field is present: Execution PASSED");
			driver.close();
		}
		else
		{
			System.out.println("The id(\"id__3\") field is not present: Execution FAILED");
			driver.close();
		}

	}

}
