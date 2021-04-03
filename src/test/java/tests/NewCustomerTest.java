package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MyAccountPage;
import pages.NewCustomerPage;

public class NewCustomerTest extends TestBase{

    MyAccountPage myAccObj;
    NewCustomerPage newCusObj;
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
    public void openNewCustomerForm(){
        myAccObj = new MyAccountPage(driver);
        newCusObj = new NewCustomerPage(driver);
        myAccObj.openNewCustomer();
        Assert.assertTrue(newCusObj.titleNewCustForm.getText().contains("Add New Customer"));
    }

    @Test(priority = 2)
    public void newCustCanBeRegistered(){

        newCusObj = new NewCustomerPage(driver);
        newCusObj.customerDataForRegistration("Maroo","01/01/1993","5 rue la glorie","saintdenis" ,"iledeFrance","111111",
                "003308134646","mano@gmail.com");
        //Assert.assertTrue(newCusObj.successMsg.getText().contains("Could not connect:"));

    }



}
