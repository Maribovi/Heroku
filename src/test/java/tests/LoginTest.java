package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class LoginTest extends BaseTest {



    @DataProvider()
    public Object[][] loginData(){
        return new Object[][]{
                        {"", "secret_sauce", "Epic sadface: Username is required"},
                        {"standard_user", "secret", "Epic sadface: Username and password do not match any user in this service"},
                        {"locked_out_user", "secret_sauce", "Epic sadface: Sorry, this user has been locked out."}
                };
        }

        @Test(dataProvider = "loginData")
        public void falseLogin (String user, String password, String expectedError) {
            loginPage.open();
            loginPage.login(user, password);
            assertEquals(loginPage.getErrorMessage(),expectedError);
        }

    @Test(dataProvider = "loginData")
    public void correctLogin () {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        assertEquals(productsPage.getTitle(), "Products");
    }
}
