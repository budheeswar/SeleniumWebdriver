package com.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSetUp {

	public void initiateDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\\\ChromeDriver\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // opens chrome

		String url = "https://www.hyrtutorials.com/p/frames-practice.html";
		driver.get(url);

		driver.manage().window().maximize();
	}
}
