package meu_test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class InformacoesUsuarioTest {

    @Test
    public void testEfetuarLoginParaPaginaDeCategorias() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\José\\drivers\\chromedriver.exe");
//      Abrindo o navegador
        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Actions actions = new Actions(navegador);
        navegador.manage().window().maximize();

        // Navegando para a página do Taskit!
        navegador.get("http://localhost:8100/");

        // Identificando o campo com o nome "email"
        WebElement email =  navegador.findElement(By.name("email"));
        actions.moveToElement(email);
        // Clicar no campo com name "eMail" que está na tela inicial
        actions.click();
        // Digitar no campo com o name "email" abaixo do label "eMail" o texto "tiobonito@gmail.com"
        actions.sendKeys("tiobonito@gmail.com");
        actions.build().perform();

        // Identificando o campo com o nome "senha"
        WebElement senha =  navegador.findElement(By.name("senha"));
        actions.moveToElement(senha);

        // Clicar no campo com name "senha" que está na tela inicial
        actions.click();

        // Digitar no campo com o name "senha" abaixo do label "Senha" o texto "123"
        actions.sendKeys("123");
        actions.build().perform();


        // Identificando os controles buttons em uma Lista
        List<WebElement> classElement = navegador.findElements(By.className("button-inner"));

        // Clicar no button do elemento da class "button-inner" com texto "Entrar"
        classElement.get(0).click(); //Primeiro botão da class "button-inner": "Entrar"

        // Validar que dentro do elemento com class "toolbar-title" estáo texto "Categorias"

        navegador.navigate().forward();

        System.out.println(navegador.getPageSource());

        WebElement tagPageCategorias =  navegador.findElement(By.cssSelector("div[class='toolbar-title toolbar-title-md']"));


        System.out.println(tagPageCategorias.getText());


        // Fechar o navegador
//        navegador.close();

        // Validação
//        assertEquals(1, 1);
    }



}
