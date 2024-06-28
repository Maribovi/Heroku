import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Optional;

import static org.openqa.selenium.By.*;
import static org.openqa.selenium.Keys.ARROW_UP;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class Inputs extends BaseTest {

    @Test
    public void inputs() {
        driver.get("http://the-internet.herokuapp.com/inputs");
        driver.findElement(By.xpath("//input[@type='number']")).sendKeys(Keys.ARROW_DOWN);
        String number1 = driver.findElement(By.xpath("//input[@type='number']")).getAttribute("value");
        assertEquals("-1", number1);

        driver.findElement(By.xpath("//input[@type='number']")).sendKeys(Keys.ARROW_UP);
        driver.findElement(By.xpath("//input[@type='number']")).sendKeys(Keys.ARROW_UP);
        String number2 = driver.findElement(By.xpath("//input[@type='number']")).getAttribute("value");
        assertEquals("1", number2);

        driver.get("http://the-internet.herokuapp.com/inputs");
        driver.findElement(By.xpath("//input[@type='number']")).sendKeys("adaacscs");
        String number3 = driver.findElement(By.xpath("//input[@type='number']")).getAttribute("value");
        assertEquals("", number3);

        driver.get("http://the-internet.herokuapp.com/inputs");
        driver.findElement(By.xpath("//input[@type='number']")).sendKeys("@");
        String number4 = driver.findElement(By.xpath("//input[@type='number']")).getAttribute("value");
        assertEquals("", number4);

        driver.get("http://the-internet.herokuapp.com/inputs");
        driver.findElement(By.xpath("//input[@type='number']")).sendKeys("213124");
        String number5 = driver.findElement(By.xpath("//input[@type='number']")).getAttribute("value");
        assertEquals("213124", number5);
    }
}
