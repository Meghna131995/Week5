package TestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import AdditonalComponents.Waitforelement;
import PageObjectModel.Loginpage;
import PageObjectModel.Logout;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcases {
	WebDriver driver;
	  @BeforeSuite
	  public void beforeSuite() {
		  WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
		  driver.navigate().to("https://meghnasuresh-trials79.orangehrmlive.com");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  
		  }
	  @BeforeTest
	  public void Login() {
		  Loginpage loginApplication=new Loginpage(driver);
		  loginApplication.Loginpage("Admin","@PHPLkub73");  
	  }
	  
	  
	  @Test(enabled=true)
	  public void Addnewuser() {
		  PageObjectModel.Addnewuser HRAdministration=new PageObjectModel.Addnewuser(driver);
		  HRAdministration.Addnewuser("Adella Lopez", "Meghna", "Meghna", "meghna@12345");
		  
		  Logout logout=new Logout(driver);
		  logout.Logout();
	  }
  
}
