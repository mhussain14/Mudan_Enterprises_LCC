package Mudan_EnterPrises_LLC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Make_Purchase_Order extends Browser_Setup
{
    //static Actions Act = new Actions(driver);
    @FindBy(xpath = "//body/div[4]/div[1]/div[1]/div[4]/div[1]")
    static WebElement clicks_Inventory;
    @FindBy(xpath = "//body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1])")
    static WebElement P_O;
    @FindBy(xpath = "//div[contains(text(),'Add purchase order')]")
    static WebElement New_PO;
    //static By inventory = By.xpath("//body/div[4]/div[1]/div[1]/div[4]/div[1]");

    public static void Purchase_Order() throws InterruptedException
    {
        System.out.println("Items are Exported");
        Thread.sleep(5000);
       /// driver.findElement(inventory).click();
        clicks_Inventory.click();
        //Act.moveToElement(clicks_Items).perform();
        Thread.sleep(3000);
        P_O.click();
        Thread.sleep(4000);
        New_PO.click();
    }
}
