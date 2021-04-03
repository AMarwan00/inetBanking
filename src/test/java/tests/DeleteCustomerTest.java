package tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DeleteCustomerPage;
import pages.LoginPage;
import pages.MyAccountPage;

public class DeleteCustomerTest extends TestBase{

    MyAccountPage myAccObj;
    DeleteCustomerPage dltCusObj;
    LoginPage loginObj;

    String id  = "mngr317803";
    String password = "YvAhYhA";

    @Test(priority = 0)
    public void userCanLoginSuccessfully() throws InterruptedException {

        loginObj = new LoginPage(driver);
        Thread.sleep(3000);
        loginObj.setUserLogin( id,password);
        Assert.assertTrue(loginObj.successMessage.getText().contains("Welcome To Manager's Page of GTPL Bank"));

    }



    @Test(priority = 1)
    public void customerCanBeDeleted(){
        myAccObj = new MyAccountPage(driver);
        dltCusObj = new DeleteCustomerPage(driver);
        myAccObj.deleteCustomer();
        Assert.assertTrue(dltCusObj.titleForDeleteForm.isDisplayed());
        dltCusObj.dataEntryForDeletingCus("55555555");

    }


}
