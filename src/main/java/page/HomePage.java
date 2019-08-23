package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends Page {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage open() {
        driver.get("https://www.facebook.com/");
        return this;
    }

    public boolean isOnThisPage() {
        return driver.findElements(By.id("userNav")).size() > 0;
    }
}
