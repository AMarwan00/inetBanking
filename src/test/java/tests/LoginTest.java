package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends TestBase{

String id  = "mngr317803";
String password = "YvAhYhA";

LoginPage loginObj;

@Test
public void userCanLoginSuccessfully() throws InterruptedException {

    loginObj = new LoginPage(driver);
    Thread.sleep(3000);
    loginObj.setUserLogin( id,password);
    Assert.assertTrue(loginObj.successMessage.getText().contains("Welcome To Manager's Page of GTPL Bank"));

}





}
