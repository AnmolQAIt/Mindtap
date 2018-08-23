package Courses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class courseNaming {
	WebDriver driver;
	String coursename="Course_F_gh12oi";
	String endDate="09/23/2019",startdate="09/23/2018";
	int end;
	public courseNaming(WebDriver driver) {
		this.driver=driver;
	}
	
	public navigateToCourse courseinformation()
	{
		driver.findElement(By.id("courseName")).sendKeys(coursename); 
//		driver.findElement(By.cssSelector(".column45>div:nth-child(1)>div")).click();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//div[@aria-labelledby='ui-datepicker-0-title']//table//td[@aria-selected='true']")).click();
//		date=(String)driver.findElement(By.xpath("//div[@aria-labelledby='ui-datepicker-0-title']//table//td[@aria-selected='true']")).getText();
//		end=Integer.parseInt(date.split("/")[2])+1;
//		endDate=String.valueOf(end);
//		date.split("/")[2].concat(endDate);
//		System.out.println(end);
		
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("document.querySelector('.leftpanel label[for='beginDate']').innerHTML=startdate");
		driver.findElement(By.cssSelector(".leftpanel #beginDate")).sendKeys(startdate);
		driver.findElement(By.cssSelector(".leftpanel #endDate")).sendKeys(endDate);
		driver.findElement(By.cssSelector(".btns_lt .button")).click();
		return new navigateToCourse(driver);
	}

}
