import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.event.MouseWheelEvent;

public class CheckoutTest {
    public static void checkout(String checkout) throws Exception {
        try {
            //click on particular button
            WebElement chechout= Methods.driver.findElement(By.id(checkout));
            chechout.click();
            Thread.sleep(3000);


        } catch (Exception e) {
            System.out.println(e);
        }
    }



    public static void FirstName( String identifier) throws Exception {
        try {
            WebElement firstname = Methods.driver.findElement(By.id("first-name"));
            firstname.sendKeys(identifier);


        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void LastName(String identifier ) throws Exception {
        try {
            WebElement lastname = Methods.driver.findElement(By.id("last-name"));
            lastname.sendKeys(identifier);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void zip(String identifier) throws Exception {
        try {
            WebElement zip = Methods.driver.findElement(By.id("postal-code"));
            zip.sendKeys(identifier);
            Thread.sleep(3000);

        } catch (Exception e) {
            System.out.println(e);
        }
    }


    public static void Continue(String ontinue) throws Exception {
        try {
            //click on particular button
            WebElement Continue= Methods.driver.findElement(By.id(ontinue));
            Continue.click();
            Thread.sleep(3000);


        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void Finish(String inish) throws Exception {
        try {
            //click on particular button
            WebElement finish= Methods.driver.findElement(By.id(inish));
            finish.click();
            Thread.sleep(3000);


        } catch (Exception e) {
            System.out.println(e);
        }
    }


}
