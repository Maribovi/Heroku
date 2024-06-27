import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class Checkboxes extends BaseTest {

    @Test
        public void checkboxes () {
        driver.get("http://the-internet.herokuapp.com/checkboxes");

        WebElement checkbox1 = driver.findElement(By.cssSelector("form input:first-child"));
        boolean firstCheckboxIsUnchecked = true;
            if (checkbox1.isSelected()) {
                firstCheckboxIsUnchecked = false;
            }
            assertTrue(firstCheckboxIsUnchecked);

            checkbox1.click();

        boolean firstCheckboxIsСhecked = false;
        if (checkbox1.isSelected()) {
            firstCheckboxIsСhecked = true;
        }
        assertTrue(firstCheckboxIsСhecked);

        WebElement checkbox2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
         boolean secondCheckboxIsChecked = false;
         if (checkbox2.isSelected()) {
           secondCheckboxIsChecked = true;
        }
        assertTrue(secondCheckboxIsChecked);

        checkbox2.click();

        boolean secondCheckboxIsUnchecked = true;
        if (checkbox2.isSelected()) {
            secondCheckboxIsUnchecked = false;
        }
        assertTrue(secondCheckboxIsUnchecked);

    }

}
