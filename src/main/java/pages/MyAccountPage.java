package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends PageBase{

    public MyAccountPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "/html/body/div[3]/div/ul/li[2]/a")
    WebElement addNewCustLink;

    @FindBy(xpath = "/html/body/div[3]/div/ul/li[3]/a")
    WebElement  editCustLink;

    @FindBy(xpath = "/html/body/div[3]/div/ul/li[4]/a")
    WebElement deleteCustLink;

    @FindBy(xpath = "/html/body/div[3]/div/ul/li[5]/a")
    WebElement newAccountLink;

    @FindBy(xpath = "/html/body/div[3]/div/ul/li[6]/a")
    WebElement editAccountLink;

    @FindBy(xpath = "/html/body/div[3]/div/ul/li[7]/a")
    WebElement deleteAccountLink;

    @FindBy(xpath = "/html/body/div[3]/div/ul/li[8]/a")
    WebElement miniStatLink;

    @FindBy(xpath = "/html/body/div[3]/div/ul/li[9]/a")
    WebElement custStatLink;

    @FindBy(xpath = "/html/body/div[3]/div/ul/li[10]/a")
    WebElement logoutLink;

    public void openNewCustomer(){
        clickButton(addNewCustLink);
    }
    public void openEditCustomer(){
        clickButton(editCustLink);
    }
    public void deleteCustomer(){
        clickButton(deleteCustLink);
    }
    public void openNewAccount(){
        clickButton(newAccountLink);
    }
    public void editAccount(){
        clickButton(editAccountLink);
    }
    public void deleteAccount(){
        clickButton(deleteAccountLink);
    }
    public void openMiniStat(){
        clickButton(miniStatLink);
    }
    public void openCustStat(){
        clickButton(custStatLink);
    }
    public void logOut(){
        clickButton(logoutLink);
    }


}
