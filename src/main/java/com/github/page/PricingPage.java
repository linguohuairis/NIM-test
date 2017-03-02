package com.github.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PricingPage {
	public void startBasicTrial(WebDriver driver){
		driver.findElement(By.xpath("//*[@id=\"NIMPricingGrid_Light-desktop-0\"]/section/div/table/tfoot/tr/td[2]/a")).click();
	}
	public void startPremiumTrial(WebDriver driver){
		driver.findElement(By.xpath("//*[@id=\"NIMPricingGrid_Light-desktop-0\"]/section/div/table/tfoot/tr/td[3]/a")).click();
	}
	
}
