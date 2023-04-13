package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class InputTagOfCouponCodePOM {
	private WebDriver driver; 
	
	public InputTagOfCouponCodePOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@class='hc_go-ad-free']")
	private WebElement addFreeBtn;
	
	@FindBy(xpath="//input[@placeholder='Got any coupon code?']")
	private WebElement inputTag;
	
	@FindBy(xpath="//span[@class='f-see-more' and text()='..See Less']")
	private WebElement seeLessButton;
	
	String coupon = "mxplayer123";
	public void inputTagValidation() {
		
		this.addFreeBtn.click();
        this.inputTag.sendKeys(coupon);
        String getCoupon =  driver.findElement(By.xpath("//input[@placeholder='Got any coupon code?']")).getAttribute("value");
		
		if(coupon.equals(getCoupon)) {
			System.out.println("Able to write in the input tag");
		}else {
		    System.out.println("Unable to write in the input tag");
		}
		 driver.close();
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
