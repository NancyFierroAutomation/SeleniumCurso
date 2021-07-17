package Features;

import Common.BaseTest;
import Elements.ElementsSelects;
import Utils.SeleniumUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Selects extends BaseTest
{
    //**********INSTANCIAS**********
    SeleniumUtils Utils = new SeleniumUtils();
    ElementsSelects elementsSelects = new ElementsSelects();

    @Test
    public void ListaConClicks () throws Exception
    {
        //Se valida la presencia del elemento TAP WOMAN
        Utils.waitElement(driver, elementsSelects.TapWoman(driver), elementsSelects.byTapWoman);

        //Se da clic en el elemento TAP WOMAN
        Utils.clickButton(elementsSelects.TapWoman(driver));
        Utils.loading(driver,3000);

        //Se valida la presencia del elemnto mas de la opción TOPS
        Utils.waitElement(driver, elementsSelects.BottonMasTops(driver), elementsSelects.bybottonMasTops);

        //Se da clic en el elemento opción "TOPS"
        Utils.clickButton(elementsSelects.BottonMasTops(driver));
        Utils.loading(driver, 2000);

        //Se valida la presencia del elemento "T SHIRTS"
        Utils.waitElement(driver, elementsSelects.BottonTSshirts(driver), elementsSelects.bybottonTSshirts);

        //Se da clic en el elemento "T SHIRTS"
        Utils.clickButton(elementsSelects.BottonTSshirts(driver));
        Utils.loading(driver, 2000);

        //**********SELECCIONAR OPCIONES DE UNA LISTA CON CLICKS**********
        /*ESTA OPCIÓN POR BUENAS PRACTICAS NO SE UTILIZA*/

        //SE VALIDALA LA PRESENCIA DEL ELEMENTO "LISTA SORT"
        Utils.waitElement(driver, elementsSelects.SelectSort(driver), elementsSelects.bySelectSort);

        //SE DA CLIC EN LA LISTA "SORT"
        Utils.clickButton(elementsSelects.SelectSort(driver));
        Utils.loading(driver, 2000);

        String opcionEsperada = "In stock";
        String opcionBuscar = String.format("//option[text()='%s']",opcionEsperada);
        WebElement option = driver.findElement(By.xpath(opcionBuscar));
        option.click();
        Utils.loading(driver,3000);




    }
}
