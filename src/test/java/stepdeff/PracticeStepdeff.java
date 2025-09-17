package stepdeff;

import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.RahulWebsitePage;

public class PracticeStepdeff {
    RahulWebsitePage rahulWebsitePage = new RahulWebsitePage(DriverFactory.driver);


    @Given("User on the practice home page")
    public void user_Is_On_Rahul_Website(){
        System.out.println("puppy dog");
        rahulWebsitePage.openUrl();
    }
    @When("user clicks on open window button")
    public void userClickOnOpenWindowvtn(){
        rahulWebsitePage.cickOnOpenWindowvtn();
    }
    @When("User validates new window title {string}")
    public void ValidatesNewOpenWindowTitle(String expectedTitle){
       String actualTiltle =  rahulWebsitePage.newOpenWindowTitle();
       Assert.assertEquals("childwindow title not found",expectedTitle,actualTiltle);
    }




}
