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
        navegador.get("http://www.juliodelima.com.br/taskit");

        // Clicar no link que possui o texto "Sign in"

        // Clicar no campo com name "login" que está dentro do formulário de id "signinbox"

        // Digitar no campo com o name "login", referido no formulário acima, o texto "julio0001"

        // Clicar no campo com name "password" que está dentro do formulário de id "signinbox"

        // Digitar no campo com o name "password", referido no formulário acima, o texto "123456"

        //Clicar no link com o texto "SIGN IN"

        // Validar que dentro do elemento com class "me" estáo texto "Hi, Julio"

        // Fechar o navegador
        

        // Validação
        assertEquals(1, 1);
    }
}
