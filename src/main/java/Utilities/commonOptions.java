package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class commonOptions extends base{

    public void initBrowser(String browserType){
        if(browserType.equalsIgnoreCase("chrome"))
            driver = initChromeDriver();
        else if(browserType.equalsIgnoreCase("firefox"))
            driver = initFFDriver();
        else
            throw new RuntimeException(("Invalid platform browser name"));
        driver.manage().window();
        driver.get("https://www.amazon.com/");

    }

    public static WebDriver initChromeDriver(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        return driver;
    }

    public static WebDriver initFFDriver(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        return driver;
    }


    @BeforeClass
    public void startSession() {
        String platform = "web";
        if (platform.equalsIgnoreCase("web"))
            initBrowser("chrome");
            // else if (platform.equalsIgnoreCase("mobile"))
            //      initMobile();
        else
            throw new RuntimeException(("Invalid platform browser name"));
        managePages.init();
    }


    @AfterClass
    public void closeSession(){
        //driver.quit();
    }

}
