package pages;

import org.openqa.selenium.WebDriver;

public class FramesPage extends BasePage {

        public FramesPage(WebDriver driver) {
            super(driver);
        }
        public void open() {
            driver.get("http://the-internet.herokuapp.com/frames");
        }
    }
