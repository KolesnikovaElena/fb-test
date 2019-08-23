package app;

import model.UserFB;
import page.HomePage;
import page.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Application {

    private WebDriver driver;

    private LoginPage loginPage;

    public Application() {
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();

        this.loginPage = new LoginPage(driver);
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public void quit() {
        driver.quit();
    }

    public void loginUser(UserFB userFB) {
        loginPage.openLoginPage();
        loginPage.emailInput.sendKeys(userFB.getEmail());
        loginPage.passwordInput.sendKeys(userFB.getPassword());
        loginPage.loginbutton.click();
    }

    public boolean isLogged() {
        return new HomePage(driver).isOnThisPage();
    }

}
