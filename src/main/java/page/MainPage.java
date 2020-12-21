package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import utils.WaitUtils;

public class MainPage extends AbstractPage{
	
	//links
	@FindBy(linkText = "Laptops & Notebooks")
	private WebElement linkLaptopsDesktop;
	
	@FindBy(linkText = "Show All Laptops & Notebooks")
	private WebElement linkShowAllLaptops;

	//buttons
	
	@FindBy(id = "list-view")
	private WebElement buttonList;
	
	

	public MainPage(WebDriver driver) {
		super(driver);
	}

	public void clickLaptopsDesktop() {
		linkLaptopsDesktop.click();
		WaitUtils.waitForJS(driver);
	}
	
	public void clickLinkShowAllLaptops() {
		linkShowAllLaptops.click();
	
	}
	
	public void clickButtonList() {
		buttonList.click();
	
	}
	

	
	
	
	

}
