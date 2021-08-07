package Features;

import Common.BaseTest;
import Elements.ElementsSelects;
import Utils.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Selects extends BaseTest
{
    //**********INSTANCIAS**********
    SeleniumUtils Utils = new SeleniumUtils();
    ElementsSelects elementsSelects = new ElementsSelects();

    @Test
    public void ListaConClicks () throws Exception
    {
        //Se valida la presencia del elemento TAP WOMAN
        Utils.waitElement(driver, elementsSelects.byTapWoman);

        //Se da clic en el elemento TAP WOMAN
        Utils.clickButton(elementsSelects.TapWoman(driver));
        Utils.loading(driver,1000);

        //Se valida la presencia del elemnto mas de la opción TOPS
        Utils.waitElement(driver, elementsSelects.bybottonMasTops);

        //Se da clic en el elemento opción "TOPS"
        Utils.clickButton(elementsSelects.BottonMasTops(driver));
        Utils.loading(driver, 1000);

        //Se valida la presencia del elemento "T SHIRTS"
        Utils.waitElement(driver, elementsSelects.bybottonTSshirts);

        //Se da clic en el elemento "T SHIRTS"
        Utils.clickButton(elementsSelects.BottonTSshirts(driver));
        Utils.loading(driver, 1000);

        //**********SELECCIONAR OPCIONES DE UNA LISTA CON CLICKS**********
        /*ESTA OPCIÓN POR BUENAS PRACTICAS NO SE UTILIZA*/

        //SE VALIDALA LA PRESENCIA DEL ELEMENTO "LISTA SORT"
        Utils.waitElement(driver, elementsSelects.bySelectSort);

        //SE DA CLIC EN LA LISTA "SORT"
        Utils.clickButton(elementsSelects.SelectSort(driver));
        Utils.loading(driver, 1000);

        String opcionEsperada = "In stock";
        String opcionBuscar = String.format("//option[text()='%s']",opcionEsperada);
        WebElement option = driver.findElement(By.xpath(opcionBuscar));
        option.click();
        Utils.loading(driver,1000);

    }

    @Test
    public void listaConSendKeys() throws Exception
    {
        //1 Se valida la presencia del elemento TAP WOMAN
        Utils.waitElement(driver, elementsSelects.byTapWoman);

        //2 Se da clic en el elemento TAP WOMAN
        Utils.clickButton(elementsSelects.TapWoman(driver));
        Utils.loading(driver,1000);

        //3 Se valida la presencia del elemnto mas de la opción TOPS
        Utils.waitElement(driver, elementsSelects.bybottonMasTops);

        //4 Se da clic en el elemento opción "TOPS"
        Utils.clickButton(elementsSelects.BottonMasTops(driver));
        Utils.loading(driver, 1000);

        //5 Se valida la presencia del elemento "T SHIRTS"
        Utils.waitElement(driver, elementsSelects.bybottonTSshirts);

        //6 Se da clic en el elemento "T SHIRTS"
        Utils.clickButton(elementsSelects.BottonTSshirts(driver));
        Utils.loading(driver, 1000);

        //***********MANEJO DE LISTAS CON SENDKEYS***********
        //ESTA OPCIÓN ES ACEPTABLE

        Utils.waitElement(driver, elementsSelects.bySelectSort);
        Utils.loading(driver,1000);

        String opciponEsperada = "Product Name: A to Z";
        elementsSelects.SelectSort(driver).sendKeys(opciponEsperada);
        Utils.loading(driver,1000);
    }

    @Test
    public void listaUsandoClaseSelect() throws Exception
    {
        //1 Se valida la presencia del elemento TAP WOMAN
        Utils.waitElement(driver, elementsSelects.byTapWoman);

        //2 Se da clic en el elemento TAP WOMAN
        Utils.clickButton(elementsSelects.TapWoman(driver));
        Utils.loading(driver,1000);

        //3 Se valida la presencia del elemnto mas de la opción TOPS
        Utils.waitElement(driver, elementsSelects.bybottonMasTops);

        //4 Se da clic en el elemento opción "TOPS"
        Utils.clickButton(elementsSelects.BottonMasTops(driver));
        Utils.loading(driver, 1000);

        //5 Se valida la presencia del elemento "T SHIRTS"
        Utils.waitElement(driver, elementsSelects.bybottonTSshirts);

        //6 Se da clic en el elemento "T SHIRTS"
        Utils.clickButton(elementsSelects.BottonTSshirts(driver));
        Utils.loading(driver, 1000);

        //***********MANEJO DE LISTAS CON CLASE SELECT***********
        //OPCION RECOMENDADA
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy (0,350)");
        Utils.loading(driver,1000);

        Utils.waitElement(driver, elementsSelects.bySelectSort);
        Utils.loading(driver, 1000);
        String opcionEsperada = "In stock";
        elementsSelects.SelectSort(driver);
        Select selectLista = new Select(elementsSelects.SelectSort(driver));
        selectLista.selectByVisibleText(opcionEsperada);

    }
}
