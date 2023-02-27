package Mudan_EnterPrises_LLC;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;


public class Items_Export_List extends Browser_Setup
{
    //static Actions Act = new Actions(driver);
    @FindBy(xpath = "//body/div[4]/div[1]/div[1]/div[3]/div[1]")
    static WebElement clicks_Items;
    @FindBy(css = "div.deployed-nav > div > div:nth-child(1)")
    static WebElement Items_List;
    @FindBy(css = "div.search-block-hide > div:nth-child(1) > div > div:nth-child(3) > button.md-flat.impExpBtn.ml-8-o.md-button.md-green-theme-theme.md-ink-ripple")
    static WebElement click_Export_Button;

    public static void Export_Items() throws InterruptedException
    {
        System.out.println("Items are Exported");
        Thread.sleep(5000);
        clicks_Items.click();
        //Act.moveToElement(clicks_Items).perform();
        Thread.sleep(3000);
        Items_List.click();
        Thread.sleep(4000);
        click_Export_Button.click();
    }

}
