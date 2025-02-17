package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.pages.HomePage;

import com.qa.pages.TestBase;

public class login extends TestBase{
	
	@FindBy(xpath="(//*[@id='username'])")
	WebElement UN;
	
	@FindBy(xpath="(//input[@id='password'])")
	WebElement PW;
	
	@FindBy(xpath="(//button[contains(text(),'Sign in')])")
	WebElement Signin;
	
	@FindBy(xpath=("(//a[contains(text(),'Sign in')])[1]"))
	WebElement MainSignIn;
	
	@FindBy(xpath=("//div[text()='Dedeepya Sukhavasi']"))
	WebElement name;
	
	
	//Initializing the Page Objects:
	public login(){
		PageFactory.initElements(driver, this);
	}
	
	
	//Actions:
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	
	public boolean Sigin(){
		return  MainSignIn.isDisplayed();
		}

	
	public boolean SigninClick() throws Throwable {
		
		 MainSignIn.click();
		 Thread.sleep(5000);
		 return UN.isDisplayed();
		 }
	
	
	
	public HomePage loginLINK() throws InterruptedException{
		
		UN.sendKeys(prop.getProperty("username"));
		Thread.sleep(5000);
		
		PW.sendKeys(prop.getProperty("password"));
		//loginBtn.click();
		    	JavascriptExecutor js = (JavascriptExecutor)driver;
		    	js.executeScript("arguments[0].click();", Signin);
		    	
		return new HomePage();
	}

}
