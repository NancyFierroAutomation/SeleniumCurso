package Common;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest
{
    private WebDriver driver = null;
    private WebDriverWait wait = null;

    @Before
    public void Login () throws Exception
    {
        //Crear driver
        driver = Config.navegadorChrome();
        wait = new WebDriverWait(driver,15);
        driver.manage().window().maximize();

        //Login
        driver.get(Config.URL_QA);

    }
}
