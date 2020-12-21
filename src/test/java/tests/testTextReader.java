package tests;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.List;

import org.junit.Test;

import BaseTest.BaseTest;
import page.MainPage;

public class testTextReader extends BaseTest{
	
	private MainPage mainPage = new MainPage(driver);

	//metodas nuskaitantis test data
	
	@Test
	public void test() throws IOException { //issikvieciam metoda is fileReader klases
		List<String> testData = utils.fileReader.getTestData("src/test/resources/testData.txt");
		
		//istraukiam data is text.txt failo
		String productName = testData.get(0);
		String productName1 = testData.get(1);
		String productName2 = testData.get(2);
		String productName3 = testData.get(3);
		
	
		
		
	}
	
	
	
}
