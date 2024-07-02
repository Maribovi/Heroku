package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.*;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    WebDriver driver;
    ContextMenuPage contextMenuPage;
    DynamicControlsPage dynamicControlsPage;
    FramesPage framesPage;
    LoginPage loginPage;
    ProductsPage productsPage;

    @BeforeMethod
    public void setup(){
        WebDriverManager.edgedriver().setup();
        EdgeOptions options = new EdgeOptions();
        options.addArguments("start-maximized");
        driver = new EdgeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        contextMenuPage = new ContextMenuPage(driver);
        dynamicControlsPage = new DynamicControlsPage(driver);
        framesPage = new FramesPage(driver);
        loginPage = new LoginPage(driver);
        productsPage = new ProductsPage(driver);
    }

      @AfterMethod(alwaysRun = true)
      public void close () {
      driver.quit();
   }
}
