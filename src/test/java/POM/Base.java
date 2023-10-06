package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.lang.model.element.Element;
import java.util.List;

public class Base {

    private WebDriver driver;

    public Base(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver ConectorChrome(){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Usuario\\Desktop\\Escritorio\\10mo semestre\\CALIDAD DE SOFTWARE\\EjerPatronPom\\src\\test\\java\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        return driver;

    }
    //wrapper o emboltorios

    //primer metodo que devuelve el localizador

    public WebElement findElement(By Localizador){

        return driver.findElement(Localizador);

    }
    // Metodo que devuelve una lista de elementos
    public List<WebElement> findElements(By Localizador){
        return driver.findElements(Localizador);

    }

    //Metodo que devuelve el texto del elemento

    public String getText (WebElement Elemento){
        return Elemento.getText();
    }

    //METODO PARA HACER CLICK

    public void click(By Localizador){
        driver.findElement(Localizador).click();
    }

    //METODO PARA ESCRIBIR TEXTO
    public void texto(String input, By Localizador){
        driver.findElement(Localizador).sendKeys(input);

    }
    //METODO QUE INDICA SI EL ELEMENTO SE PUEDE USAR
    public Boolean isDisplayed(By Localizador){
        try{
            return driver.findElement(Localizador).isDisplayed();
        }catch (org.openqa.selenium.NoSuchElementException e){
            return false;

        }

    }
    //METODO PARA ABRIR LA PAGINA

    public void pagina (String url){
        driver.get(url);

    }




}
