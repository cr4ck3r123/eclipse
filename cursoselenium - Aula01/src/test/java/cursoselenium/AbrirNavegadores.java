package cursoselenium;

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

public class AbrirNavegadores {

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
		// driver.get("http://www.superdownloads.com.br");
		// driver.get("http://www.youtube.com.br");
		String expectedTitle = "Facebook – entre ou cadastre-se";
		actualTitle = driver.getTitle();
		driver.findElement(By.id("loginbutton")).click();	
		driver.findElement(By.id("email")).sendKeys("fernando_oliveira4@msn.com");
		driver.findElement(By.id("pass")).sendKeys("abc123");
	  	driver.findElement(By.id("loginbutton"));
	  	
		driver.findElement(By.className("_50f6"));
		Actions builder = new Actions(driver);
		builder.doubleClick();
		System.out.print(builder.toString());
		
		
		
		
		/*int i=0;
		for(i=1; i < 10; i++) {
			 driver.findElement(By.id("pass")).sendKeys("abcd12345"+i);
			 driver.findElement(By.id("loginbutton")).click();
			 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}
		
*/				

		if (actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Teste falhou");
		}

		driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		

		driver.manage().window().maximize();

		List<WebElement> elements = (List<WebElement>) driver.findElement(By.name("nome"));

		System.out.print("Número de elementos: " + elements.size());

		for (int i = 0; i < elements.size(); i++) {
			System.out.println("Texto do botão de opção: " + elements.get(i).getAttribute("value"));
		}

		WebElement inputBairro = driver.findElement(By.name("email"));
		WebElement input2 = driver.findElement(By.name("pass"));
	
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		input2 = driver.findElement(By.className("_1frb"));
		input2.sendKeys("juciane goulart");

	
		
		input2 = driver.findElement(By.className("_585_"));
		input2.click();

		input2 = driver.findElement(By.className("4ik6"));
		input2.click();
		// tagName = driver.findElement (By.id("rodape")). getTagName ();
		// System.out.println (tagName);

		// input2 = driver.findElement(By.id("u_0_k"));
		// input2.sendKeys("Fernando");

		// driver.close();

		// System.exit(0);

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
