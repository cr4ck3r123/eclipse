package aula05;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;

public class Download {

	//COMANDO  WGET
    //cmd /c C:\\wget\wget.exe -P C: --no-check-certificate http://demo.guru99.com/selenium/msgr11us.exe
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	
		
		 System.setProperty("webdriver.gecko.driver", "C:/driver/geckodriver.exe");
         String baseUrl = "http://demo.guru99.com/test/yahoo.html";
         WebDriver driver = new FirefoxDriver ();

 driver.get (baseUrl);
 WebElement downloadButton = driver.findElement(By.id("messenger-download"));
 String sourceLocation = downloadButton.getAttribute("href");
 String wget_command = "cmd /c C:\\\\Wget\\wget.exe -P C:\\\\Wget --no-check-certificate " + sourceLocation;
System.out.print(wget_command);
 try {
 Process exec = Runtime.getRuntime ().exec(wget_command);
 int exitVal = exec.waitFor();
 System.out.println ("Valor de saída:" + exitVal);
 } catch (InterruptedException | IOException ex) {
 System.out.println (ex.toString ());
 }
 driver.close ();
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
