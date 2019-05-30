package aula04;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DuploClick2 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		
		System.setProperty("webdriver.gecko.driver", "C:/driver/geckodriver.exe");
		String baseUrl = "http://www.facebook.com/"; 
		 WebDriver driver = new FirefoxDriver();

		driver.get (baseUrl);
		WebElement txtUsername = driver.findElement (By.id ("email"));

		Actions builder =  new Actions (driver);
		
		Action seriesOfActions = ((Actions) builder)
			.moveToElement (txtUsername)
			.click()
			.keyDown (txtUsername, Keys.SHIFT)
			.sendKeys (txtUsername, "olá")
			.keyUp (txtUsername, Keys.SHIFT)
			.doubleClick (txtUsername)
			.contextClick ()
			.build();
			
		seriesOfActions.perform ();

		}
	

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
