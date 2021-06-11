package Tarea;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Tarea

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
        driver.get("http://automationpractice.com/index.php");
    }

    @Test
    public void TestPactice ()throws InterruptedException
    {
       // WebElement buttonSingIn = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a"));
       // WebElement buttonSingIn = driver.findElement(By.className("login"));
        WebElement buttonSingIn = driver.findElement(By.xpath("//a[@class='login']"));
        buttonSingIn.click();
        Thread.sleep(2000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy (0,350)");
        Thread.sleep(3000);

        WebElement inputUser = driver.findElement(By.id("email"));
        inputUser.click();
        inputUser.clear();
        inputUser.sendKeys("test.0@test.com");
        Thread.sleep(2000);



    }

    @After
    public void tearDown()
    {
        //Cierra el navegador
        driver.quit();
    }


}

