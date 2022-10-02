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





       vueling.destino.sendKeys("madrid" + Keys.ENTER);
       vueling.madrid.click();
       select.selectByVisibleText("Madrid");

        vueling.dateida.click();
        vueling.datavuelta.click();
        Select select1=new Select(vueling.pasangeradult);
        select1.deselectByIndex(1);
        vueling.pasangeradult.sendKeys("1"+Keys.ENTER);
        Select select2=new Select(vueling.pasangerchild);
        select2.deselectByIndex(2);
        vueling.pasangerchild.sendKeys("2" +Keys.ENTER);
        vueling.buscarvuelo.click();
        vueling.precioida.click();
        vueling.preciovuelta.click();
        vueling.preciooptima.click();
        vueling.buttoncont.click();

        Driver.closeDriver();
    }
}
