package Features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MiPrimerTest
{
    private WebDriver driver;

    @BeforeTest
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

        //Utilizando xpath con tag (tag: span, ing, button, input, select) un atributo
       /* WebElement buttonCompras = driver.findElement(By.xpath("//span[@id='nav-cart-count']"));
        buttonCompras.click();
        Thread.sleep(5000);*/

        //Utilizando xpath por contains usando "*", el asterisco se puede reemplazar por el tag o tipo de elemento
        /*WebElement cuentasYListas = driver.findElement(By.xpath("//*[contains(text(), 'Cuenta y Listas')]"));
        cuentasYListas.click();
        Thread.sleep((5000));*/

        //Uso de xpath con multiple atributo
        /*WebElement inputBusqueda = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox' and @dir='auto']"));
        inputBusqueda.click();
        inputBusqueda.clear();
        inputBusqueda.sendKeys("Celulares");
        inputBusqueda.submit();
        Thread.sleep(5000);*/

        //Uso de Xpath por relation ship
        WebElement inputBusqueda = driver.findElement(By.xpath("//div/input[@id='twotabsearchtextbox' and @dir='auto']"));
        inputBusqueda.click();
        inputBusqueda.clear();
        inputBusqueda.sendKeys("Celulares");
        inputBusqueda.submit();
        Thread.sleep(5000);
    }

    @AfterTest
    public void tearDown()
    {
        //Cierra el navegador
        driver.quit();
    }
}
