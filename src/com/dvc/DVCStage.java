package com.dvc;

import org.openqa.selenium.WebDriver;

import com.dvc.date.DatePicker;
import com.dvc.driver.SetUpDVCDriver;
import com.dvc.findoffer.FindOffers;
import com.dvc.login.LoginScreen;
import com.dvc.productselect.ProductClicking;

public class DVCStage {
	public static final String required_month = "August";
	public static final int day = 31;

	public static void main(String[] args) throws InterruptedException {

		String url = "https://stage.dvc-ubi.wdprapps.disney.com/home/486211244567";
		SetUpDVCDriver driverSetUp=new SetUpDVCDriver();
		WebDriver driver = driverSetUp.initiateDriver(url);

        LoginScreen login=new LoginScreen();
        login.doLoginProcess(driver);
		Thread.sleep(10000); // wait for Loading Page

		ProductClicking prodClick=new ProductClicking();
		prodClick.doProductSelecting(driver);

		DatePicker date=new DatePicker();
		date.doDatePicking(driver);
		Thread.sleep(3000);
		
		FindOffers offers= new FindOffers();
		offers.doFindOffers(driver);

		

	}

}
