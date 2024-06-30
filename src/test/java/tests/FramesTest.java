package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class FramesTest extends BaseTest {
    @Test
    public void frames() {
        framesPage.open();
        Actions actions = new Actions(driver);
        WebElement iFrame = driver.findElement(By.xpath("//a[contains(text(), 'iFrame')]"));
        actions.moveToElement(iFrame).click().perform();
        WebElement quit = driver.findElement(By.cssSelector("[aria-label=Close]"));
        actions.moveToElement(quit).click().perform();
        String text = driver.findElement(By.xpath("//*[text()='Your content goes here.']")).getAttribute("value");
        assertEquals("Your content goes here.", text);
    }
}
