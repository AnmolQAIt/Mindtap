package Courses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Instructor
{

	WebDriver driver;
	JavascriptExecutor js;
	String instructorname="inst12feb2_1202@swlearning.com";
	String instpassword="A111111";
	
	public Instructor(WebDriver driver)
	{
		this.driver=driver;
	}

	public CourseCreation Login() 
	{
	driver.findElement(By.id("emailId")).sendKeys(instructorname);		
	driver.findElement(By.id("password")).sendKeys(instpassword);
	driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
	implicitwait(10);
	return new CourseCreation(driver);
	}
	
	public void implicitwait(int time)
	{
		driver.manage().timeouts().implicitlyWait(time,TimeUnit.SECONDS);
	}
	
	public void explicit_timeout(int time,WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
}
