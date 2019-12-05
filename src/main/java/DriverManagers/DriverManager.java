package DriverManagers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverManager {
    private DriverManager(){

    }

    private static WebDriver driver;

    public static WebDriver getDriver(){
        if (driver == null){
            WebDriverManager.chromedriver().setup();
            driver = new org.openqa.selenium.chrome.ChromeDriver();
        }
        return driver;
    }
   public static WebDriverWait wait = new WebDriverWait(getDriver(), 10);
//    public static void openChromeAndFollowURL(String url) {
//
//
//        driver.get(url);

 //       ThreadLocal <WebDriver> thrDrv = new ThreadLocal<WebDriver>();
//    thrDv: set(WebDriver drv)
//        get()
//            remove()

}
