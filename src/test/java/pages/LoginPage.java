package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage{

    WebDriver driver;

    private final By USERNAME_INPUT = By.name("user-name");
    private final By PASSWORD_INPUT = By.name("password");
    private final By LOGIN_BUTTON = By.id("login-button");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://www.saucedemo.com");
    }

    public void login(String user, String password) {
        driver.findElement(By.name("user-name")).sendKeys(user);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).submit();
    }
    public String getErrorMessage () {
        String error = driver.findElement(By.cssSelector("[data-test='error']")).getText();
        return error;
    }
}
