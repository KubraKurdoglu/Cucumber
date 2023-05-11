package techproed.stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import techproed.pages.BlueRentalPage;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;

public class BlueRentalStepDefinition {

    BlueRentalPage blueRentalPage;
    @Then("Verilen_kullanicilar_ile_login_olunur")
    public void verilen_kullanicilar_ile_login_olunur(DataTable data) {
      blueRentalPage = new BlueRentalPage();
      blueRentalPage.loginButton.click();
        ReusableMethods.bekle(2);
        blueRentalPage.emailBox.sendKeys(data.row(1).get(0), Keys.TAB, data.row(1).get(1), Keys.ENTER);
        ReusableMethods.bekle(2);
        assertEquals(blueRentalPage.userDropDown.getText(), "Sam Walker");
        ReusableMethods.bekle(2);
        Driver.getDriver().navigate().back();
        ReusableMethods.bekle(2);
        blueRentalPage.emailBox.sendKeys(data.row(2).get(0), Keys.TAB, data.row(2).get(1), Keys.ENTER);
        ReusableMethods.bekle(2);
        assertEquals(blueRentalPage.userDropDown.getText(), "Kate Brown");
        ReusableMethods.bekle(2);

    }


}
