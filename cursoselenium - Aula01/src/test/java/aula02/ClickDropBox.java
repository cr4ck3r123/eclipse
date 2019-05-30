package aula02;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class ClickDropBox {

	// Instanciando a classe webDriver
		static WebDriver driver;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		System.setProperty("webdriver.gecko.driver", "C:/driver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/register.php ");
		Select drpCountry = new Select (driver.findElement(By.name("country")));
		drpCountry.selectByVisibleText("ANTARCTICA");
	//	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	//	drpCountry.deselectByVisibleText("ANTARCTICA");
		//drpCountry.deselectByValue("ANTARCTICA");
		
		drpCountry.selectByValue("ALGERIA"); //seleciona por parametro

		driver.close();
		
		driver = new FirefoxDriver();
		driver.get("http://jsbin.com/osebed/2");
		Select frutas = new Select (driver.findElement(By.id("fruits")));
		frutas.selectByVisibleText("Banana");
		frutas.selectByIndex(1);
		
		//METODOS MAIS COMUNS
		
		
		
		
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
