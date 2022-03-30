package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class commonOperations extends base{



   public void initBrowser(String browserType){
       if(browserType.equalsIgnoreCase("chrome"))
           driver = initChromeDriver();
       else if(browserType.equalsIgnoreCase("firefox"))
           driver = initFireFoxFDriver();

       else if(browserType.equalsIgnoreCase("edge"))
           driver = initEdgeDriver();

       else
           throw new RuntimeException(("Invalid platform browser name"));
       driver.manage().window();  //    driver.manage().window().maximize();
       driver.get("https://www.amazon.com/ref=nav_logo");
       driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       wait = new WebDriverWait(driver , 5 );
       actions = new Actions(driver);
   }

   public static WebDriver initChromeDriver(){
      WebDriverManager.chromedriver().setup();
      WebDriver driver = new ChromeDriver();
      return driver;
  }
   public static WebDriver initFireFoxFDriver(){
       WebDriverManager.firefoxdriver().setup();
       WebDriver driver = new FirefoxDriver();
       return driver;
   }

    public static WebDriver initEdgeDriver(){
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
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
