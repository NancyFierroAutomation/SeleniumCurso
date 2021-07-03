package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementsLogin
{
    //ELEMENTO BOTON SIGNIN
    public By byButtonSignin = By.xpath("//a[@class='login']");
    public WebElement ButtonSignin (WebDriver driver)
    {
        WebElement buttonSignin = driver.findElement(byButtonSignin);
        return buttonSignin;
    }

    //ELEMENTO INPUT USUARIO
    public By byInputUser = By.id("email");
    public WebElement InputUser (WebDriver driver)
    {
        WebElement inputUser = driver.findElement(byInputUser);
        return inputUser;
    }

    //ELEMENTO INPUT PASSWORD
    public static By byInputPassword = By.id("password");
    public WebElement InputPassword (WebDriver driver)
    {
        WebElement inputPassword = driver.findElement(byInputPassword);
        return inputPassword;
    }

  }
