package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utills.CommonMethods;

public class LoginPage extends CommonMethods {

   private WebDriver driver;

  /*@FindBy(xpath = "//input[@id='input-email']")
  WebElement userNameField;*/
    private By userNameField = By.xpath("//input[@id='input-email']");
    private By userPasswordField = By.xpath("//input[@id='input-password']");

    private By loginCta = By.xpath("//input[@class='btn btn-primary']");

    private By homePage = By.xpath("//h2[text()='My Account']");

   public LoginPage(WebDriver driver){

       this.driver = driver;
   }


   public void openUrl(){
      driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
   }


    public void enterUserName(String userName){
        driver.findElement(userNameField).sendKeys(userName);
    }



    public void enterUserPassword(String userPassword){
        driver.findElement(userPasswordField).sendKeys(userPassword);
    }



    public void clickOnSubmitButton()
    {
       driver.findElement(loginCta).click();
    }
    public String userIsOnHomePage(){
      return driver.findElement(homePage).getText();
    }


}
