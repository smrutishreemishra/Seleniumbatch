package Project;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestcaseTest1 {
	@Test
	public void testcase() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com");
		
	}

}
