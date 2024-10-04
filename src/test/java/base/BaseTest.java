package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class BaseTest {

    public static WebDriver driver;
    public static Properties prop=new Properties();
    public static FileReader fr;

    @BeforeTest
    public void setup() throws IOException, InterruptedException {
        if(driver==null){
            System.out.println("The path is "+System.getProperty("user.dir"));
            FileReader fr=new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configfile\\config.properties");
            prop.load(fr);
        }

        if(prop.getProperty("browser").equalsIgnoreCase("Edge")){
            System.setProperty("webdriver.edge.driver","resources/msedgedriver.exe");//base
            driver= new EdgeDriver();//base
            driver.manage().window().maximize();
            driver.get(prop.getProperty("testurl"));
            Thread.sleep(3000);
      }
//        else if (prop.getProperty("browser").equalsIgnoreCase("chrome")){
//            WebDriverManager.chromedriver().setup();
//            driver=new ChromeDriver();
//            driver.manage().window().maximize();
//            driver.get(prop.getProperty("browser"));
//        }

    }

    @AfterTest
    public void teardown(){
        //driver.close();
        System.out.println(" TEAR down successful");
    }
}
