package pages;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverPage {
    WebDriver driver;

    private By mouseHove = By.xpath("//button[text()='Mouse Hover']");
    private By topButton = By.xpath("(//div[@class='mouse-hover-content']//a)[1]");
    public MouseHoverPage(WebDriver driver){
       this.driver = driver;
    }
    public void hoverOnOverMouseHover(){
       WebElement mouseMovement =  driver.findElement(mouseHove);
        Actions actions = new Actions(driver);
        actions.moveToElement(mouseMovement).perform();
    }
    public void userMoveToTopPage(){
        driver.findElement(topButton).click();
    }
}
