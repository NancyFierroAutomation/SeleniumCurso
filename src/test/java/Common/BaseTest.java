package Common;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;


public class BaseTest
{
    //***********INSTANCIAS************
    protected static WebDriver driver = null;
    Login login = new Login();

    @BeforeTest
    public void Login () throws Exception

    {
        //Crear driver
        driver = Config.navegadorFirefox();

        //Maximiza ventana
        driver.manage().window().maximize();

        //La Función "driver.get", nos sirve para mandar la URL al navegador
        driver.get(Config.URL_QA);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Por medio del objeto "login", mandamos traer (INSTANCIAMOS) el proceso de inciar sesión
        login.miLogin(driver);

    }

    @AfterTest
    public void tearDown()
    {
        //La Función "driver.quit", nos sirve para cerrar el navegador
        driver.quit();
    }
}
