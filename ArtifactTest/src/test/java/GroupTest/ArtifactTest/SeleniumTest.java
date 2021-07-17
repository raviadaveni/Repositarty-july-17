package GroupTest.ArtifactTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class SeleniumTest {
	ExtentReports extent;
	@BeforeTest
	public void config()
	{
		String path =System.getProperty("user.dir")+ "\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automation Results");
		reporter.config().setDocumentTitle("Test Results");
		
		 extent = new  ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Ravi");
		
	}
	
	@Test
	public void openbrowser()
	{
		extent.createTest("Initial Demo");
		System.out.println("Logic for open browser");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.nopcommerce.com/");
		System.out.println(driver.getTitle());
		extent.flush();
		
	}
	
	

}
