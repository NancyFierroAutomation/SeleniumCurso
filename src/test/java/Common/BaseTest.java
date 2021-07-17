package Common;

import Features.Login;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;


public class BaseTest
{
    //***********INSTANCIAS************
    protected static WebDriver driver = null;
    Login login = new Login();

    @Before
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

    @After
    public void tearDown()
    {
        //La Función "driver.quit", nos sirve para cerrar el navegador
        driver.quit();
    }
}
