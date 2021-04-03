package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EditCustomerPage;
import pages.LoginPage;
import pages.MyAccountPage;
import pages.NewCustomerPage;

public class EditCustomerTest extends TestBase{

    EditCustomerPage editCusObj;
    NewCustomerPage newCusObj;
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
    public void customerCanBeEdited(){
        myAccObj = new MyAccountPage(driver);
        editCusObj = new EditCustomerPage(driver);
        myAccObj.openEditCustomer();
        Assert.assertTrue(editCusObj.titleForEditForm.getText().contains("Edit Customer Form"));

        //editCusObj.dataEntryForEditingCus("1234567890");
        editCusObj.clearEntryforEditingForm("22222222");
        Assert.assertTrue(loginObj.successMessage.getText().contains("Welcome To Manager's Page of GTPL Bank"));
    }



}
