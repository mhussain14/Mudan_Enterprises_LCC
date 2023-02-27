package Page_Factory_SetUp;

import Mudan_EnterPrises_LLC.Browser_Setup;
import Mudan_EnterPrises_LLC.Items_Export_List;
import Mudan_EnterPrises_LLC.LoginToMudan;
import Mudan_EnterPrises_LLC.Make_Purchase_Order;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//import test.java.APITesting.GET_Request;

public class PageFactory_Classes
{
    static WebDriver driver;
    @BeforeTest
    public static void SetUp() throws InterruptedException
    {
        driver = Browser_Setup.Launch_Browser(driver,"Firefox", "https://loyverse.com/en/login");
        Thread.sleep(3000);
        PageFactory_Classes.Login_To_Mudan();
        System.out.println("User Logged In");
    }
    public static void Login_To_Mudan() throws InterruptedException
    {
        Thread.sleep(3000);
        Mudan_EnterPrises_LLC.LoginToMudan Sign = PageFactory.initElements(driver,LoginToMudan.class);
        Sign.getLoginTitle();
        Sign.login_To_Mudan();
    }
    //@Test
    public static void Export_Items_Into_CSV() throws InterruptedException
    {
        Thread.sleep(3000);
        Items_Export_List Expo = PageFactory.initElements(driver, Items_Export_List.class);
        Expo.Export_Items();
    }
    @Test
    public static void MakeNewPurchaseOrder() throws InterruptedException
    {
        Thread.sleep(5000);
        Mudan_EnterPrises_LLC.Make_Purchase_Order MakPo = PageFactory.initElements(driver, Make_Purchase_Order.class);
        MakPo.Purchase_Order();
    }
    @Test
    public static void API_Testing()
    {
       // GET_Request APITest = PageFactory.initElements(driver, GET_Request.class);

    }
    //@AfterTest
    public static void tearDown()
    {
        Browser_Setup.Quickbrowser();
    }
}
