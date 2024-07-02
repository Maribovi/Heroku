package pages;
import org.openqa.selenium.WebDriver;

public class ContextMenuPage extends BasePage{


    public ContextMenuPage(WebDriver driver) {
        super(driver);
    }
    public void open() {
        driver.get("http://the-internet.herokuapp.com/context_menu");
    }
}
