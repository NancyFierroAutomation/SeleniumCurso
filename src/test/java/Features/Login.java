package Features;

import Common.Config;
import Elements.ElementsLogin;
import Utils.SeleniumUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login
{
    //******************INSTANCIAS******************
    ElementsLogin elementsLogin = new ElementsLogin();
    SeleniumUtils utils = new SeleniumUtils();
    Config config = new Config();

    public void miLogin (WebDriver driver) throws InterruptedException
    {
        Thread.sleep(2000);
        //Se da clic en el ButtonSignin
        utils.ClickButton(elementsLogin.ButtonSignin(driver));
        Thread.sleep(2000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy (0,350)");
        Thread.sleep(2000);

        //Se da clic y se llena el usuario
        utils.ClickButton(elementsLogin.InputUser(driver));
        utils.limpiarYLlenarInput(elementsLogin.InputUser(driver), Config.user);
        Thread.sleep(2000);

        //Se da clic y se llena el password
        utils.ClickButton(elementsLogin.InputPassword(driver));
        utils.limpiarYLlenarInput(elementsLogin.InputPassword(driver), Config.password);
        Thread.sleep(2000);

        WebElement buttonSignIn = driver.findElement(By.id("SubmitLogin"));
        buttonSignIn.click();
        Thread.sleep(2000);
    }
}
