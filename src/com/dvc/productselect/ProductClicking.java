package com.dvc.productselect;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductClicking {
	
	public void doProductSelecting(WebDriver driver) throws InterruptedException {
		String query = "return document.querySelector('#childProduct').shadowRoot.querySelector('#inputContainer > i')";
		WebElement dropdown = (WebElement) ((JavascriptExecutor) driver).executeScript(query);
		dropdown.click();

		// WebElement el1= (WebElement) ((JavascriptExecutor)
		// driver).executeScript(query);
		Thread.sleep(3000);
		System.out.println("tag name " + dropdown.getTagName());

		String query1 = "return document.querySelector(\"#childProduct\").shadowRoot.querySelector(\"#b1322837947 > div\")";
		WebElement product = (WebElement) ((JavascriptExecutor) driver).executeScript(query1);
		product.click();
	}

}
