package loinFactory;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Listeners;

import generalFunctionality.GeneralFunctionality;
import loginTest.LoginTest;

@Listeners(extentReport.ExtentReport.class)
public class LoginFactory extends GeneralFunctionality{
	
	@Factory(dataProvider="data")
	public Object[] factory(String UserName, String Password) {
		System.out.println("b");
		System.out.println(UserName + " " +Password);
		return new Object[] {new LoginTest(UserName, Password)};
	// comment
	}
	
	
	@DataProvider(parallel=true)
	public Object[][] data() throws InvalidFormatException, IOException {
		System.out.println("Test instead of a");
		System.out.println("New Line added");
		System.out.println("New Branch");
		System.out.println("New Branch is created and pusihing in new branch");
		System.out.println("New Branch is created and pusihing in new branch1");
		System.out.println("New Branch is created and pusihing in new branch2");
		System.out.println("New Branch is created and pusihing in new branch3");
		System.out.println("Push");
		String proj_path=System.getProperty("user.dir");
		System.out.println("b");
		String [][]a=readExcel("C:\\Users\\amalbari\\Desktop\\Username.xlsx");
		return a;
	}
	
}
