import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductListingTest {

    public static void addtocart(String product_name) throws Exception {
        try {
            //click on particular button
            WebElement addtocart= Methods.driver.findElement(By.id(product_name));
            addtocart.click();
            Thread.sleep(3000);


        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void verifyTitle( String expectedresult) {
        String actualTitle = Methods.driver.getTitle();
        if (actualTitle.equals(expectedresult)) {
            System.out.println("Title Verification Passed");
        } else {
            System.out.println("Title Verification Failed");
        }


}}
