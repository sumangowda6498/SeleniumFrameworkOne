package testcases;
//import io.github.bonigarcia.wdm.WebDriverManager;
import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class MyFirstTestcase extends BaseTest {

      @Test(dataProvider = "testdata")
    public void LoginTest(String username,String password) throws InterruptedException {
           System.out.println("MY FIRST TEST");
           //WebDriverManager.edgedriver().setup();

           driver.get("https://zoho.com/");//properties
          System.out.println(driver.getTitle());
           driver.findElement(By.linkText(loc.getProperty("sign_in_Link"))).click();//locators  --prperties
           Thread.sleep(2000);
           driver.findElement(By.id(loc.getProperty("email_field"))).sendKeys(username);
           driver.findElement(By.id(loc.getProperty("next_button"))).click();
           Thread.sleep(2000);
           driver.findElement(By.xpath(loc.getProperty("password_field"))).sendKeys(password);
           driver.findElement(By.xpath(loc.getProperty("login_next_button"))).click();
           Thread.sleep(2000);

       }

       @DataProvider(name = "testdata")
       public Object[][] tData(){
          return new Object[][]{
                  {"sumangowdaarbi@gmail.com","Supreem$1998"},
                  {"sumanagowdaarbi@gmail.com","Supreem$1998"}
          };
       }



    }

