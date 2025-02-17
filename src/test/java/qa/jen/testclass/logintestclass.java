package qa.jen.testclass;

import org.testng.annotations.BeforeMethod;

import qa.jen.pages.HomePage;
import qa.jen.pages.TestBase;
import qa.jen.pages.login;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class logintestclass extends TestBase{
	
	login loginPage;
	HomePage homePage;
	
	public  logintestclass(){
		super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException{
		initialization();
		loginPage = new login();
		
	}
	
	
	@Test(priority=1)
	public void verifyHomePageTitleTest(){
		boolean SignIn = loginPage.Sigin();
		Assert.assertEquals(SignIn,true);
	}

	@Test(priority=2,enabled=true)
	public void loginPageTitleTest() throws Throwable{
		
		boolean flag = loginPage.SigninClick();
		Thread.sleep(5000);
		Assert.assertTrue(flag);
		homePage = loginPage.loginLINK();
		boolean flag1 = homePage.isDisplayed();
		Assert.assertTrue(flag1);
		}
		
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
