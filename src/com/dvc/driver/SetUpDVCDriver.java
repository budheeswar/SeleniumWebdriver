package com.dvc.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetUpDVCDriver {
	
	public WebDriver initiateDriver(String url) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\ChromeDriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // opens chrome
		
		driver.get(url);
		Thread.sleep(3000);
		driver.manage().window().maximize();
		return driver;
		
	}

}
