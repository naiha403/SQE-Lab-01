import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.Zip;

public class Methods {
    public static String printOfStatement = "2nd Simple(Methods) Automation";
    public static String URL = "https://www.saucedemo.com/";
    public static String expectedTitle = "Swag Labs";
    public static String username = "standard_user";
    public static String userId = "user-name";
    public static String password = "secret_sauce";
    public static String passwordId = "password";
    public static String loginButtonId = "login-Button";
    public static int time = 2000;
    public static String expectedResult = "Products";
    public static String xPath = "//span[@class='title']";
    public static WebDriver driver;

    public static void main(String[] args) throws Exception {
        System.out.println(printOfStatement);

        LoginTest.initiateWebSession("src/Driver/chromedriver.exe");
        LoginTest.navigateToURL(URL);
        LoginTest.waitForTime(time);
        LoginTest.verifyTitle(expectedTitle);
        LoginTest.enterText(userId, username);
        LoginTest.enterText(passwordId, password);
        LoginTest.clickElement(loginButtonId);
        ProductListingTest.addtocart("add-to-cart-sauce-labs-backpack");
        ShoppingCartTest.cart("//a[@class='shopping_cart_link']");
        LoginTest.verifyElementExpectedText(loginButtonId, expectedResult);
        LoginTest.waitForTime(time);
        CheckoutTest.checkout("checkout");
        CheckoutTest.FirstName("Javeria");
        CheckoutTest.LastName("Athar");
        CheckoutTest.zip("75300");
        CheckoutTest.Continue("continue");
        CheckoutTest.Finish("finish");

    }


}