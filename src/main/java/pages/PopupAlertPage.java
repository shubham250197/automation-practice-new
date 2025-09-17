package pages;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utills.CommonMethods;

public class PopupAlertPage extends CommonMethods {

    private By fieldText = By.xpath("//input[@id='name']");
    WebDriver driver;
    public PopupAlertPage(WebDriver driver){
      this.driver = driver;
    }
    public void enterTextField(String name){
        clickOn(fieldText);
        enterText(fieldText,name);
        //driver.findElement(By.xpath("")).sendKeys("ff");



    }

}
