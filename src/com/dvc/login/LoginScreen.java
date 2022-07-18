package com.dvc.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginScreen {
	
	public void doLoginProcess(WebDriver driver) throws InterruptedException {
		driver.findElement(By.id("login-username")).sendKeys("TEST119@disney.com"); // username

		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/div/div[1]/mat-card/mat-card-content/app-login/form/div[4]/div/button/span"))
				.click();// next

		Thread.sleep(3000);
		driver.findElement(By.id("login-password")).sendKeys("Mickeyminnie123"); // password

		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/div/div[1]/mat-card/mat-card-content/app-login/form/div[3]/div/button/span"))
				.click(); // LoginWith my ID
		
	}

}
