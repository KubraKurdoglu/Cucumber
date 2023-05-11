package techproed.stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import techproed.pages.AmazonPage;
import techproed.pages.DataTablePage;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;

public class DataTableStepDefinition {

    DataTablePage dataTablePage;

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


    @Then("kullanici_sayfadaki_tabloda_new_butonuna_basar")
    public void kullanici_sayfadaki_tabloda_new_butonuna_basar() {
        dataTablePage = new DataTablePage();
        dataTablePage.newButton.click();
    }


    /*
     #DataTable; scenario'lardaki satır ve sütun için bir veri tablosu temsil eder.
#Bunun için kullanılmak istenen her stepten sonra yukarıdaki örnekteki bir tablo yapısı oluştururuz.
#ve bu stepin methodunu stepDefinition'da oluşturduğumuz zaman buradaki verileri alabilmemiz için
#oluşturulan methoda DataTable parametresi eklenir.
#Bu parametre ismi ile bir list oluşturulabilir.
#yada direkt asList() methodu ile row'lara ulaşabiliriz.

     */
    @And("kullanici_verilen_urunleri_aratir")
    public void kullanici_verilen_urunleri_aratir(DataTable data) {

        AmazonPage amazonPage = new AmazonPage();
        System.out.println(data.asList());
        for (int i = 1; i <data.asList().size() ; i++) {//1'den baslatti cunku basligi istemiyor.
            amazonPage.aramaKutusu.sendKeys(data.asList().get(i), Keys.ENTER);
            ReusableMethods.bekle(2);
            assertTrue(Driver.getDriver().getTitle().contains(data.asList().get(i)));
            ReusableMethods.bekle(2);
            amazonPage.aramaKutusu.clear();
        }
    }
}
