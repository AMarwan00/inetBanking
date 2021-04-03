package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MyAccountPage;
import pages.NewAccountPage;

public class NewAccountTest extends TestBase{

    NewAccountPage nwAccCusObj;
    MyAccountPage myAccObj;
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
    public void OpeningNewAccount(){

        myAccObj = new MyAccountPage(driver);
        nwAccCusObj = new NewAccountPage(driver);

        myAccObj.openNewAccount();
        Assert.assertTrue(nwAccCusObj.titleForNewAccForm.getText().contains("Add new account form"));

        nwAccCusObj.clearEntryforNewAcc("555555555555");

    }
}
