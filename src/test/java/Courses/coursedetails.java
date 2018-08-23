package Courses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class coursedetails
{
WebDriver driver;
	public coursedetails(WebDriver driver) 
	{
		this.driver=driver;
	}

	public courseNaming selectCourseType()
	{
		driver.findElement(By.cssSelector("label[for='createNewCourse']")).click();
		driver.findElement(By.className("button")).click();
		return new courseNaming(driver);
	}
}
