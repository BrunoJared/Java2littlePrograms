package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.lang.String;


public class testeDeBuscaSimples {
    @Test
    public void buscasimplesGoogle () {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\bruno.cruz\\Downloads\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();

        navegador.get();

       // Assert.assertEquals(1,1);
    }
}
