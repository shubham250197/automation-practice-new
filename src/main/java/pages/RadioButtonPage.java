package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utills.CommonMethods;

public class RadioButtonPage extends CommonMethods {

    private By secondRadioButton = By.xpath("(//input[@class='radioButton'])[2]");
    private By firstRadioButton = By.xpath("(//input[@class='radioButton'])[1]");
    private By thirdRadioButton = By.xpath("(//input[@class='radioButton'])[3]");

    WebDriver driver;
    public RadioButtonPage(WebDriver driver){
      this.driver = driver;
    }

    public void clickOnSecondRadioButton(){
        driver.findElement(secondRadioButton).click();
    }
    public boolean radioButtonIsSelected(){

        return driver.findElement(secondRadioButton).isSelected();
    }

    public void clickOnFirstRadioButton(){
        driver.findElement(firstRadioButton).click();
    }

    public boolean firstRadioButtonIsSelected(){
         return driver.findElement(firstRadioButton).isSelected();
    }
    public void clickOnThirdRadioButton(){
        driver.findElement(thirdRadioButton).click();
    }
    public boolean thirdRadioButtonIsSelected(){
       return driver.findElement(thirdRadioButton).isSelected();
    }

}
