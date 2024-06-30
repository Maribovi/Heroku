package pages;

import org.openqa.selenium.WebDriver;

public class FramesPage {
        WebDriver driver;
        public FramesPage(WebDriver driver) {
            this.driver = driver;
        }
        public void open() {
            driver.get("http://the-internet.herokuapp.com/frames");
        }
    }
