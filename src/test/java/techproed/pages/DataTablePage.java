package techproed.pages;

import org.bouncycastle.jcajce.provider.asymmetric.X509;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class DataTablePage {
    public DataTablePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//*[@type='button'])[1]")
    public WebElement newButton;

    @FindBy(xpath = "/*[@id='DTE_Field_first_name']")
    public WebElement firstname;

    @FindBy(xpath = "//*[text()='Create']")
    public WebElement createButton;

    @FindBy(xpath = "//input[@type=‘search’]")
    public WebElement search;

    @FindBy(css = "//tbody//td[2]")
    public WebElement verify;
}