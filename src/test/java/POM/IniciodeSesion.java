package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IniciodeSesion extends Base{

    private By txtUser = By.xpath("//input[@name='userName']");
    private By txtPass = By.xpath("//input[@name='password']");
    private By btnIngreso = By.xpath("//input[@name='submit']");
    private By mensaje = By.xpath("//h3[.='Login Successfully']");



    public IniciodeSesion(WebDriver driver){

        super(driver);
    }

    //Metodo inicio sesion
    public void iniciarSesion(String user, String password){
        findElement(txtUser).sendKeys(user);
        findElement(txtPass).sendKeys(password);
        findElement(btnIngreso).click();

    }
    public String mensajeLogin(){
        return findElement(mensaje).getText();
    }

}
