package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownPage {

    private By dropDownpath = By.xpath("//select[@id='dropdown-class-example']");
    //private By dropDownpath = By.xpath("//option[text()='Option2']");

    WebDriver driver;
    public DropDownPage(WebDriver driver){
      this.driver = driver;
    }

    public void userSelectSecondoption(String option){
        //driver.findElement(dropDownpath).click();
       WebElement dropdown =  driver.findElement(dropDownpath);
        Select select = new Select(dropdown);
        select.selectByVisibleText(option);
    }
    public void userSelectFirstoption(String option1){
       WebElement element =  driver.findElement(dropDownpath);
       Select select = new Select(element);
       select.selectByVisibleText(option1);
    }


}
