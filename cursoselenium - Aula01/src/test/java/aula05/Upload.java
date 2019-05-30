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

public class Upload {

	
	
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		System.setProperty("webdriver.gecko.driver", "C:/driver/geckodriver.exe");
        String baseUrl = "http://demo.guru99.com/test/upload/";
        WebDriver driver = new FirefoxDriver ();

        driver.get (baseUrl);
        WebElement uploadElement = driver.findElement (By.id ("uploadfile_0"));

        // insira o caminho do arquivo no campo de entrada de seleção de arquivo
        uploadElement.sendKeys ("C:\\Users\\Fernando\\Desktop\\index.html");

        // marque a caixa de seleção "Eu aceito os termos de serviço"
        driver.findElement(By.id("terms")).click();

        // clique no botão "UploadFile"
        driver.findElement (By.name("send")).click();
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
