package qa.jen.pages;
import qa.jen.pages.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage  extends TestBase {
	
	
	@FindBy(xpath=("//div[text()='Dedeepya Sukhavasi']"))
	WebElement name;
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean isDisplayed() {
		return name.isDisplayed();
	}
}
