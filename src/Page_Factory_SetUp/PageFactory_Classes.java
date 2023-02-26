package Page_Factory_SetUp;

import Mudan_EnterPrises_LLC.Brower_Setup;
import Mudan_EnterPrises_LLC.LoginToMudan;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//import test.java.APITesting.GET_Request;

public class PageFactory_Classes
{
    static WebDriver driver;
    static Brower_Setup brow = new Brower_Setup();
    static LoginToMudan log = new LoginToMudan();
    @BeforeTest
    public static void SetUp() throws InterruptedException
    {
        driver = Brower_Setup.Launch_Browser(driver,"Firefox", "https://loyverse.com/en/login");

    }
    @Test
    public static void Login_To_Mudan() throws InterruptedException
    {
        Thread.sleep(3000);
        //LoginToMudan signIn = PageFactory.initElements(driver, LoginToMudan.class);
       // signIn.Login_Mudan("usrZaveen","zaveen123");
        //signIn.login_To_Mudan();
        Mudan_EnterPrises_LLC.LoginToMudan Sign = PageFactory.initElements(driver,LoginToMudan.class);
        Sign.login_To_Mudan();

    }
    @Test
    public static void SubscribersDetail() throws InterruptedException
    {
        Thread.sleep(3000);

    }
    @Test
    public static void SignOut() throws InterruptedException
    {

    }
    public static void Interpreters()
    {
    }
    @Test
    public static void API_Testing()
    {
       // GET_Request APITest = PageFactory.initElements(driver, GET_Request.class);

    }

    //@AfterTest
    public static void tearDwon()
    {
        Brower_Setup.Quickbrowser();
    }
}
