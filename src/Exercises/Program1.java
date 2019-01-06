package Exercises;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Program1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\anand\\Desktop\\Programs\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://juliemr.github.io/protractor-demo/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());

		driver.findElement(By.xpath("//input[@ng-model='first']")).sendKeys("453");
		driver.findElement(By.xpath("//input[@ng-model='second']")).sendKeys("5874");

		Select sel = new Select(driver.findElement(By.xpath("//select[@ng-model='operator']")));
		sel.selectByIndex(3);
		driver.findElement(By.tagName("button")).click();
		
		System.out.println(" Testing is completed !!");
		
		
	}
}
