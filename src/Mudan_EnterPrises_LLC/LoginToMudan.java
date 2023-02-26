package Mudan_EnterPrises_LLC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.concurrent.TimeUnit;

public class LoginToMudan extends Brower_Setup
{

    @FindBy(xpath="//div[@ class = \"mat-form-field-infix ng-tns-c71-2\"]//input[@ id = \"mat-input-0\"]")
    static WebElement UserName;
    @FindBy(xpath="//div[@ class = \"mat-form-field-infix ng-tns-c71-3\"]//input[@ id = \"mat-input-1\"]")
    static WebElement Password;
    @FindBy(xpath = "//div[@ class = \"login-form-buttons buttons-block\"]//button[@ type = \"submit\"]")
    static WebElement Submit;
    public static void login_To_Mudan()
    {
        System.out.println("Login to System");
        /*String appTitle;
        appTitle = driver.getTitle();
        String expTitle ="Sign in to your Loyverse Back Office - Login";
        if (appTitle.equals(expTitle))
        {
            System.out.println("Title Verified");
        }
        else
        {
            System.out.println("Title Not Match");
        }*/
        UserName.sendKeys("enterprisemakeithappen+testing@gmail.com");
        Password.sendKeys("Testing31@");
        Submit.click();
    }
}
