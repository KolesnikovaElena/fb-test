package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Page {

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void openLoginPage() {
        driver.get("https://www.facebook.com/login");
    }

    @FindBy(name = "email")
    public WebElement emailInput;

    @FindBy(name = "pass")
    public WebElement passwordInput;

    @FindBy(id = "loginbutton")
    public WebElement loginbutton;


}
