package stepdeff;

import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.SuggestionListPage;

public class SuggestionList {

    SuggestionListPage suggestionListPage =  new SuggestionListPage(DriverFactory.driver);

    @When("User enter the input in search field {string}")
    public void UserEnterInputSearchfield(String enterText){
        suggestionListPage.enterInputSearchfield(enterText);
    }
    @And("User select the india from sugesstion list {string}")
    public void UserSelecArgentinaFromSuggestionList(String expectedText){
        suggestionListPage.selectArgentinaFromSuggestionList(expectedText);
    }

    @And("User search with {string} and select {string} in suggestion list")
    public void UserSelectIndiaFromSuggestionList(String enterText, String fullText){
        suggestionListPage.selectIndiaFromSuggestionList(enterText,fullText);
    }

}
