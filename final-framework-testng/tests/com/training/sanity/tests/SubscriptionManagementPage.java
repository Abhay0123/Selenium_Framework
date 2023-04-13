package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.ApplyButtonValidationPOM;
import com.training.pom.ApplyCouponTextPOM;
import com.training.pom.ChoosePlanPOM;
import com.training.pom.HomeButtonPOM;
import com.training.pom.InputTagOfCouponCodePOM;
import com.training.pom.LoginPOM;
import com.training.pom.MXGOLDLogoPOM;
import com.training.pom.PackPosterPOM;
import com.training.pom.SeeLessPOM;
import com.training.pom.SeeMorePOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class SubscriptionManagementPage {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	private MXGOLDLogoPOM mxGoldLogo;
	private PackPosterPOM subscriptionPackPoster;
	private ChoosePlanPOM chooseplan;
	private SeeMorePOM seeMoreInfo; 
	private SeeLessPOM seeLessInfo;
	private InputTagOfCouponCodePOM inputTagValidate;
	private ApplyButtonValidationPOM applyButton;
    private HomeButtonPOM homeButton;
    private ApplyCouponTextPOM couponText;
	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
//		properties = new Properties();
//		FileInputStream inStream = new FileInputStream("./resources/others.properties");
//		properties.load(inStream);
	}

	//@BeforeMethod
	@BeforeTest()
	public void setUp() throws Exception {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		
		// objects of Subscription management page 
		
		mxGoldLogo = new MXGOLDLogoPOM(driver);
		subscriptionPackPoster = new PackPosterPOM(driver);
		chooseplan  = new ChoosePlanPOM(driver);
		seeMoreInfo = new SeeMorePOM(driver);
		seeLessInfo = new SeeLessPOM(driver);
		inputTagValidate = new InputTagOfCouponCodePOM(driver);
		applyButton = new ApplyButtonValidationPOM(driver);
		homeButton = new HomeButtonPOM(driver);
		couponText = new ApplyCouponTextPOM(driver);
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterTest(enabled= false)
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		//driver.quit();
	}
	
	@Test(enabled= false)
	public void validLoginTest() {
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		loginPOM.clickLoginBtn(); 
		screenShot.captureScreenShot("First");
	}
	
	@Test(priority=1)
	public void subscriptionPage(){
		// mxGoldLogo.goToSubscriptionPage();
		// subscriptionPackPoster.subscriptionPosterInfo();
		// chooseplan.chooseThePlan();
		// seeMoreInfo.seeMore(); 
		// seeLessInfo.seeLess();
		// inputTagValidate.inputTagValidation();
		// applyButton.applyButtonValidation();
		// homeButton.homeButtonValidation(); 
	       couponText.applyButtonValidation();  
	}
}

