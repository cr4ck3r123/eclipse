package aula01;

import static org.junit.Assert.fail;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.*;

public class ClickImagem {

	// Instanciando a classe webDriver
	static WebDriver driver;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		// dizer onde esta esse executavel
		System.setProperty("webdriver.chrome.driver", "C:/driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:/driver/geckodriver.exe");
		driver = new FirefoxDriver();
		// driver = new ChromeDriver();
		String actualTitle = "";
		driver.get("https://pt-br.facebook.com/");
		String expectedTitle = "Facebook – entre ou cadastre-se";
		actualTitle = driver.getTitle();
		driver.findElement(By.id("loginbutton")).click();	
		driver.findElement(By.id("email")).sendKeys("fernando_oliveira4@msn.com");
		driver.findElement(By.id("pass")).sendKeys("abc123");
	  	driver.findElement(By.id("loginbutton"));
	  	
	  	String baseUrl = "https://www.facebook.com/login/identify?ctx=recover";					
        System.setProperty ("webdriver.chrome.driver", "G: \\ chromedriver.exe");
        driver.close();
        
        driver = new FirefoxDriver ();					
        		
        driver.get (baseUrl);					
             // clique no logo "Facebook" na parte superior esquerda		
			driver.findElement (By.cssSelector ("a[title=\"Ir para a página inicial do Facebook\"]")). click ();					

			// verifique se estamos de volta à página inicial do Facebook		
			if (driver.getTitle (). equals ("Facebook - faça o login ou inscreva-se")) {							
            System.out.println ("Estamos de volta à página inicial do Facebook");					
        } else {			
            System.out.println ("NÃO estamos na página inicial do Facebook");					
        }		
				driver.close ();		

    }
	  	
		



	@AfterClass
	public static void tearDownAfterClass() throws Exception {

		// ele fecha apenas a aba que ele usou
		// driver.close();

		// ele fecha o browser inteiro
		// driver.quit();
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
