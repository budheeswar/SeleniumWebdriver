package com.dvc.findoffer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FindOffers {

	public void doFindOffers(WebDriver driver) throws InterruptedException {
		// clicking find offer
		driver.findElement(By.id("initiate-btn")).click();
		System.out.println("Find Offer Completed");
		Thread.sleep(10000);

		List<Integer> list = new ArrayList<>();
		this.iteratingOffers(driver, list);

		System.out.println("before Sorting " + list);
		Collections.sort(list);
		System.out.println("After Sorting " + list);
		int lowValue = list.get(0);
		this.clickOffer(driver, lowValue);

	}

	public void iteratingOffers(WebDriver driver, List<Integer> list) throws InterruptedException {
		String pointsValue = "";

		int j = 1;
		for (int i = 1; i <= 5; i++) {

			Thread.sleep(2000);
			WebElement offerEl = driver.findElement(By.xpath(
					"/html/body/app-root[1]/div/app-offers-display/div/main/app-offers-list/section[1]/div/div[1]/div/div["
							+ i + "]"));
			Thread.sleep(3000);
			offerEl.click();
			Thread.sleep(8000);
			// get Points
			pointsValue = driver.findElement(By.xpath(
					"/html/body/app-root[1]/div/app-offers-display/div/main/app-offers-list/section[1]/div/div[1]/div/div["
							+ i + "]/div[1]/div/div[2]/span[1]/span[" + j + "]"))
					.getText();

			j = 2;
			System.out.println("Offer " + i + " is " + pointsValue);
			String value = pointsValue.replace("pts", "");
			int points = Integer.parseInt(value);
			list.add(points);

		}

	}

	public void clickOffer(WebDriver driver, int lower) throws InterruptedException {
		String pointsValue = "";

		int j = 1;
		for (int i = 1; i <= 5; i++) {
			// get Points
			Thread.sleep(2000);
			WebElement offerEl = driver.findElement(By.xpath(
					"/html/body/app-root[1]/div/app-offers-display/div/main/app-offers-list/section[1]/div/div[1]/div/div["
							+ i + "]"));
			Thread.sleep(3000);
			offerEl.click();
			Thread.sleep(8000);

			pointsValue = driver.findElement(By.xpath(
					"/html/body/app-root[1]/div/app-offers-display/div/main/app-offers-list/section[1]/div/div[1]/div/div["
							+ i + "]/div[1]/div/div[2]/span[1]/span[" + j + "]"))
					.getText();

			j = 2;
			System.out.println("Offer " + i + " is " + pointsValue);
			String value = pointsValue.replace("pts", "");
			int points = Integer.parseInt(value);
			if (points == lower) {
				driver.findElement(By.id("continue-btn"));
				Thread.sleep(4000);
			}
		}
	}

}
