package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utills.CommonMethods;
import java.util.Set;

public class RahulWebsitePage extends CommonMethods {
    private WebDriver driver;
    private By openWindowbtn = By.xpath("//button[@id='openwindow']");

    public RahulWebsitePage(WebDriver driver) {
        this.driver = driver;
    }

    public void openUrl() {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
    }



    /**
     * Author - Shubham
     * This method return the title of new window
     */

    public void cickOnOpenWindowvtn(){
        driver.findElement(openWindowbtn).click();
    }
    public String newOpenWindowTitle(){
       String parenwindow = driver.getWindowHandle();
       Set<String> allWindow = driver.getWindowHandles();
       String actualTitle = null;
       for (String window : allWindow){
           if (!window.equals(parenwindow)){
               driver.switchTo().window(window);
               actualTitle = driver.getTitle();
               driver.close();
               break;
           }
       }

       driver.switchTo().window(parenwindow);
       return actualTitle;
    }
}
