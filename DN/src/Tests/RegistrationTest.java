package Tests;

import org.junit.Test;

import Pages.LoginPage;
import Pages.RegistrationPage;

public class RegistrationTest extends BaseTest {

    public LoginPage loginPage;
    public RegistrationPage registrationPage;

    String emailAdress = "david.novakovic1111@gmail.com";
    String firstName = "dada";
    String lastName = "nono";
    String password = "12345@qa";
    String address = "bulevar";
    String city = "uzice";
    String zip = "12345";
    String mobile = "12345";
    String alias = "My adress1";
    String completeRegistration = "MY ACCOUNT";

    @Test
    public void submitRegistrationForm(){

        loginPage = new LoginPage(driver);
        registrationPage = new RegistrationPage(driver);

        loginPage.basePage();
        loginPage.clickOnSignInButton();
        registrationPage.createAccount(emailAdress);
        registrationPage.fillOutRegistrationForm(firstName, lastName, emailAdress, password, address, city, zip, mobile, alias);
        registrationPage.verifyCompletedRegistration(completeRegistration);

    }

    
}
