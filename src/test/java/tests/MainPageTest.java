package tests;

import org.junit.Test;

import BaseTest.BaseTest;
import page.MainPage;

public class MainPageTest extends BaseTest{

	private MainPage mainPage = new MainPage(driver);

	
	@Test
	public void mainPageTest () {
		
		mainPage.clickLaptopsDesktop();
		mainPage.clickLinkShowAllLaptops();
		mainPage.clickButtonList();
		
}}
