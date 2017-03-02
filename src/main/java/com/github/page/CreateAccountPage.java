package com.github.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccountPage {

	public void createValidAccount(WebDriver driver, String email, String password){
		driver.findElement(By.id("nim_authCreateAcctUsernameInput")).sendKeys(email);
		driver.findElement(By.id("nim_authCreateAcctPasswordInput")).sendKeys(password);
		driver.findElement(By.id("nim_authCreateAcctSubmitBtn")).click();		
	}
	
	public void switchToSignInPage(WebDriver driver){
		driver.findElement(By.id("nim_authCreateAcctSignInLink")).click();
	}
}
