package stepdeff;

import factory.DriverFactory;
import io.cucumber.java.en.When;
import pages.WebTablePage;

public class WebTableStepdef {

    WebTablePage webTablePage = new WebTablePage(DriverFactory.driver);

    @When("User get the course name with price {string}")
    public void userGetCourseNameWithPrice(String priceName){
        webTablePage.getCourseNameWithPrice(priceName);
    }
}
