package POM;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class TestLogin {
    private WebDriver driver;
    private IniciodeSesion iniciodeSesion;
    @Before
    public void inicio(){
        iniciodeSesion = new IniciodeSesion(driver);
        driver = iniciodeSesion.ConectorChrome();
        iniciodeSesion.pagina("https://demo.guru99.com/test/newtours/index.php");
    }
    @After
    public void cerrar(){
        driver.quit();
    }
    @Test
    public void inicioExitoso(){
        iniciodeSesion.iniciarSesion("prueba1","prueba1");
        Assert.assertEquals("Login Successfully", iniciodeSesion.mensajeLogin());
    }

}
