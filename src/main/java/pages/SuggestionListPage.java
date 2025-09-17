package pages;

import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SuggestionListPage {
    private By sugesstionField = By.xpath("//input[@id='autocomplete']");
    private By listSuggestion = By.xpath("//ul[@id='ui-id-1']//li");

    WebDriver driver;
    public SuggestionListPage(WebDriver driver){
       this.driver =  driver;
    }
    public void enterInputSearchfield(String enterText){
        driver.findElement(sugesstionField).click();
        driver.findElement(sugesstionField).sendKeys(enterText);
       }
    public void selectIndiaFromSuggestionList(String enterText, String fullText){
        driver.findElement(sugesstionField).click();
        driver.findElement(sugesstionField).sendKeys(enterText);
       List<WebElement> suggesstionList = driver.findElements(listSuggestion);
       for (WebElement suggesstion :suggesstionList){
           if (suggesstion.getText().equals(fullText)){
               suggesstion.click();
               break;
           }
       }
    }

    public void selectArgentinaFromSuggestionList(String expectedText){
        List<WebElement> suggesstionList = driver.findElements(listSuggestion);
        for (WebElement suggesstion :suggesstionList){
            if (suggesstion.getText().equals(expectedText)){
                suggesstion.click();
                break;
            }
        }
    }
    }

