package Courses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class FullCourse 
{
   WebDriver driver;
	public FullCourse(WebDriver driver) 
	{
		this.driver=driver;
	}
	public void closepopup() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Actions actions=new Actions(driver);
		actions.moveToElement(driver.findElement(By.className("close"))).click();
		actions.moveToElement(driver.findElement(By.className("close"))).click();
			System.out.println(driver.getCurrentUrl());
//		js.executeScript("document.getElementsByClassName('close')[0].click()");
//	    js.executeScript("document.getElementsByClassName('close')[0].click()");	
	}

}
