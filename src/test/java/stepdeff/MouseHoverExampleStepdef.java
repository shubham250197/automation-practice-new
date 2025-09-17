package stepdeff;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MouseHoverPage;

public class MouseHoverExampleStepdef {

MouseHoverPage mouseHoverPage = new MouseHoverPage(DriverFactory.driver);
    @When("User hover over on button")
    public void userHoverOnOverMouseHover(){
        mouseHoverPage.hoverOnOverMouseHover();
    }
    @Then("Validates user move to top of page")
    public void validatesUserMoveToTopPage(){
        mouseHoverPage.userMoveToTopPage();
    }
}
