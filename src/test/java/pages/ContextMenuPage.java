package pages;
import org.openqa.selenium.WebDriver;

public class ContextMenuPage {
    WebDriver driver;

    public ContextMenuPage(WebDriver driver) {
        this.driver = driver;
    }
    public void open() {
        driver.get("http://the-internet.herokuapp.com/context_menu");
    }
}
