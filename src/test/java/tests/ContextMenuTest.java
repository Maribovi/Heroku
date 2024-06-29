package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ContextMenuTest extends BaseTest {

    @Test
    public void contextMenu() {
     contextMenuPage.open();
        Actions actions = new Actions(driver);
        WebElement elementLocator = driver.findElement(By.id("hot-spot"));
        actions.contextClick(elementLocator).perform();
        String alertText = driver.switchTo().alert().getText();
        assertEquals("You selected a context menu", alertText);
        driver.switchTo().alert().accept();
    }
}

