package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Register_page extends Basepage {
	
	 
		public Register_page(WebDriver driver) {
		super(driver);
		
	}
		
		@FindBy(id="FirstName")
		private WebElement firstname;
		
		@FindBy(id="LastName")
		private WebElement lastname;
		@FindBy(id="Password")
		private WebElement password;
		
		@FindBy(id="Email")
		private WebElement email;
		
		public WebElement getFirstname() {
			return firstname;
		}

		public WebElement getLastname() {
			return lastname;
		}

		public WebElement getPassword() {
			return password;
		}

		public WebElement getEmail() {
			return email;
		}

		public WebElement getConfirmPassword() {
			return ConfirmPassword;
		}

		public WebElement getButton() {
			return button;
		}
		@FindBy(id="ConfirmPassword")
		private WebElement ConfirmPassword;
		
		@FindBy(id="register-button")
		private WebElement button;
		
		@FindBy(id="gender-female")
		private WebElement female;
		
		@FindBy(id="gender-male")
		private WebDriver male;

		public WebElement getFemale() {
			return female;
		}
		@FindBy(linkText="Register")
		private WebElement reglink;


		public WebElement getReglink() {
			return reglink;
		}

		public WebDriver getMale() {
			return male;
		}

}
