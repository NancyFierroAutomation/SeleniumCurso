package Features;

import Common.BaseTest;
import Utils.SeleniumUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Alertas extends BaseTest
{
    //**********INSTANCIAS**********
    WebDriverWait wait;
    SeleniumUtils Utils = new SeleniumUtils();

    @Test
    public void alerts ()throws Exception
    {
        //INSTANCIA DE OBJETO JAVASCRIPT
        JavascriptExecutor js = (JavascriptExecutor) driver;

        //ACEPTAR ALERTA
        js.executeScript("alert('UN MENSAJE PARA EL AMIGO RAUL QUE VIENE LLEGANDO');");
        wait = new WebDriverWait(driver, 2);
        wait.until(ExpectedConditions.alertIsPresent());
        Utils.loading(driver, 5000);
        /*driver.switchTo().alert().accept();
        Utils.loading(driver, 3000);*/

        //DISMIS ALERTA ---> Lo que hace esta funcion es cancelar las alertas, se cumple cuando existen los botones: "cancelar, no, salir"
        String Alert = driver.switchTo().alert().getText();
        System.out.println("EL TEXTO ES:" + Alert);
        driver.switchTo().alert().dismiss();
    }
}
