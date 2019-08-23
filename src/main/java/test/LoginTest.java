package test;

import model.UserFB;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.nio.file.Paths;

import static org.junit.Assert.*;

@RunWith(DataProviderRunner.class)
public class LoginTest extends TestBase {

    static {
        System.setProperty("webdriver.chrome.driver", Paths.get("").toAbsolutePath().toString() + "\\src\\main\\resources\\chromedriver-2.43.exe");
    }

    @Test
    @UseDataProvider(value = "validUser", location = DataProvider.class)
    public void validUserUserLogin(UserFB userFB) {
        app.loginUser(userFB);

        assertTrue(app.isLogged());
    }

    @Test
    @UseDataProvider(value = "invalidUser", location = DataProvider.class)
    public void invalidUserUserLogin(UserFB userFB) {
        app.loginUser(userFB);

        assertFalse(app.isLogged());
    }

}
