package loinFactory;

import java.io.IOException;


import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import generalFunctionality.GeneralFunctionality;
import loginTest.LoginTest;


public class LoginFactory2  extends GeneralFunctionality{
	
		
		@Factory(dataProvider = "dt")
		public Object[] factory(String userName, String password) {
			return new Object [] {new LoginTest(userName, password)};
		}
		
			
		@DataProvider(name="dt")
		public String[][] dataprovider() throws InvalidFormatException, IOException{
			String a[][]=readExcel("C:\\Users\\amalbari\\Desktop\\Username.xlsx");
			return a;
		}
		

}
