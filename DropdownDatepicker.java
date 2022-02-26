package exercises;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownDatepicker {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\MEGHALA\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='dob']")).click();
		
		WebElement month=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select mon=new Select(month);
		mon.selectByValue("8");
		WebElement year=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select yr=new Select(year);
		yr.selectByValue("2021");
		
		String date="29";
		
		List<WebElement> table=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		
		for(WebElement dt:table) {
		String day=dt.getText();
		
		if(day.equals(date)) {
		dt.click();
		break;
			xy;
		}
		}
				}
	}


