package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;


public class InformacoesUsuarioTest {

    @Test
    public void testAdicionarUmaInformacaoAdicionalDoUsuario() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\José\\drivers\\chromedriver.exe");
//      Abrindo o navegador
        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        navegador.manage().window().maximize();

        // Navegando para a página do Taskit!
        navegador.get("http://www.juliodelima.com.br/taskit");

        // Clicar no link que possui o texto "Sign in"
        navegador.findElement(By.linkText("Sign in")).click();


        // Identificando o formulário de Login
        WebElement formularioSignBox = navegador.findElement(By.id("signinbox"));

        // Digitar no campo com o name "login", referido no formulário acima, o texto "julio0001"
        formularioSignBox.findElement(By.name("login")).sendKeys("julio0001");

        // Clicar no campo com name "password" que está dentro do formulário de id "signinbox"

        // Digitar no campo com o name "password", referido no formulário acima, o texto "123456"
        formularioSignBox.findElement(By.name("password")).sendKeys("123456");

        //Clicar no link com o texto "SIGN IN"
        navegador.findElement(By.linkText("SIGN IN")).click();

        // Validar que dentro do elemento com class "me" estáo texto "Hi, Julio"

        WebElement me = navegador.findElement(By.className("me"));
        String textoNoElementoME = me.getText();

        // Validação
        assertEquals("Hi, Julio", textoNoElementoME);

        // Fechar o navegador
        navegador.quit();

    }
}
