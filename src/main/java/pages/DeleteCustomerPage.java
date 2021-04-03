package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeleteCustomerPage extends PageBase{
    public DeleteCustomerPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/p")
    public WebElement titleForDeleteForm;

    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[2]/td[2]/input")
    WebElement custIDEntry;

    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/input[1]")
    WebElement submitBtn;

    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/input[2]")
    WebElement resetBtn;

    @FindBy(xpath = "/html/body/p/a")
    WebElement homeLink;

    public void dataEntryForDeletingCus( String id){
        setTextElementText(custIDEntry,id);
        clickButton(submitBtn);
    }
    public void clearEntryforEletingForm( String id){
        setTextElementText(custIDEntry,id);
        clickButton(resetBtn);
        clickButton(homeLink);

    }




}
