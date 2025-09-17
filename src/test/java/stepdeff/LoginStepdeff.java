package stepdeff;

import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;
import utills.CommonMethods;
import utills.ConfigReader;

public class LoginStepdeff {

    ConfigReader configReader = new ConfigReader();
LoginPage loginPage = new LoginPage(DriverFactory.driver);


@Given("User on the Amazon website Login page")
    public void user_Is_On_Amazon_Website(){
    System.out.println("puppy dog");
    loginPage.openUrl();
}


    @When("User enter the username {string}")
    public void userEnterUserName(String username){
    loginPage.enterUserName(username);
    }


    @When("User enter the password {string}")
    public void userEnterPassword(String userpassword){
        loginPage.enterUserPassword(userpassword);
    }

    @Then("User click on submit button")
    public void userClickOnSubmitButton(){
        loginPage.clickOnSubmitButton();
    }

    @And("Validates user is on home page {string}")
    public void validatesUserIsOnHomePage(String expectedText){
        String actualText = loginPage.userIsOnHomePage();
        Assert.assertEquals("Hopmepage text is not matched",expectedText,actualText);
    }

}

