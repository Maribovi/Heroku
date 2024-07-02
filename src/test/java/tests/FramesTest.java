package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;


public class FramesTest extends BaseTest {
    @Test
    public void frames() {
        framesPage.open();
        driver.findElement(By.xpath("//a[contains(text(), 'iFrame')]")).click();
        driver.switchTo().frame("mce_0_ifr");
        String text = driver.findElement(By.xpath("//*[text()='Your content goes here.']")).getText();
        assertEquals("Your content goes here.", text);
    }
}
