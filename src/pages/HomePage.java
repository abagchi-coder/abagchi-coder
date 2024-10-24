package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage   {
    WebDriver driver;

    //Constructor that will be automatically called as soon as the object of the class is created
    public HomePage(WebDriver driver) {
        this.driver=driver;
    }

    //Locator for login button
    By LoginBtn = By.id("login");

    //Method to click login button
    public void clickLogin() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("login")));
        driver.findElement(LoginBtn).click();
    }
}
