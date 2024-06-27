import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class Hovers extends BaseTest {

    @Test
      public void hovers() {
        driver.get("http://the-internet.herokuapp.com/hovers");
        WebElement user1 = driver.findElement(By.xpath("(//img[@alt='User Avatar'])[1]"));
        user1.click();
        WebElement text1 = driver.findElements(By.tagName("h5")).get(0);
        String t1 = text1.getAttribute("innerText");
        assertEquals("name: user1", t1);
        driver.findElement(By.xpath("//a[@href='/users/1']")).click();
        String error = driver.findElement(By.tagName("h1")).getText();
        assertEquals("Страница не найдена, ошибка 404", error, "Not Found");

        driver.get("http://the-internet.herokuapp.com/hovers");
        WebElement user2 = driver.findElement(By.xpath("(//img[@alt='User Avatar'])[2]"));
        user2.click();
        WebElement text2 = driver.findElements(By.tagName("h5")).get(1);
        String t2 = text2.getAttribute("innerText");
        assertEquals ("name: user2", t2);
        driver.findElement(By.xpath("//a[@href='/users/2']")).click();
        String error2 = driver.findElement(By.tagName("h1")).getText();
        assertEquals("Страница не найдена, ошибка 404", error2, "Not Found");

        driver.get("http://the-internet.herokuapp.com/hovers");
        WebElement user3 = driver.findElement(By.xpath("(//img[@alt='User Avatar'])[3]"));
        user3.click();
        WebElement text3 = driver.findElements(By.tagName("h5")).get(2);
        String t3 = text3.getAttribute("innerText");
        assertEquals ("name: user3", t3);
        driver.findElement(By.xpath("//a[@href='/users/3']")).click();
        String error3 = driver.findElement(By.tagName("h1")).getText();
        assertEquals("Страница не найдена, ошибка 404", error3, "Not Found");
        }
      }
