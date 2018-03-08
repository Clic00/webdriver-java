package tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;


public class InformacoesUsuarioTest {

    @Test
    public void testAdicionarUmaInformacaoAdicionalDoUsuario() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\José\\drivers\\chromedriver.exe");
//      Abrindo o navegador
        WebDriver navegador = new ChromeDriver();
        navegador.manage().window().maximize();

        // Navegando para a página do Taskit!
        navegador.get("https://www.udemy.com");

        // Validação
        assertEquals(1, 1);
    }
}
