package pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Metodos {

	WebDriver driver;

	/**
	 * Metodo abrir Navegador
	 * 
	 * @Laisla
	 * @param site
	 * @param passo
	 */

	public void abrirNavegador(String site, String passo) {
		try {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(site);
			driver.manage().window().maximize();
		} catch (Exception e) {
			System.out.println("------- error ao preencher, no passo " + passo + " " + e.getLocalizedMessage());

		}
	}

	/**
	 * Metodo para preencher texto no elemento
	 * 
	 * @param Laisla
	 * @param element
	 */

	public void preencher(By element, String texto) {
		try {
			driver.findElement(element).sendKeys(Keys.chord(texto));
		} catch (Exception e) {

		}
	}

	/**
	 * Metodo para dar submit no elemento
	 * 
	 * @param Laisla
	 * @param element
	 */

	public void submit(By element) {
		try {
			driver.findElement(element).submit();
		} catch (Exception e) {
			System.out.println("-----Erro ao tentar dar submit no elemento-----" + e.getLocalizedMessage());
		}
	}
	public void tempToClick(By elemento, String descricao) {
		WebDriverWait espera = new WebDriverWait(driver, 10);
		@SuppressWarnings("unused")
		WebElement element = espera.until(ExpectedConditions.visibilityOfElementLocated(elemento));

	}
	/**
	 * Metodo para clicar
	 * 
	 * @param Laisla
	 * @param element
	 */

	public void clicar(By element) {
		try {
			driver.findElement(element).click();
		} catch (Exception e) {
			System.out.println("-----Erro ao clicar no elemento-----" + e.getLocalizedMessage());
		}
	}

	/**
	 * Metodo para pausar aplica��o usando milisegundos ex: para 1 segundo, colocar
	 * 1000
	 * 
	 * @param Laisla
	 * @param element
	 */

	public void pausa(int tempo) {
		try {
			Thread.sleep(tempo);
		} catch (Exception e) {
			System.out.println("-----Error na pausa com Thread.sleep-----" + e.getLocalizedMessage());

		}
	}

	/**
	 * Metodo para fechar navegador
	 * 
	 * @param Laisla
	 * @param element
	 */

	public void fecharNavegador() {
		try {
			driver.quit();
		} catch (Exception e) {
			System.out.println("-----Erro ao tentar dar fechar navegador-----" + e.getLocalizedMessage());
		}
	}
public void validarTexto(By elemento,String texto) {
	String textEsp = driver.findElement(elemento).getText();
	assertEquals(textEsp, texto);
}
}
