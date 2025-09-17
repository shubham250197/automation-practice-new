package stepdeff;

import factory.DriverFactory;
import io.cucumber.java.en.When;
import pages.DropDownPage;

public class DropDownStepdef {
    DropDownPage dropDownPage = new DropDownPage(DriverFactory.driver);

    @When("User select the section option value of drop down {string}")
    public void validatesUserSelectSecondoption(String option){
        dropDownPage.userSelectSecondoption(option);
    }
    @When("User select the first option value of drop down {string}")
    public void validatesUserSelectFirstoption(String option1){
        dropDownPage.userSelectFirstoption(option1);
    }

}
