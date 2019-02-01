

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserTest {
	
	public static void main(String[] args) {
		
		
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		
		
		// System.setProperty("webdriver.gecko.driver", projectPath + "\\drivers\\geckodrivers\\geckodriver.exe");
		
		//WebDriver driver = new FirefoxDriver();
		
		 String projectLocation = System.getProperty("user.dir");
		
		 System.setProperty("webdriver.chrome.driver", projectLocation + "\\drivers\\chromedriver\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
		
		//System.setProperty("webdriver.ie.driver", "D:\\JavaProjects\\SeleniumFramework\\drivers\\iedriver\\IEDriverServer.exe");

		//InternetExplorerDriver driver = new InternetExplorerDriver();
		
		driver.get("http://credibll.stage.local/signup");
		
		//WebElement textbox = driver.findElement(By.xpath("//input[@id='signup_fullname']"));
		
	    List<WebElement> listOfInputElements = driver.findElements(By.xpath("//input"));
	    
	    int count = listOfInputElements.size();
	    
	    System.out.println("Count of input elements" + count);
	    
	    
		
		//textbox.sendKeys("Abhishek");
		
		
	}

}
