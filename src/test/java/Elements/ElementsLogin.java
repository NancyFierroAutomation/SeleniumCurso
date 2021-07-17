package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementsLogin
{
    //1 ELEMENTO BOTON SIGNIN
    public By byButtonSignin = By.xpath("//a[@class='login']");
    public WebElement ButtonSignin (WebDriver driver)
    {
        WebElement buttonSignin = driver.findElement(byButtonSignin);
        return buttonSignin;
    }

    //2 ELEMENTO INPUT USUARIO
    public By byInputUser = By.id("email");
    public WebElement InputUser (WebDriver driver)
    {
        WebElement inputUser = driver.findElement(byInputUser);
        return inputUser;
    }

    //3 ELEMENTO INPUT PASSWORD
    public static By byInputPassword = By.id("passwd");
    public WebElement InputPassword (WebDriver driver)
    {
        WebElement inputPassword = driver.findElement(byInputPassword);
        return inputPassword;
    }

    //4 ELEMENTO TAP WOMAN
    public By byTapWoman = By.partialLinkText("Women");
    public WebElement TapWoman(WebDriver driver)
    {
        WebElement  tapWoman = driver.findElement(byTapWoman);
        return tapWoman;
    }

    //5 ELEMENTO BOTON PRUEBA
    public By byBotonPrueba = By.xpath("test");
    public WebElement BtnPruba (WebDriver driver)
    {
        WebElement  btnPrueba= driver.findElement(byBotonPrueba);
        return btnPrueba;
    }

  }
