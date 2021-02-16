package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;



public class primeiroTeste {
    @Test
    public void test(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\bruno.cruz\\Downloads\\chromedriver.exe");
        ChromeDriver navegador = new ChromeDriver();

        navegador.get("https://www.centauro.com.br/");

        navegador.findElement(By.id("searchInput")).click();

        navegador.findElement(By.id("searchInput")).sendKeys("Tenis Nike");

        navegador.findElement(By.className("_15jqtt5")).click();

        navegador.findElement(By.className("_1o44aqn")).click();







        Assert.assertEquals(1,1);

    }
}
