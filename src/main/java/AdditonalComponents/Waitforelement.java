package AdditonalComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitforelement {
	protected WebDriver driver;
	public Waitforelement(WebDriver wd)
	{
		this.driver=wd;
		
		
	}
	public void waitForElementToAppear(By findBy) 
	{
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
		
	}
	public void waitForElementToAppearAndClick(By findBy) 
	{
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(findBy)).click();
		
	}

}
