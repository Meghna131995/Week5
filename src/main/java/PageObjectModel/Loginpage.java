package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AdditonalComponents.Waitforelement;

public class Loginpage extends Waitforelement{
	public Loginpage(WebDriver wd) {
		super(wd);
		this.driver=wd;
		PageFactory.initElements(driver, this);
	}
   @FindBy(xpath="//*[@id='txtUsername']")
   WebElement Username;
   
   @FindBy(xpath="//*[@id='txtPassword']")
   WebElement Password;
   
   @FindBy(xpath="//*[@type='submit']")
   WebElement Login;
   
   By login=By.xpath("//*[@type='submit']");
   public void Loginpage(String name,String password) {
	   Username.sendKeys(name);
	   Password.sendKeys(password);
	   waitForElementToAppear(login);
	   Login.click();
   }
	

}
