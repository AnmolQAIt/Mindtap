package Courses;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class navigateToCourse {

	WebDriver driver;
	String ParentWindow;
	public static String subwindow;
	public navigateToCourse(WebDriver driver) 
	{
		this.driver=driver;
	}

	public FullCourse navigate()
	{   	
	driver.findElement(By.xpath("//div[@class='confirmRow'][1]//a")).click();
	  Set<String>handles=driver.getWindowHandles();
	  Iterator itr=handles.iterator();
	  while(itr.hasNext())
	  {
		  subwindow=(String) itr.next();
	  }
	
	driver.switchTo().window(subwindow);   
	return new FullCourse(driver);
	}
	
	
}
