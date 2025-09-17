package stepdeff;

import factory.DriverFactory;
import io.cucumber.java.en.When;
import pages.PopupAlertPage;

public class PopupAlertStepdef {
    PopupAlertPage popupAlertPage = new PopupAlertPage(DriverFactory.driver);

    @When("User enter the text {string}")
    public void enterText(String name){
        popupAlertPage.enterTextField(name);
    }

}
