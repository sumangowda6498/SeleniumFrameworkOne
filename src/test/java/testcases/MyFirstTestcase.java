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
import org.testng.annotations.Test;


public class MyFirstTestcase extends BaseTest {

      @Test
    public void LoginTest() throws InterruptedException {
           System.out.println("MY FIRST TEST");
           //WebDriverManager.edgedriver().setup();

           driver.get("https://zoho.com/");//properties
          System.out.println(driver.getTitle());
           driver.findElement(By.linkText("Sign In")).click();//locators  --prperties
           Thread.sleep(2000);
           driver.findElement(By.xpath("//*[@id=\"login_id\"]")).sendKeys("sumangowdaarbi@gmail.com");
           driver.findElement(By.id("nextbtn")).click();
           Thread.sleep(2000);
           driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Supreem$1998");
           driver.findElement(By.xpath("//*[@id=\"nextbtn\"]")).click();


       }



    }

