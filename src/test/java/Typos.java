import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class Typos extends BaseTest {

    @Test
    public void typos() {
        driver.get("http://the-internet.herokuapp.com/typos");
        WebElement text1 = driver.findElements(By.tagName("p")).get(0);
        String t1 = text1.getAttribute("innerText");
        assertEquals ("This example demonstrates a typo being introduced. It does it randomly on each page load.", t1);

        WebElement text2 = driver.findElements(By.tagName("p")).get(1);
        String t2 = text2.getAttribute("innerText");
        assertEquals ("Sometimes you'll see a typo, other times you won't.", t2);
    }
}
