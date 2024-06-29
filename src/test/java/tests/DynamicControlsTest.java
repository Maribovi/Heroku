package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;


public class DynamicControlsTest extends BaseTest {


    @Test
    public void dynamicControls() {
        dynamicControlsPage.open();
        Actions actions = new Actions(driver);
        WebElement buttonRemove = driver.findElement(By.xpath("//button[text()='Remove']"));
        actions.click(buttonRemove).perform();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#message")));
        boolean isElementPresent = !driver.findElements(By.xpath("//input[@type='checkbox']")).isEmpty();
    }
}
