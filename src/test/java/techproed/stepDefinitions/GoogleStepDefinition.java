package techproed.stepDefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import techproed.pages.GooglePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GoogleStepDefinition {


    GooglePage googlePage;
    @Given("kullanici googleda {string} aratir")
    public void kullanici_googleda_aratir(String string) throws InterruptedException {

        googlePage = new GooglePage();
        Thread.sleep(2000);
        googlePage.aramaKutusu.sendKeys(string, Keys.ENTER);

    }

    @Given("basligin {string} icerdigini dogrular")
    public void basligin_icerdigini_dogrular(String string) {
        assertTrue(Driver.getDriver().getTitle().contains(string));

    }

    @Given("kullanici googleda {string} aratacaktir")
    public void kullanici_googleda_aratacaktir(String string) throws InterruptedException {
        googlePage = new GooglePage();
        Thread.sleep(2000);
        googlePage.aramaKutusu.sendKeys(ConfigReader.getProperty(string), Keys.ENTER);

    }

    @Given("basligin {string} icerdigini dogrulayacaktir")
    public void basligin_icerdigini_dogrulayacaktir(String string) {
        assertTrue(Driver.getDriver().getTitle().contains(ConfigReader.getProperty(string)));
    }



    @Given("kullanici_cookiesi_kapatir")
    public void kullanici_cookiesi_kapatir() {
        googlePage = new GooglePage();
        googlePage.cookies.click();
    }




}
