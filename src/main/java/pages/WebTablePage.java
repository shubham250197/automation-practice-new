package pages;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WebTablePage {

    private By webTable = By.xpath("(//table[@name='courses']//tr//th)[3]");
    WebDriver driver;


    public WebTablePage(WebDriver driver){
       this.driver= driver;
    }
    public void getCourseNameWithPrice(String priceName){
      List<WebElement> priceList = driver.findElements(By.xpath("//table[@id='product']//tr//th[text()='Price']//..//..//tr//td[3]"));
      priceList.size();
      for (int i =1; i<=9;i++){
          String price  = priceList.get(i).getText();
          if (price.equals(priceName)){
              String courseName = driver.findElement(By.xpath("(//table[@id='product']//tr//th[text()='Price']//..//..//tr)["+i+"]//td[2]")).getText();
              System.out.println(courseName);
          }
      }


    }
}
