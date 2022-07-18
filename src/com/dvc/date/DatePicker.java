package com.dvc.date;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DatePicker {
	public static final String required_month = "August";
	public static final int day = 31;
	
	public void doDatePicking(WebDriver driver) throws InterruptedException {
		String dateq = "return document.querySelector(\"#arrival-date\").shadowRoot.querySelector(\"#editable-input-container > wdpr-input\").shadowRoot.querySelector(\"#button-container > button > i\")";
		WebElement date = (WebElement) ((JavascriptExecutor) driver).executeScript(dateq);
		date.click();

		while (true) {
			// getting month element
			String monthquery = "return document.querySelector(\"#arrival-date\").shadowRoot.querySelector(\"#calendar-container > div.calendar-header > span > span.month\")";
			WebElement monthelement = (WebElement) ((JavascriptExecutor) driver).executeScript(monthquery);
			String current_month = monthelement.getText();

			System.out.println("current Month " + current_month);
			if (current_month.equals("August") == true) {
				break;
			}
			Thread.sleep(2000);
			// getting Element of pre-month clicking button ->HardCoded
			String premonthquery = "return document.querySelector(\"#arrival-date\").shadowRoot.querySelector(\"#calendar-container > div.calendar-header > button:nth-child(1)\")";
			WebElement prevMonthElement = (WebElement) ((JavascriptExecutor) driver).executeScript(premonthquery);
			prevMonthElement.click();
		}
		Thread.sleep(2000);

		// getting day Element
		String dayq = "return document.querySelector(\"#arrival-date\").shadowRoot.querySelector(\"#calendar-container > div.calendar-body > div.calendar > div:nth-child(26) > div\")";
		WebElement dayElement = (WebElement) ((JavascriptExecutor) driver).executeScript(dayq);
		dayElement.click();
	}
	

}
