package Courses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CourseCreation 
{
WebDriver driver;
	
public CourseCreation(WebDriver driver) 
{
this.driver=driver;		
}

public coursedetails createCourse()
{
	driver.findElement(By.cssSelector("div[class='courseManage']>div:nth-child(2)>a")).click();
    return new coursedetails(driver);
}
}
