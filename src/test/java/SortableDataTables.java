import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class SortableDataTables extends BaseTest {
    @Test
    public void inputs() {
        driver.get("http://the-internet.herokuapp.com/tables");
        String box1 = driver.findElement(By.xpath("//table//tr[1]//td[1]")).getText();
        assertEquals("Smith", box1);

        String box2 = driver.findElement(By.xpath("(//table//tr[1]//td[4])[2]")).getText();
        assertEquals("$50.00", box2);

        String box3 = driver.findElement(By.xpath("(//table//tr[2]//td[3])[2]")).getText();
        assertEquals("fbach@yahoo.com", box3);

        String box4 = driver.findElement(By.xpath("//table//tr[4]//td[5]")).getText();
        assertEquals("http://www.timconway.com", box4);
    }
}
