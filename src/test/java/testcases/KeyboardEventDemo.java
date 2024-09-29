package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardEventDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello world!");
        System.setProperty("webdriver.edge.driver","C:/Users/suman/IdeaProjects/SeleniumFramework/resources/msedgedriver.exe");
        WebDriver driver= new EdgeDriver();
        driver.manage().window().maximize(); //manage: get the option interface

        driver.get("https://extendsclass.com/text-compare.html");
        WebElement sourcetextarea= driver.findElement(By.xpath("//*[@id=\"dropZone\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[8]/pre/span"));
        Actions actions=new Actions(driver);
        Thread.sleep(2000);
        actions.keyDown(sourcetextarea, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();

        WebElement destinationtextarea=driver.findElement(By.xpath("//*[@id=\"dropZone2\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[6]/pre"));
        Thread.sleep(2000);
        actions.keyDown(destinationtextarea,Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();



    }
}