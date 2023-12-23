package TestSCRIPT;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Generic.Base_Test;
import Generic.Readexcel;
import pom_scripts.Register_page;

public class RegisterTest  extends Base_Test{
	//public RegisterTest(WebDriver driver) {
	//	super();
		// TODO Auto-generated constructor stub
	//}
	@DataProvider(name="registerdata")
	public static Object[][] data() throws IOException{
		return Readexcel.getMulitipledata("Sheet1");
		
	}
	@Test(dataProvider="registerdata")
	public void reg(String firstname,String lastname,String email,String password,String confirmpassword) throws IOException 
	{ Register_page r=new Register_page(driver);
	r.getReglink().click();
	
	//r.getFemale().click();
	r.getFirstname().sendKeys(firstname);
	r.getLastname().sendKeys(lastname);
	r.getEmail().sendKeys(email);
	r.getPassword().sendKeys(password);
	r.getConfirmPassword().sendKeys(confirmpassword);
	r.getButton().click();
	}
	
}
