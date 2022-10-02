package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Vueling {
    public Vueling(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = " //*[@id=\"onetrust-button-group\"]/div")
    public WebElement coocikes;

    @FindBy(xpath = "//*[@id=\"AvailabilitySearchInputSearchView_TextBoxMarketOrigin1\"]")
    public WebElement  origin;

    @FindBy(xpath = "//*[@id=\"AvailabilitySearchInputSearchView_TextBoxMarketDestination1\"]")
    public WebElement  destino;

    @FindBy(xpath = "//*[@id=\"firstJourneyMulticity\"]/div/div/div[1]/div/div[2]/div/div")
    public WebElement barcelona;

    @FindBy(xpath = "//*[@id=\"firstJourneyMulticity\"]/div/div/div[1]/div/div[2]")
    public WebElement madrid;

    @FindBy(xpath = "//*[@id=\"datePickerContainer\"]/div[1]/table/tbody/tr[1]/td[2]/a")
    public WebElement dateida;

    @FindBy(xpath = "//*[@id=\"datePickerContainer\"]/div[1]/table/tbody/tr[1]/td[7]/a")
    public WebElement datavuelta;

    @FindBy (xpath = "//*[@id=\"DropDownListPassengerType_ADT_1\"]")
    public WebElement pasangeradult;

    @FindBy(xpath = "///*[@id=\"container_AvailabilitySearchInputSearchView_DropDownListPassengerType_CHD\"]")
    public WebElement pasangerchild;

    @FindBy(xpath = "//*[@id=\"AvailabilitySearchInputSearchView_DropDownListPassengerType_INFANT\"]")
    public WebElement pasangerbaby;

    @FindBy(xpath = "//*[@id=\"AvailabilitySearchInputSearchView_btnClickToSearchNormal\"]/span[1]")
    public WebElement buscarvuelo;

    @FindBy(xpath = "//*[@id=\"justPrice\"]")
    public WebElement precioida;

    @FindBy(xpath = "//*[@id=\"selectFlightButton\"]/div[1]/div")
    public WebElement preciovuelta;

    @FindBy(xpath = "//*[@id=\"fareAcceptButtonId\"]/div[3]")
    public WebElement preciooptima;

    @FindBy(xpath = "//*[@id=\"stvContinueButton\"]")
    public WebElement buttoncont;

    @FindBy(xpath = "//*[@id=\"ADT1\"]/fieldset[1]/div/div/div[1]/div/div/div")
    public WebElement name;

    @FindBy(xpath = "//*[@id=\"ContactViewControlGroupMainContact_BoxPassengerInformationView_TextBoxLastName_0\"]")
    public WebElement surname;



}
