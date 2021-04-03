package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath="/html/body/form/table/tbody/tr[1]/td[2]/input")
    WebElement userId;

    @FindBy(xpath = "/html/body/form/table/tbody/tr[2]/td[2]/input")
    WebElement userPwd;

    @FindBy(xpath = "/html/body/form/table/tbody/tr[3]/td[2]/input[1]" )
    WebElement submitbtn;

    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[2]/td/marquee")
    public
    WebElement successMessage;

    public void setUserLogin(String id ,String password ) {

        setTextElementText(userId,id);
        setTextElementText(userPwd,password);
        clickButton(submitbtn);

    }
}
