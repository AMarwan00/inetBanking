package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.PageBase;

public class NewCustomerPage extends PageBase {
    public NewCustomerPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/p")
    public
    WebElement titleNewCustForm;

    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input")
    WebElement custNameEntry;

    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[1]")
    WebElement genderEntry;

    @FindBy(id = "dob")
    WebElement dateOfBirthEntry;

    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/textarea")
    WebElement adresseEntry;

    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[8]/td[2]/input")
    WebElement cityEntry;

    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[9]/td[2]/input")
    WebElement stateEntry;

    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[10]/td[2]/input")
    WebElement pinEntry;

    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[11]/td[2]/input")
    WebElement phoneEntry;

    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[12]/td[2]/input")
    WebElement emailEntry;

    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[13]/td[2]/input[1]")
    WebElement submitBtn;

    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[13]/td[2]/input[2]")
    WebElement reserBtn;

    @FindBy(xpath = "/html/body/text()")
    public
    WebElement successMsg;

    public void customerDataForRegistration(String custName,String DOB ,String adresse,
                                            String city ,String state , String pin, String phone,String email){

        setTextElementText(custNameEntry,custName);
        clickButton(genderEntry);
        setTextElementText(dateOfBirthEntry,DOB);
        setTextElementText(adresseEntry,adresse);
        setTextElementText(cityEntry,city);
        setTextElementText(stateEntry,state);
        setTextElementText(pinEntry,pin);
        setTextElementText(phoneEntry,phone);
        setTextElementText(emailEntry,email);
        clickButton(submitBtn);

    }
    public void resetFormEntries(){
        clickButton(reserBtn);
    }


}
