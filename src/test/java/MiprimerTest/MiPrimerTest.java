package MiprimerTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MiPrimerTest
{
    private WebDriver driver;
    @Before
    public void setUp ()
    {
        //Se coloca la dirección del driver, sea chrome, sea mozilla o edge.
        System.setProperty("webdriver.chrome.driver", "src/main/resources/Drivers/ChromeDriver/chromedriver.exe");

        //Crea la instancia del navegador
        driver = new ChromeDriver();

        //Maximiza el navegador
        driver.manage().window().maximize();

        //Envía la dirección del sistema al navegador
        driver.get("https://www.amazon.com/");
    }

    /*@Test
    public void TestAmazon ()throws InterruptedException
    {
       // Thread.sleep(5000);

        WebElement inputBusqueda = driver.findElement(By.id("twotabsearchtextbox"));
        inputBusqueda.click();
        inputBusqueda.sendKeys("Alexa");
        inputBusqueda.submit();
        Thread.sleep(2000);

    }*/

    @Test
    public void UsoXpath () throws InterruptedException
    {
        //Este Xpath es absoluto por buenas practicas no se debe utilizar
        /*WebElement bottonCompras = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[4]/div[2]/span[2]"));
        bottonCompras.click();
        Thread.sleep(5000);*/

        WebElement buttonCompras = driver.findElement(By.xpath("//span[@id='nav-cart-count']"));
        buttonCompras.click();
        Thread.sleep(5000);

    }

    @After
    public void tearDown()
    {
        //Cierra el navegador
        driver.quit();
    }
}
