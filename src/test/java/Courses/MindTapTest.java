package Courses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MindTapTest
{

	WebDriver driver;
	JavascriptExecutor js;
	Instructor inst;
	CourseCreation course;
	coursedetails cd;
	courseNaming coursename;
	navigateToCourse nc;
	FullCourse fc;
	
	@BeforeClass
	public void invoke()
	{
		driver=new ChromeDriver();
		driver.get("https://s-www.cengage.com/dashboard/#/login");
		inst=new Instructor(driver);
	}
	
	@Test(priority=1)
	public void LoginAsInstructor()
	{
		course=inst.Login();
	}
	
	@Test(priority=2)
	public void coursedetail()
	{
		cd=course.createCourse();
	}
	
	@Test(priority=3)
	public void coursetype()
	{
		coursename=cd.selectCourseType();
	}
	
	@Test(priority=4)
	public void courseinfo()
	{
		
			nc=coursename.courseinformation();		
	}
	
	@Test(priority=5)
	public void navigateToCourse()
	{
	   fc=nc.navigate();
	}
	
//	@Test(priority=6)
//	public void fullcourse() throws InterruptedException
//	{
//		fc.closepopup();
//	}
	
}
