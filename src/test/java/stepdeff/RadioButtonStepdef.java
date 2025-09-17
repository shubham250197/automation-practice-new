package stepdeff;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.RadioButtonPage;

public class RadioButtonStepdef {

    RadioButtonPage radioButtonPage = new RadioButtonPage(DriverFactory.driver);

    @When("User click on second radiobutton")
    public void userClickOnSecondRadioButton(){
        radioButtonPage.clickOnSecondRadioButton();
    }

    @Then("Validates second radio button is selected")
    public void secondRadioButtonIsSelected(){
        boolean actualRadio2ButtonSelected = radioButtonPage.radioButtonIsSelected();
        Assert.assertTrue("Radio 2v button is not selected",actualRadio2ButtonSelected);

    }

    @When("User click on first radiobutton")
    public void userClickOnFirstRadioButton(){
        radioButtonPage.clickOnFirstRadioButton();
    }
    @Then("Validates first radio button is selected")
    public void validatesFirstRadioButtonIsSelected(){
       boolean actualValue = radioButtonPage.firstRadioButtonIsSelected();
       Assert.assertTrue("First radio button is not selected",actualValue);
    }

    @When("User click on third radiobutton")
    public void userClickOnThirdRadioButton(){
        radioButtonPage.clickOnThirdRadioButton();
    }

    @Then("Validates third radio button is selected")
    public void validatesThirdRadioButtonIsSelected(){
       boolean actualThirdradiobtn = radioButtonPage.thirdRadioButtonIsSelected();
       Assert.assertTrue("Third radio button is not selected",actualThirdradiobtn);
    }

}
