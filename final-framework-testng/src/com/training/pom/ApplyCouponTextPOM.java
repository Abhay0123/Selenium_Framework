package com.training.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ApplyCouponTextPOM {
	private WebDriver driver; 
	
	public ApplyCouponTextPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@class='hc_go-ad-free']")
	private WebElement addFreeBtn;
	
	@FindBy(xpath="//input[@placeholder='Got any coupon code?']")
	private WebElement inputTag;
	
	@FindBy(xpath="//div[@class='coupon-info']")
	private WebElement couponInfo;
	
	
	String coupon = "mxplayer123";
	
	public void applyButtonValidation() {
		
		this.addFreeBtn.click();
        this.inputTag.sendKeys(coupon);
        System.out.println(couponInfo.getText());
		
		
		if(couponInfo.getText().equals("Click Apply to avail your coupon benefits")){
			System.out.println("Coupon Code Info Text is Shown");
		}else {
		    System.out.println("Coupon Code Info Text not is Shown");
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
