package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.InventoryPage;
import pages.LoginPage;
import static org.junit.jupiter.api.Assertions.*;

public class LoginTest {
    private WebDriver driver;
    private LoginPage loginPage;
    private InventoryPage inventoryPage;

    @BeforeEach
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Document\\Semester8\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        loginPage = new LoginPage(driver);
        inventoryPage = new InventoryPage(driver);

    }

    @Test
    public void testSuccessfulLogin() {
        driver.get("https://www.saucedemo.com/");
        loginPage.login("standard_user", "secret_sauce");
        assertEquals("https://www.saucedemo.com/inventory.html", driver.getCurrentUrl());
        // Add assertion to check login success
        assertTrue(driver.getCurrentUrl().contains("inventory"));
    }

    @Test
    public void testUnsuccessfulLogin() {
        driver.get("https://www.saucedemo.com/");
        loginPage.login("wrong_user", "wrong_password");
        // Ensure error message is visible
        String errorMessage = loginPage.getErrorMessage();
        assertTrue(errorMessage.contains("Epic sadface: Username and password do not match any user in this service"));
        // Check for error message
        assertEquals("Epic sadface: Username and password do not match any user in this service", errorMessage);
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
