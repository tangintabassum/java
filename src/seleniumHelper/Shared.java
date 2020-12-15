package seleniumHelper;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Shared {
	
	public static boolean verifyHomePageLogo(WebElement ele) {
		
		return ele.isDisplayed();
	}
	public static void clickOnMenu(List<WebElement> eles, int index) {
		eles.get(index).click();
	}
	//can we use the clickonmenu method for jeans
	public static void clickAnyElement(WebElement ele) {
		ele.click();
	}
	public static String verifyAnyText(WebElement ele) {
	return ele.getText();
	}
	public static boolean verifyAnyButton(WebElement ele) {
		return ele.isEnabled();
		
	}
	public static String verifyQuantity(WebElement ele) {
		return ele.getText();
	}
	

}
