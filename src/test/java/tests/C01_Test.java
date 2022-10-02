package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.Vueling;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_Test {

    @Test
    public void test01() {
        Vueling vueling =new Vueling();


        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        vueling.coocikes.click();
        vueling.origin.sendKeys("barcelona"+ Keys.ENTER);
       Select select=new Select(vueling.barcelona);
       select.deselectByIndex(11);


        select.selectByVisibleText("Barcelona"+Keys.ENTER);
       vueling.barcelona.sendKeys(Keys.ENTER);

       select.deselectByIndex(11);
       vueling.barcelona.sendKeys("barcelona" +Keys.ENTER);
        vueling.destino.sendKeys("madrid" + Keys.ENTER);
       vueling.madrid.click();

        vueling.dateida.click();
        vueling.datavuelta.click();
        vueling.pasangeradult.sendKeys("1"+Keys.ENTER);
        vueling.pasangerchild.sendKeys("2" +Keys.ENTER);
        vueling.buscarvuelo.click();
        vueling.precioida.click();
        vueling.preciovuelta.click();
        vueling.preciooptima.click();
        vueling.buttoncont.click();

        Driver.closeDriver();
    }
}
