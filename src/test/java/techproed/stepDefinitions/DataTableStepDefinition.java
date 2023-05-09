package techproed.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import techproed.pages.DataTablePage;

import static org.junit.Assert.assertTrue;

public class DataTableStepDefinition {

    DataTablePage dataTablePage;
    @Then("kullanici_sayfadaki_tabloda_new_butonuna_basar")
    public void kullanici_sayfadaki_tabloda_new_butonuna_basar() {
        dataTablePage.newButton.click();
    }

    @When("cikan_pencerede_verilen_bilgileri_girelim {string},{string},{string},{string},{string},{string},{string}")
    public void cikan_pencerede_verilen_bilgileri_girelim(String firstname, String lastname, String position,
                                                          String office, String extension, String date, String salarie) {
        dataTablePage = new DataTablePage();
        dataTablePage.firstname.sendKeys(firstname, Keys.TAB, lastname, Keys.TAB, position,Keys.TAB, office,
                Keys.TAB, extension, Keys.TAB, date, Keys.TAB, salarie);

    }

    @And("kullanici_create_butonuna_basar")
    public void kullanici_create_butonuna_basar() {
        dataTablePage =new DataTablePage();
        dataTablePage.createButton.click();
    }



    @And("kullanici_search_bolumune_{string}_bilgisi_girer")
    public void kullanici_search_bolumune__bilgisi_girer(String firstname) {
        dataTablePage = new DataTablePage();
        dataTablePage.search.sendKeys(firstname);
    }

    @And("kullanici_{string}ile_basarili_bir_sekilde_giris_yapildigini_dogrular")
    public void kullanici_Ile_basarili_bir_sekilde_giris_yapildigini_dogrular(String firstname) {
        dataTablePage = new DataTablePage();
        assertTrue(dataTablePage.verify.getText().contains(firstname));

    }
}