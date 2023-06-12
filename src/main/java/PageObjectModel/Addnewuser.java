package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AdditonalComponents.Waitforelement;

public class Addnewuser extends Waitforelement{
	public Addnewuser(WebDriver wd) {
		super(wd);
		this.driver=wd;
		PageFactory.initElements(driver, this);
	}
	
	By HRAdministration=By.xpath("//span[contains(text(),'HR Administration')][1]");
	
	By Adduser=By.xpath("//i[contains(text(),'add')]");
	@FindBy(xpath="//*[@id='selectedEmployee_value']")
	  WebElement Employeename;
	
	@FindBy(xpath="//*[@id='user_name']")
	  WebElement Username1;
	@FindBy(xpath="//*[@id='password']")
	  WebElement Password1;
	@FindBy(xpath="//*[@id='confirmpassword']")
	  WebElement confirmpassword;
	
	By submit=By.xpath("//*[@id='modal-save-button']");
	By Saveuser=By.xpath("//*[@class='btn btn-secondary']");
	By Cancel=By.xpath("//*[@class='btn btn-ghost']");
	
	public void Addnewuser(String name,String name2,String password,String password2) {
		waitForElementToAppearAndClick(HRAdministration);
		waitForElementToAppearAndClick(Adduser);
		Employeename.sendKeys(name);
		Username1.sendKeys(name2);
		Password1.sendKeys(password);
		confirmpassword.sendKeys(password2);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 400)");
		waitForElementToAppearAndClick(submit);
		waitForElementToAppearAndClick(Saveuser);
		waitForElementToAppearAndClick(Cancel);
	}

}
