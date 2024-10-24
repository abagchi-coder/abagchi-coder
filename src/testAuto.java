import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class testAuto {
    public static void main(String[] args) throws InterruptedException {

        //Instantiating chrome driver
        WebDriver driver = new ChromeDriver();

        //Opening web application
        driver.get("https://demoqa.com/books");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("login")));
        driver.findElement(By.id("login")).click();

        //Locating the username & password and passing the credentials
        driver.findElement(By.id("userName")).sendKeys("gunjankaushik");
        driver.findElement(By.id("password")).sendKeys("Password@123");

        //Click on the login button
        driver.findElement(By.id("login")).click();

        //Print the web page heading
            System.out.println("The page title is : " + driver.findElement(By.xpath("//*[@id=\"app\"]/header/a]")).getText());

        //Click on Logout button
        driver.findElement(By.id("submit")).click();

        //Close driver instance
        driver.quit();
    }
}
