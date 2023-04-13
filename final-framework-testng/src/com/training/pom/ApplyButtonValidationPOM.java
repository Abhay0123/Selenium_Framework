package com.training.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ApplyButtonValidationPOM {
	private WebDriver driver; 
	
	public ApplyButtonValidationPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@class='hc_go-ad-free']")
	private WebElement addFreeBtn;
	
	@FindBy(xpath="//input[@placeholder='Got any coupon code?']")
	private WebElement inputTag;
	
	@FindBy(xpath="//*[text()='APPLY']")
	private WebElement ApplyButton;
	
	
	@FindBy(xpath="//div[@class='google']")
	private WebElement continueWithGoogle;
	
	String coupon = "mxplayer123";
	
	public void applyButtonValidation() {
		
		this.addFreeBtn.click();
        this.inputTag.sendKeys(coupon);
        this.ApplyButton.click();
		
		
		if(continueWithGoogle.getText().equals("Login")) {
			System.out.println("Apply Button is working fine");
		}else {
		    System.out.println("Apply Button is not working fine");
		}
		    
	    } 
        
	    
	
//	public void sendPassword(String password) {
//		this.password.clear(); 
//		this.password.sendKeys(password); 
//	}
//	
//	public void clickLoginBtn() {
//		this.loginBtn.click(); 
//	}
}
