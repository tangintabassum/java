package applicationStep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import repo.ObjectRepository;
import seleniumHelper.Shared;
import testingData.DataTest;

public class CoreStep {
	WebDriver driver;

	public CoreStep(WebDriver driver) {
		this.driver = driver;

	}

	public void verifyLogo() {
		boolean result = Shared
				.verifyHomePageLogo(driver.findElement(By.xpath(ObjectRepository.verifyhomePageLogo)));

		if (result) {
			System.out.println("Element is present!");
		} else {
			System.out.println("Element is not present!");
		}
	}

	public void clickManMenu() {
		Shared.clickOnMenu(driver.findElements(By.xpath("//ol[@class='MegaMenu_menuList__1Z0gk']/li/a")), DataTest.index);

	}

	public void clickElement() {
		Shared.clickOnMenu(
				driver.findElements(By.xpath("//div[@class='calltoaction  padding- padding-vertical--px']/div/a")), 0);
	}

	public void clickFirstProduct() {
		Shared.clickAnyElement(
				driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div/div[1]/div[1]/a/img")));
	}

	public void verifyName() {
		boolean r = Shared.verifyAnyButton(driver
				.findElement(By.xpath("//*[@id=\"content\"]/div/div/section/section[1]/section/div[1]/h1")));

		if (r) {
			System.out.println("Product name is match!");
		} else {
			System.out.println("Product name is not match!");
		}
	}

	public void selectColor() {
		Shared.clickAnyElement(driver.findElement(By.xpath("//span[@class='_1e1-L']")));
	}

	public void selectSize() {
		Shared.clickAnyElement(driver.findElement(
				By.xpath("//*[@id=\"content\"]/div/div/section/section[1]/section/div[6]/div/div[1]/button/span")));
	}

	public void selectLength() {
		Shared.clickAnyElement(driver.findElement(
				By.xpath("//*[@id=\"content\"]/div/div/section/section[1]/section/div[7]/div/div[1]/button/span")));

	}

	public void verifyAddButton() {
		boolean y = Shared.verifyAnyButton(
				driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/section/section[1]/section/button")));
		if (y) {
			System.out.println("Add button is Enable!");
		} else {
			System.out.println("Add button is not Enable!");
		}
	}

	public void clickAddButton() {
		Shared.clickAnyElement(driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/section/section[1]/section/button")));
	}
	public void clickOnBag() {
		
		Shared.clickAnyElement(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[3]/div/a")));
		
	}
	public void verifyQuantity() {
		 boolean g=Shared.verifyAnyButton(driver.findElement(By.xpath("//*[@id=\"qdd-0-quantity\"]")));
		
		if(g)
		{
			System.out.println("Quantity is match!");
		}
		else
		{System.out.println("Quantity is not match!");
		}
			
	}
	public void clickOnCheckOut() {
		
		Shared.clickAnyElement(driver.findElement(By.xpath("//*[@id=\"continue-to-checkout\"]")));
	}
	
}
