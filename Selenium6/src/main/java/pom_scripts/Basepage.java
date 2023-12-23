package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Generic.Utility_methods;

public class Basepage extends Utility_methods{
public Basepage (WebDriver driver) {
	PageFactory.initElements(driver, this);
}
}
