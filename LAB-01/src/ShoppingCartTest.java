import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCartTest {
    public static void cart(String xpath) throws Exception {
        try {
            //click on particular button
            WebElement cart=Methods.driver.findElement(By.xpath(xpath));
            cart.click();
            Thread.sleep(3000);


        } catch (Exception e) {
            System.out.println(e);
        }
    }


}
