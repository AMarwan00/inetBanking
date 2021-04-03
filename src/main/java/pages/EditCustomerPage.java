package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditCustomerPage extends PageBase{
    public EditCustomerPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/p")
    public WebElement titleForEditForm;

    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[6]/td[2]/input")
    WebElement custIDEntry;

    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[11]/td[2]/input[1]")
    WebElement submitBtn;

    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[11]/td[2]/input[2]")
    WebElement resetBtn;

    @FindBy(xpath = "/html/body/table/tbody/tr/td/p/a")
    WebElement homeLink;

    public void dataEntryForEditingCus( String id){
        setTextElementText(custIDEntry,id);
        clickButton(submitBtn);
    }
    public void clearEntryforEditingForm( String id){
        setTextElementText(custIDEntry,id);
        clickButton(resetBtn);
        clickButton(homeLink);

    }


}
