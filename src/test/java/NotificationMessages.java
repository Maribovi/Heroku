import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class NotificationMessages extends BaseTest {
    @Test
    public void notificationMassages() {
        driver.get("http://the-internet.herokuapp.com/notification_message_rendered");
        driver.findElement(By.xpath("//a[@href='/notification_message']")).click();
        String notification = driver.findElement(By.id("flash")).getText();
        assertEquals("Action successful ×", notification.trim());
    }
}
