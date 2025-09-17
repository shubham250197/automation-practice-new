package utills;

import factory.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommonMethods {


    public void wait1(int pause){
        try {
            pause= pause*1000;
            Thread.sleep(pause);
        } catch (Exception e) {
            System.out.println("Expection is catched for wait method");
        }

    }
    public void clickOn(By clickElement){
        DriverFactory.driver.findElement(clickElement).click();
    }
    public void clearText(By clearElement){
        DriverFactory.driver.findElement(clearElement).clear();
    }
    public void enterText(By textWebElement, String textEntered){
        DriverFactory.driver.findElement(textWebElement).sendKeys(textEntered);
    }





}
