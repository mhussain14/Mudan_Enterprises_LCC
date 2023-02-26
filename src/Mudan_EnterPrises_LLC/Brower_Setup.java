package Mudan_EnterPrises_LLC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ChromeDriver;


import java.util.concurrent.TimeUnit;

public class Brower_Setup
{
    static WebDriver driver;

    public static WebDriver Launch_Browser(WebDriver driver, String browser_Name, String Url)
    {
        if(browser_Name.equals("Firefox"))
        {
            System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
            driver = new FirefoxDriver();
            System.out.println("launched Firfoxe Driver");

        }
        else if(browser_Name.equals("chrome"))
        {
           //driver = new ChromeDriver();
        }
        else if(browser_Name.equals("IE"))
        {

        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

        driver.get(Url);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return driver;
    }
    public static void Quickbrowser()
    {
        driver.quit();
    }
}
