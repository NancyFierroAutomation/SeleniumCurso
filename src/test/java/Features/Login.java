package Features;

import Common.Config;
import Elements.ElementsLogin;
import Utils.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login
{
    //******************INSTANCIAS******************
    ElementsLogin elementsLogin = new ElementsLogin();
    SeleniumUtils utils = new SeleniumUtils();


    public void miLogin (WebDriver driver) throws InterruptedException
    {
        Thread.sleep(2000);
        //Se da clic en el ButtonSignin
        utils.clickButton(elementsLogin.ButtonSignin(driver));
        Thread.sleep(2000);


        //Se realiza desplazamiento hacia la parte inferiror
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy (0,350)");
        Thread.sleep(2000);

        //Se da clic y se llena el input user
        utils.clickButton(elementsLogin.InputUser(driver));
        utils.limpiarYLlenarInput(elementsLogin.InputUser(driver), Config.user);
        Thread.sleep(2000);

        //Se da clic y se llena el input password
        utils.clickButton(elementsLogin.InputPassword(driver));
        utils.limpiarYLlenarInput(elementsLogin.InputPassword(driver), Config.password);
        Thread.sleep(2000);

        //Se da clic en el botón sing in
        /*WebElement buttonSignIn = driver.findElement(By.id("SubmitLogin"));
        buttonSignIn.click();
        Thread.sleep(2000);*/

        utils.clickButton(elementsLogin.ButtonSignin(driver));
        Thread.sleep(2000);
    }

    public void cerrarSesión (WebDriver driver)
    {
        //**********NOTA DE ESTUDIO**********

        /*EN CADA CLASE DE FEATURES PODEMOS
        COLOCAR MULTIPLES FUNCIONALIDADES.
        ES INDISPENSABLE CONTAR PRIMERO CON
        LOS ELEMENTOS WEB. POR EJEMPLO: DENTRO
        DE ESTE METODO PODEMOS DESARROLLAR EL
        PASO A PASO DE CERRAR SESIÓN*/

    }
}
