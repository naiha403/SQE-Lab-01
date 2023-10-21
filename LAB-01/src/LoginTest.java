import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginTest {
    public static void initiateWebSession(String path)
    {
try {
    System.setProperty("webdriver.chrome.driver", path);
    ChromeOptions  chromeOptions=new ChromeOptions();
    chromeOptions.addArguments("--remote-allow-origins=*");
    WebDriver driver = new ChromeDriver(chromeOptions);
    Methods.driver = driver;

    driver.manage().window().maximize();
}
catch (Exception e)
{
    System.out.println(e);
}
    }

    public static void navigateToURL( String url) {
        try{
            Methods.driver.get(url);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }





    public static void waitForTime(int ns) throws Exception {
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    public static void verifyTitle(String expectedTitle) throws Exception {
        try {
            String actualTitle = Methods.driver.getTitle();

            if (actualTitle.equals(expectedTitle)) {
                System.out.println(
                        "Title Verification Passed:\n" +
                                "Expected Title: " + expectedTitle + "\n" +
                                "Actual Title: " + actualTitle
                );
            } else {
                System.out.println(
                        "Title Verification Failed:\n" +
                                "Expected Title: " + expectedTitle + "\n" +
                                "Actual Title: " + actualTitle
                );
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void enterText(String identifier, String TestData) throws Exception {
        try {
            WebElement userTextBox = Methods.driver.findElement(By.id(identifier));
            userTextBox.sendKeys(TestData);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void clickElement(String identifier) throws Exception {
        try {
            //click on particular button
            WebElement loginButton = Methods.driver.findElement(By.id("login-button"));
            loginButton.click();

        } catch (Exception e) {
            System.out.println(e);
        }
    }


    public static void verifyElementExpectedText(String identifier, String expectedResult) throws Exception {
        try {
            //Result
            WebElement title = Methods.driver.findElement(By.xpath(Methods.xPath));
            String actualResult = title.getText();

            if (actualResult.equals(expectedResult)) {
                System.out.println(
                        "Title Verification Passed:\n" +
                                "Expected Result: " + expectedResult + "\n" +
                                "Actual Result: " + actualResult
                );
            } else {
                System.out.println(
                        "Title Verification Failed:\n" +
                                "Expected Result: " + expectedResult + "\n" +
                                "Actual Result: " + actualResult
                );
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }


}
