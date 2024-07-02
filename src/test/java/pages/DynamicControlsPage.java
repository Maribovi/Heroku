package pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebDriver;

      public class DynamicControlsPage extends BasePage{


        public DynamicControlsPage(WebDriver driver) {
            super(driver);
        }
        public void open() {
            driver.get("http://the-internet.herokuapp.com/dynamic_controls");
        }
    }
