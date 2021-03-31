package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;

public class CommonOps extends Base {

    public void initBrowser(String browserType){
        if (browserType.equalsIgnoreCase("chrome")) {
            driver = initChromeDriver();
        }
        else if (browserType.equalsIgnoreCase("firefox")||(browserType.equalsIgnoreCase("ff"))) {
            driver = initFirefoxDriver();
        }
        else if (browserType.equalsIgnoreCase("internet explorer")||(browserType.equalsIgnoreCase("ie"))) {
            driver = initIEDriver();
        }
        else
            throw new RuntimeException("Invalid Browser Type");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 5);
        driver.get("http://localhost:3000/");
        ManagePages.initGrafana();
        action = new Actions(driver);
    }

    public static WebDriver initChromeDriver(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        return driver;
    }

    public static WebDriver initFirefoxDriver(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        return driver;
    }

    public static WebDriver initIEDriver(){
        WebDriverManager.iedriver().setup();
        WebDriver driver = new InternetExplorerDriver();
        return driver;
    }


    @BeforeClass
    public void startSession(){
        String platform = "web";
        if (platform.equalsIgnoreCase("web")){
            initBrowser("chrome");
        }
        else if (platform.equalsIgnoreCase("mobile")) {
            //initMobile();
        }
        else
            throw new RuntimeException("Invalid platform name");
    }



    @AfterClass
    public void closeSession(){
        //driver.quit();
    }

    @AfterMethod
    public void afterMethod(){
        driver.get("http://localhost:3000/");
    }

}
