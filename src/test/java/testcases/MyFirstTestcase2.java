package testcases;
//import io.github.bonigarcia.wdm.WebDriverManager;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utilities.ReadXLSdata;


public class MyFirstTestcase2 extends BaseTest {

      @Test(dataProviderClass = ReadXLSdata.class,dataProvider = "sampledata")
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



    }

