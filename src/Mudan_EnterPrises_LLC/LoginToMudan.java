package Mudan_EnterPrises_LLC;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginToMudan extends Browser_Setup
{
    @FindBy(xpath = "//h1[contains(text(),'Sign in to your Loyverse account')]")
    static  WebElement GetTitle ;
    @FindBy(xpath="//div[@ class = \"mat-form-field-infix ng-tns-c71-2\"]//input[@ id = \"mat-input-0\"]")
    static WebElement UserName;
    @FindBy(xpath="//div[@ class = \"mat-form-field-infix ng-tns-c71-3\"]//input[@ id = \"mat-input-1\"]")
    static WebElement Password;
    @FindBy(xpath = "//div[@ class = \"login-form-buttons buttons-block\"]//button[@ type = \"submit\"]")
    static WebElement Submit;

    public static String getLoginTitle()
    {
        return GetTitle.getText();
    }
    public static void login_To_Mudan()
    {
        System.out.println("Login to System");
        /*String appTitle = driver.getTitle();
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
