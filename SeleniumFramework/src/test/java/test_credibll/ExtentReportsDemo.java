package test_credibll;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import pages.CredibllSignupPage;

public class ExtentReportsDemo {
	
	private static WebDriver driver = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // start reporters
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
    
        // create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        
     // creates a toggle for the given test, adds all log events under it    
        ExtentTest test1 = extent.createTest("Credibll Sign Up page", "Candidate Sign up page");
        
        String projectLocation = System.getProperty("user.dir");
		
		 System.setProperty("webdriver.chrome.driver", projectLocation + "\\drivers\\chromedriver\\chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();
		 
		 test1.log(Status.INFO, "Starting Test case");
		 
         //go to Credibll Sign Up Page
		 
		 driver.get("http://credibll.stage.local/signup");
		 
		 
		 test1.pass("Navigated to the Credibll Sign up page");
		 
		 
		 
		 
		 
		
		 
		 //Enter name in the candidate name
		 
		 CredibllSignupPage.name_textbox(driver).sendKeys("Abhishek Tiwary");
		 test1.pass("Entering Candidate Name");
		 
		 CredibllSignupPage.email_textbox(driver).sendKeys("abhishek33@radiansys.com");
		 test1.pass("Entering Email address");
		 
		 CredibllSignupPage.password_textbox(driver).sendKeys("rsys506506");
		 test1.pass("Entering Password");
		 
		 CredibllSignupPage.location_textbox(driver).sendKeys("Sanfrancisco");
		 test1.pass("Entering Location");
		 
		 CredibllSignupPage.mobile_textbox(driver).sendKeys("7732850867");
		 test1.pass("Entering Contact");
		 
		 
		 // Check the Captcha
		 //driver.findElement(By.id("checkbox_id")).click();
		 
		 //click on search button
		 CredibllSignupPage.btn_submit(driver).click();
		 test1.pass("Pressed Submit Button");
		 
		 
		 
		 System.out.println("Test Completed Successfully");
		 
		 test1.pass("Submit Successfully");
		 
		 test1.pass("Completed");
		 
		 
		 extent.flush();

	}

}
