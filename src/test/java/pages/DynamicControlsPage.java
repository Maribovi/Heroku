package pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebDriver;

      public class DynamicControlsPage {
        WebDriver driver;

        public DynamicControlsPage(WebDriver driver) {
            this.driver = driver;
        }
        public void open() {
            driver.get("http://the-internet.herokuapp.com/dynamic_controls");
        }
    }
