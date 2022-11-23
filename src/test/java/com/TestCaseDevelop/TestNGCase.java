package com.TestCaseDevelop;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGCase {
	@Test
	public void TC1() throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("https://demoqa.com/");
			Thread.sleep(2000);
			((JavascriptExecutor) driver).executeScript("scroll(0,300)");
			

			driver.findElement(By.xpath("//h5[text()='Elements']")).click();
			Thread.sleep(2000);
			driver.findElement(By.className("text")).click();
			Thread.sleep(5000);
			driver.close();
	}
	

}
