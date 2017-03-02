package com.github.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage {
	 public void LoginValidUser(WebDriver driver, String email, String password){
		 driver.findElement(By.id("nim_authSignInUsernameInput")).sendKeys(email,password);
		 driver.findElement(By.id("nim_authSigninSubmitBtn")).click();
	 }
     public void switchToForgotPasswordPage(WebDriver driver){
    	 driver.findElement(By.id("nim_authSignInForgotPasswordLink")).click();	 
     }
     
     public void switchToCreateAccountPage(WebDriver driver){
    	 driver.findElement(By.id("nim_authSignInCreateAccountLink")).click();    
     }
     public void swtichToFaceBookPage(WebDriver driver){
    	 driver.findElement(By.id("nim_authSignInFaceBookLoginBtn")).click();
     }
}
