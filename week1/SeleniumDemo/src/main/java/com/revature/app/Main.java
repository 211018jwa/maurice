package com.revature.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Main {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8080");
		
		//to pause 
		Thread.sleep(10000);
		
		// Locate the 2 input elements and button for adding numbers
		WebElement addInput1 = driver.findElement(By.id("addNum1"));
		WebElement addInput2 = driver.findElement(By.id("addNum2"));
		WebElement addButton = driver.findElement(By.id("addButton"));
		
		addInput1.sendKeys("10.5");
		addInput2.sendKeys("15.3");
		addButton.click();
		

		driver.switchTo().frame("addResult"); 
		
		WebElement addOutput = driver.findElement(By.tagName("pre")); 
		System.out.println("The result of adding 10.5 and 15.3 is " + addOutput.getText()); 
		

		driver.switchTo().defaultContent(); //This will switch back to the next frame
		//Close the window
		driver.quit();


	}

}