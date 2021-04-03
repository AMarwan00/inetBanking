package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class NewAccountPage extends PageBase {
    public NewAccountPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/p")
    public WebElement titleForNewAccForm;

    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[2]/td[2]/input")
    WebElement custIDEntry;

    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[3]/td[2]/select")
    WebElement accType;

    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input")
    WebElement initDeposit;

    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[1]")
    WebElement submitBtn;

    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[2]")
    WebElement resetBtn;

    @FindBy(xpath = "/html/body/table/tbody/tr/td/p/a")
    WebElement homeLink;

    public void dataEntryForNewAcc( String id){
        setTextElementText(custIDEntry,id);
        clickButton(submitBtn);
    }
    public void clearEntryforNewAcc( String id){
        setTextElementText(custIDEntry,id);
        clickButton(resetBtn);
        clickButton(homeLink);
    }
    public void selectTypeOfAcc(){

        Select select = new Select(accType);
        select.selectByVisibleText("current");

    }
}
