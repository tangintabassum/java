package browserConfiguration;

import org.openqa.selenium.WebDriver;

import applicationStep.CoreStep;

public class EndToEndTest {
	
	public static void main(String[] args) {
		
		OpenBrowser b=new OpenBrowser();
		
		WebDriver moga=b.openBrowser();
		CoreStep c=new CoreStep(moga);
				c.verifyLogo();
				c.clickManMenu();
				c.clickElement();
				c.clickFirstProduct();
				c.verifyName();
				c.selectColor();
				c.selectSize();
				c.selectLength();
				c.verifyAddButton();
				c.clickAddButton();
				c.clickOnBag();
				c.verifyQuantity();
				c.clickOnCheckOut();
				
		
				
		
		
				
	}

}
